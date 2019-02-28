package context.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import context.diagram.edit.commands.DerivedCreateCommand;
import context.diagram.edit.commands.DerivedReorientCommand;
import context.diagram.edit.commands.ProfiledCreateCommand;
import context.diagram.edit.commands.ProfiledReorientCommand;
import context.diagram.edit.commands.SensedCreateCommand;
import context.diagram.edit.commands.SensedReorientCommand;
import context.diagram.edit.commands.StaticCreateCommand;
import context.diagram.edit.commands.StaticReorientCommand;
import context.diagram.edit.parts.DerivedEditPart;
import context.diagram.edit.parts.ProfiledEditPart;
import context.diagram.edit.parts.SensedEditPart;
import context.diagram.edit.parts.StaticEditPart;
import context.diagram.part.CIM3VisualIDRegistry;
import context.diagram.providers.CIM3ElementTypes;

/**
 * @generated
 */
public class ContextSourceItemSemanticEditPolicy extends CIM3BaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ContextSourceItemSemanticEditPolicy() {
		super(CIM3ElementTypes.ContextSource_2013);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (CIM3VisualIDRegistry.getVisualID(outgoingLink) == ProfiledEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(outgoingLink) == DerivedEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(outgoingLink) == StaticEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(outgoingLink) == SensedEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (CIM3ElementTypes.Profiled_4005 == req.getElementType()) {
			return getGEFWrapper(new ProfiledCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.Derived_4010 == req.getElementType()) {
			return getGEFWrapper(new DerivedCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.Static_4011 == req.getElementType()) {
			return getGEFWrapper(new StaticCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.Sensed_4012 == req.getElementType()) {
			return getGEFWrapper(new SensedCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (CIM3ElementTypes.Profiled_4005 == req.getElementType()) {
			return null;
		}
		if (CIM3ElementTypes.Derived_4010 == req.getElementType()) {
			return null;
		}
		if (CIM3ElementTypes.Static_4011 == req.getElementType()) {
			return null;
		}
		if (CIM3ElementTypes.Sensed_4012 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ProfiledEditPart.VISUAL_ID:
			return getGEFWrapper(new ProfiledReorientCommand(req));
		case DerivedEditPart.VISUAL_ID:
			return getGEFWrapper(new DerivedReorientCommand(req));
		case StaticEditPart.VISUAL_ID:
			return getGEFWrapper(new StaticReorientCommand(req));
		case SensedEditPart.VISUAL_ID:
			return getGEFWrapper(new SensedReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
