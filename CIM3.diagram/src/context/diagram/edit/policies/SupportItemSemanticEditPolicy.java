package context.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;

import context.diagram.edit.commands.RelationshipTocontextelement2CreateCommand;
import context.diagram.edit.commands.RelationshipTocontextelement2ReorientCommand;
import context.diagram.edit.commands.RelationshipTocontextelement3CreateCommand;
import context.diagram.edit.commands.RelationshipTocontextelement3ReorientCommand;
import context.diagram.edit.commands.RelationshipTocontextelement4CreateCommand;
import context.diagram.edit.commands.RelationshipTocontextelement4ReorientCommand;
import context.diagram.edit.commands.RelationshipTocontextelementCreateCommand;
import context.diagram.edit.commands.RelationshipTocontextelementReorientCommand;
import context.diagram.edit.parts.RelationshipTocontextelement2EditPart;
import context.diagram.edit.parts.RelationshipTocontextelement3EditPart;
import context.diagram.edit.parts.RelationshipTocontextelement4EditPart;
import context.diagram.edit.parts.RelationshipTocontextelementEditPart;
import context.diagram.providers.CIM3ElementTypes;

/**
 * @generated
 */
public class SupportItemSemanticEditPolicy extends CIM3BaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SupportItemSemanticEditPolicy() {
		super(CIM3ElementTypes.Support_4013);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
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
		if (CIM3ElementTypes.RelationshipTocontextelement_4018 == req.getElementType()) {
			return getGEFWrapper(new RelationshipTocontextelementCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.RelationshipTocontextelement_4019 == req.getElementType()) {
			return getGEFWrapper(new RelationshipTocontextelement2CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.RelationshipTocontextelement_4020 == req.getElementType()) {
			return getGEFWrapper(new RelationshipTocontextelement3CreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (CIM3ElementTypes.RelationshipTocontextelement_4021 == req.getElementType()) {
			return getGEFWrapper(new RelationshipTocontextelement4CreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (CIM3ElementTypes.RelationshipTocontextelement_4018 == req.getElementType()) {
			return null;
		}
		if (CIM3ElementTypes.RelationshipTocontextelement_4019 == req.getElementType()) {
			return null;
		}
		if (CIM3ElementTypes.RelationshipTocontextelement_4020 == req.getElementType()) {
			return null;
		}
		if (CIM3ElementTypes.RelationshipTocontextelement_4021 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
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
