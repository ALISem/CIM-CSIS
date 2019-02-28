package context.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import context.diagram.edit.commands.CausalCreateCommand;
import context.diagram.edit.commands.CausalReorientCommand;
import context.diagram.edit.commands.CharacterizationCreateCommand;
import context.diagram.edit.commands.CharacterizationReorientCommand;
import context.diagram.edit.commands.ConflictCreateCommand;
import context.diagram.edit.commands.ConflictReorientCommand;
import context.diagram.edit.commands.ContextElementRefinementCreateCommand;
import context.diagram.edit.commands.ContextElementRefinementReorientCommand;
import context.diagram.edit.commands.DerivedCreateCommand;
import context.diagram.edit.commands.DerivedReorientCommand;
import context.diagram.edit.commands.ParallelCreateCommand;
import context.diagram.edit.commands.ParallelReorientCommand;
import context.diagram.edit.commands.ProfiledCreateCommand;
import context.diagram.edit.commands.ProfiledReorientCommand;
import context.diagram.edit.commands.RefinementRefiningcontextsCreateCommand;
import context.diagram.edit.commands.RefinementRefiningcontextsReorientCommand;
import context.diagram.edit.commands.RelationshipTocontextelement2CreateCommand;
import context.diagram.edit.commands.RelationshipTocontextelement2ReorientCommand;
import context.diagram.edit.commands.RelationshipTocontextelement3CreateCommand;
import context.diagram.edit.commands.RelationshipTocontextelement3ReorientCommand;
import context.diagram.edit.commands.RelationshipTocontextelement4CreateCommand;
import context.diagram.edit.commands.RelationshipTocontextelement4ReorientCommand;
import context.diagram.edit.commands.RelationshipTocontextelementCreateCommand;
import context.diagram.edit.commands.RelationshipTocontextelementReorientCommand;
import context.diagram.edit.commands.RelevanceCreateCommand;
import context.diagram.edit.commands.RelevanceReorientCommand;
import context.diagram.edit.commands.SensedCreateCommand;
import context.diagram.edit.commands.SensedReorientCommand;
import context.diagram.edit.commands.StaticCreateCommand;
import context.diagram.edit.commands.StaticReorientCommand;
import context.diagram.edit.commands.SupportCreateCommand;
import context.diagram.edit.commands.SupportReorientCommand;
import context.diagram.edit.commands.ValidityCreateCommand;
import context.diagram.edit.commands.ValidityReorientCommand;
import context.diagram.edit.parts.CausalEditPart;
import context.diagram.edit.parts.CharacterizationEditPart;
import context.diagram.edit.parts.ConflictEditPart;
import context.diagram.edit.parts.ContextElementRefinementEditPart;
import context.diagram.edit.parts.DerivedEditPart;
import context.diagram.edit.parts.ParallelEditPart;
import context.diagram.edit.parts.ProfiledEditPart;
import context.diagram.edit.parts.RefinementRefiningcontextsEditPart;
import context.diagram.edit.parts.RelationshipTocontextelement2EditPart;
import context.diagram.edit.parts.RelationshipTocontextelement3EditPart;
import context.diagram.edit.parts.RelationshipTocontextelement4EditPart;
import context.diagram.edit.parts.RelationshipTocontextelementEditPart;
import context.diagram.edit.parts.RelevanceEditPart;
import context.diagram.edit.parts.SensedEditPart;
import context.diagram.edit.parts.StaticEditPart;
import context.diagram.edit.parts.SupportEditPart;
import context.diagram.edit.parts.ValidityEditPart;
import context.diagram.part.CIM3VisualIDRegistry;
import context.diagram.providers.CIM3ElementTypes;

/**
 * @generated
 */
public class ComputingItemSemanticEditPolicy extends CIM3BaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ComputingItemSemanticEditPolicy() {
		super(CIM3ElementTypes.Computing_2010);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (CIM3VisualIDRegistry.getVisualID(incomingLink) == RefinementRefiningcontextsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(incomingLink) == ParallelEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(incomingLink) == RelationshipTocontextelementEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(incomingLink) == ProfiledEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(incomingLink) == CausalEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(incomingLink) == RelationshipTocontextelement2EditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(incomingLink) == ValidityEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(incomingLink) == DerivedEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(incomingLink) == StaticEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(incomingLink) == SensedEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(incomingLink) == SupportEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(incomingLink) == RelationshipTocontextelement3EditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(incomingLink) == ConflictEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(incomingLink) == RelationshipTocontextelement4EditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (CIM3VisualIDRegistry.getVisualID(outgoingLink) == ContextElementRefinementEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(outgoingLink) == ParallelEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(outgoingLink) == CharacterizationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(outgoingLink) == CausalEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(outgoingLink) == SupportEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(outgoingLink) == RelevanceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CIM3VisualIDRegistry.getVisualID(outgoingLink) == ConflictEditPart.VISUAL_ID) {
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
		if (CIM3ElementTypes.ContextElementRefinement_4001 == req.getElementType()) {
			return getGEFWrapper(new ContextElementRefinementCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.RefinementRefiningcontexts_4002 == req.getElementType()) {
			return null;
		}
		if (CIM3ElementTypes.Parallel_4003 == req.getElementType()) {
			return getGEFWrapper(new ParallelCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.RelationshipTocontextelement_4018 == req.getElementType()) {
			return null;
		}
		if (CIM3ElementTypes.Profiled_4005 == req.getElementType()) {
			return null;
		}
		if (CIM3ElementTypes.Characterization_4006 == req.getElementType()) {
			return getGEFWrapper(new CharacterizationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.Causal_4007 == req.getElementType()) {
			return getGEFWrapper(new CausalCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.RelationshipTocontextelement_4019 == req.getElementType()) {
			return null;
		}
		if (CIM3ElementTypes.Validity_4009 == req.getElementType()) {
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
		if (CIM3ElementTypes.Support_4013 == req.getElementType()) {
			return getGEFWrapper(new SupportCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.RelationshipTocontextelement_4020 == req.getElementType()) {
			return null;
		}
		if (CIM3ElementTypes.Relevance_4015 == req.getElementType()) {
			return getGEFWrapper(new RelevanceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.Conflict_4016 == req.getElementType()) {
			return getGEFWrapper(new ConflictCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.RelationshipTocontextelement_4021 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (CIM3ElementTypes.ContextElementRefinement_4001 == req.getElementType()) {
			return null;
		}
		if (CIM3ElementTypes.RefinementRefiningcontexts_4002 == req.getElementType()) {
			return getGEFWrapper(new RefinementRefiningcontextsCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.Parallel_4003 == req.getElementType()) {
			return getGEFWrapper(new ParallelCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.RelationshipTocontextelement_4018 == req.getElementType()) {
			return getGEFWrapper(new RelationshipTocontextelementCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.Profiled_4005 == req.getElementType()) {
			return getGEFWrapper(new ProfiledCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.Characterization_4006 == req.getElementType()) {
			return null;
		}
		if (CIM3ElementTypes.Causal_4007 == req.getElementType()) {
			return getGEFWrapper(new CausalCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.RelationshipTocontextelement_4019 == req.getElementType()) {
			return getGEFWrapper(new RelationshipTocontextelement2CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.Validity_4009 == req.getElementType()) {
			return getGEFWrapper(new ValidityCreateCommand(req, req.getSource(), req.getTarget()));
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
		if (CIM3ElementTypes.Support_4013 == req.getElementType()) {
			return getGEFWrapper(new SupportCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.RelationshipTocontextelement_4020 == req.getElementType()) {
			return getGEFWrapper(new RelationshipTocontextelement3CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.Relevance_4015 == req.getElementType()) {
			return null;
		}
		if (CIM3ElementTypes.Conflict_4016 == req.getElementType()) {
			return getGEFWrapper(new ConflictCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.RelationshipTocontextelement_4021 == req.getElementType()) {
			return getGEFWrapper(new RelationshipTocontextelement4CreateCommand(req, req.getSource(), req.getTarget()));
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
		case ParallelEditPart.VISUAL_ID:
			return getGEFWrapper(new ParallelReorientCommand(req));
		case ProfiledEditPart.VISUAL_ID:
			return getGEFWrapper(new ProfiledReorientCommand(req));
		case CharacterizationEditPart.VISUAL_ID:
			return getGEFWrapper(new CharacterizationReorientCommand(req));
		case CausalEditPart.VISUAL_ID:
			return getGEFWrapper(new CausalReorientCommand(req));
		case ValidityEditPart.VISUAL_ID:
			return getGEFWrapper(new ValidityReorientCommand(req));
		case DerivedEditPart.VISUAL_ID:
			return getGEFWrapper(new DerivedReorientCommand(req));
		case StaticEditPart.VISUAL_ID:
			return getGEFWrapper(new StaticReorientCommand(req));
		case SensedEditPart.VISUAL_ID:
			return getGEFWrapper(new SensedReorientCommand(req));
		case SupportEditPart.VISUAL_ID:
			return getGEFWrapper(new SupportReorientCommand(req));
		case RelevanceEditPart.VISUAL_ID:
			return getGEFWrapper(new RelevanceReorientCommand(req));
		case ConflictEditPart.VISUAL_ID:
			return getGEFWrapper(new ConflictReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ContextElementRefinementEditPart.VISUAL_ID:
			return getGEFWrapper(new ContextElementRefinementReorientCommand(req));
		case RefinementRefiningcontextsEditPart.VISUAL_ID:
			return getGEFWrapper(new RefinementRefiningcontextsReorientCommand(req));
		case RelationshipTocontextelementEditPart.VISUAL_ID:
			return getGEFWrapper(new RelationshipTocontextelementReorientCommand(req));
		case RelationshipTocontextelement2EditPart.VISUAL_ID:
			return getGEFWrapper(new RelationshipTocontextelement2ReorientCommand(req));
		case RelationshipTocontextelement3EditPart.VISUAL_ID:
			return getGEFWrapper(new RelationshipTocontextelement3ReorientCommand(req));
		case RelationshipTocontextelement4EditPart.VISUAL_ID:
			return getGEFWrapper(new RelationshipTocontextelement4ReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
