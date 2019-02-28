package context.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import context.ContextElement;
import context.ContextModel;
import context.TimeConstraint;
import context.Validity;
import context.diagram.edit.policies.CIM3BaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ValidityReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public ValidityReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Validity) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof TimeConstraint && newEnd instanceof TimeConstraint)) {
			return false;
		}
		if (getLink().getValidContext().size() != 1) {
			return false;
		}
		ContextElement target = (ContextElement) getLink().getValidContext().get(0);
		if (!(getLink().eContainer() instanceof ContextModel)) {
			return false;
		}
		ContextModel container = (ContextModel) getLink().eContainer();
		return CIM3BaseItemSemanticEditPolicy.getLinkConstraints().canExistValidity_4009(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ContextElement && newEnd instanceof ContextElement)) {
			return false;
		}
		if (getLink().getConstraint().size() != 1) {
			return false;
		}
		TimeConstraint source = (TimeConstraint) getLink().getConstraint().get(0);
		if (!(getLink().eContainer() instanceof ContextModel)) {
			return false;
		}
		ContextModel container = (ContextModel) getLink().eContainer();
		return CIM3BaseItemSemanticEditPolicy.getLinkConstraints().canExistValidity_4009(container, getLink(), source,
				getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().getConstraint().remove(getOldSource());
		getLink().getConstraint().add(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getValidContext().remove(getOldTarget());
		getLink().getValidContext().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected Validity getLink() {
		return (Validity) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected TimeConstraint getOldSource() {
		return (TimeConstraint) oldEnd;
	}

	/**
	* @generated
	*/
	protected TimeConstraint getNewSource() {
		return (TimeConstraint) newEnd;
	}

	/**
	* @generated
	*/
	protected ContextElement getOldTarget() {
		return (ContextElement) oldEnd;
	}

	/**
	* @generated
	*/
	protected ContextElement getNewTarget() {
		return (ContextElement) newEnd;
	}
}
