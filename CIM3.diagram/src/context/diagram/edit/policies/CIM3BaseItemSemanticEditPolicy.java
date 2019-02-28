package context.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;

import context.Causal;
import context.Characterization;
import context.Conflict;
import context.ContextElement;
import context.ContextModel;
import context.ContextSource;
import context.Derived;
import context.Entity;
import context.Focus;
import context.Parallel;
import context.Profiled;
import context.Refinement;
import context.Relationship;
import context.Relevance;
import context.Sensed;
import context.Static;
import context.Support;
import context.TimeConstraint;
import context.Validity;
import context.diagram.part.CIM3DiagramEditorPlugin;
import context.diagram.part.CIM3VisualIDRegistry;
import context.diagram.providers.CIM3ElementTypes;

/**
 * @generated
 */
public class CIM3BaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	* Extended request data key to hold editpart visual id.
	* @generated
	*/
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	* @generated
	*/
	private final IElementType myElementType;

	/**
	* @generated
	*/
	protected CIM3BaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	* Extended request data key to hold editpart visual id.
	* Add visual id of edited editpart to extended data of the request
	* so command switch can decide what kind of diagram element is being edited.
	* It is done in those cases when it's not possible to deduce diagram
	* element kind from domain element.
	* 
	* @generated
	*/
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart().getModel();
			if (view instanceof View) {
				Integer id = new Integer(CIM3VisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	* Returns visual id from request parameters.
	* @generated
	*/
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	* @generated
	*/
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest, semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	* @generated
	*/
	protected Command addDeleteViewCommand(Command mainCommand, DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand.chain(deleteViewCommand);
	}

	/**
	* @generated
	*/
	private Command getEditHelperCommand(IEditCommandRequest request, Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy
					? ((ICommandProxy) editPolicyCommand).getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(), command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	* @generated
	*/
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = CIM3ElementTypes.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType : myElementType;
	}

	/**
	* @generated
	*/
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	* @generated
	*/
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	* @generated
	*/
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	* @generated
	*/
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	* Returns editing domain from the host edit part.
	* @generated
	*/
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	* Clean all shortcuts to the host element from the same diagram
	* @generated
	*/
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() //$NON-NLS-1$
					|| nextView.getElement() != view.getElement()) {
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	* @generated
	*/
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = CIM3DiagramEditorPlugin.getInstance().getLinkConstraints();
		if (cached == null) {
			CIM3DiagramEditorPlugin.getInstance().setLinkConstraints(cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		* @generated
		*/
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateContextElementRefinement_4001(ContextElement source, Refinement target) {
			if (source != null) {
				if (source.getRefinement().contains(target)) {
					return false;
				}
			}

			return canExistContextElementRefinement_4001(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRefinementRefiningcontexts_4002(Refinement source, ContextElement target) {
			if (source != null) {
				if (source.getRefiningcontexts().contains(target)) {
					return false;
				}
			}

			return canExistRefinementRefiningcontexts_4002(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateParallel_4003(ContextModel container, ContextElement source, ContextElement target) {
			return canExistParallel_4003(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRelationshipTocontextelement_4018(Relationship source, ContextElement target) {
			if (source != null) {
				if (source.getTocontextelement() != null) {
					return false;
				}
			}
			if (target != null && (target.getFromrelation().contains(target))) {
				return false;
			}

			return canExistRelationshipTocontextelement_4018(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateProfiled_4005(ContextModel container, ContextSource source, ContextElement target) {
			return canExistProfiled_4005(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCharacterization_4006(ContextModel container, ContextElement source, Entity target) {
			return canExistCharacterization_4006(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCausal_4007(ContextModel container, ContextElement source, ContextElement target) {
			return canExistCausal_4007(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRelationshipTocontextelement_4019(Relationship source, ContextElement target) {
			if (source != null) {
				if (source.getTocontextelement() != null) {
					return false;
				}
			}
			if (target != null && (target.getFromrelation().contains(target))) {
				return false;
			}

			return canExistRelationshipTocontextelement_4019(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateValidity_4009(ContextModel container, TimeConstraint source, ContextElement target) {
			return canExistValidity_4009(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateDerived_4010(ContextModel container, ContextSource source, ContextElement target) {
			return canExistDerived_4010(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateStatic_4011(ContextModel container, ContextSource source, ContextElement target) {
			return canExistStatic_4011(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSensed_4012(ContextModel container, ContextSource source, ContextElement target) {
			return canExistSensed_4012(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSupport_4013(ContextModel container, ContextElement source, ContextElement target) {
			return canExistSupport_4013(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRelationshipTocontextelement_4020(Relationship source, ContextElement target) {
			if (source != null) {
				if (source.getTocontextelement() != null) {
					return false;
				}
			}
			if (target != null && (target.getFromrelation().contains(target))) {
				return false;
			}

			return canExistRelationshipTocontextelement_4020(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRelevance_4015(ContextModel container, ContextElement source, Focus target) {
			return canExistRelevance_4015(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConflict_4016(ContextModel container, ContextElement source, ContextElement target) {
			return canExistConflict_4016(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRelationshipTocontextelement_4021(Relationship source, ContextElement target) {
			if (source != null) {
				if (source.getTocontextelement() != null) {
					return false;
				}
			}
			if (target != null && (target.getFromrelation().contains(target))) {
				return false;
			}

			return canExistRelationshipTocontextelement_4021(source, target);
		}

		/**
		* @generated
		*/
		public boolean canExistContextElementRefinement_4001(ContextElement source, Refinement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistRefinementRefiningcontexts_4002(Refinement source, ContextElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistParallel_4003(ContextModel container, Parallel linkInstance, ContextElement source,
				ContextElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistRelationshipTocontextelement_4018(Relationship source, ContextElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistProfiled_4005(ContextModel container, Profiled linkInstance, ContextSource source,
				ContextElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistCharacterization_4006(ContextModel container, Characterization linkInstance,
				ContextElement source, Entity target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistCausal_4007(ContextModel container, Causal linkInstance, ContextElement source,
				ContextElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistRelationshipTocontextelement_4019(Relationship source, ContextElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistValidity_4009(ContextModel container, Validity linkInstance, TimeConstraint source,
				ContextElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistDerived_4010(ContextModel container, Derived linkInstance, ContextSource source,
				ContextElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistStatic_4011(ContextModel container, Static linkInstance, ContextSource source,
				ContextElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistSensed_4012(ContextModel container, Sensed linkInstance, ContextSource source,
				ContextElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistSupport_4013(ContextModel container, Support linkInstance, ContextElement source,
				ContextElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistRelationshipTocontextelement_4020(Relationship source, ContextElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistRelevance_4015(ContextModel container, Relevance linkInstance, ContextElement source,
				Focus target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistConflict_4016(ContextModel container, Conflict linkInstance, ContextElement source,
				ContextElement target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistRelationshipTocontextelement_4021(Relationship source, ContextElement target) {
			return true;
		}
	}

}
