package context.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import context.Causal;
import context.ContextElement;
import context.ContextModel;
import context.diagram.edit.policies.CIM3BaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class CausalReorientCommand extends EditElementCommand {

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
	public CausalReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Causal) {
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
		if (!(oldEnd instanceof ContextElement && newEnd instanceof ContextElement)) {
			return false;
		}
		ContextElement target = getLink().getTocontextelement();
		if (!(getLink().eContainer() instanceof ContextModel)) {
			return false;
		}
		ContextModel container = (ContextModel) getLink().eContainer();
		return CIM3BaseItemSemanticEditPolicy.getLinkConstraints().canExistCausal_4007(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ContextElement && newEnd instanceof ContextElement)) {
			return false;
		}
		if (getLink().getFromcontextelement().size() != 1) {
			return false;
		}
		ContextElement source = (ContextElement) getLink().getFromcontextelement().get(0);
		if (!(getLink().eContainer() instanceof ContextModel)) {
			return false;
		}
		ContextModel container = (ContextModel) getLink().eContainer();
		return CIM3BaseItemSemanticEditPolicy.getLinkConstraints().canExistCausal_4007(container, getLink(), source,
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
		getLink().getFromcontextelement().remove(getOldSource());
		getLink().getFromcontextelement().add(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTocontextelement(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected Causal getLink() {
		return (Causal) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected ContextElement getOldSource() {
		return (ContextElement) oldEnd;
	}

	/**
	* @generated
	*/
	protected ContextElement getNewSource() {
		return (ContextElement) newEnd;
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
