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
import context.ContextSource;
import context.Sensed;
import context.diagram.edit.policies.CIM3BaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class SensedReorientCommand extends EditElementCommand {

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
	public SensedReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Sensed) {
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
		if (!(oldEnd instanceof ContextSource && newEnd instanceof ContextSource)) {
			return false;
		}
		if (getLink().getAquiredcontext().size() != 1) {
			return false;
		}
		ContextElement target = (ContextElement) getLink().getAquiredcontext().get(0);
		if (!(getLink().eContainer() instanceof ContextModel)) {
			return false;
		}
		ContextModel container = (ContextModel) getLink().eContainer();
		return CIM3BaseItemSemanticEditPolicy.getLinkConstraints().canExistSensed_4012(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ContextElement && newEnd instanceof ContextElement)) {
			return false;
		}
		if (getLink().getContextsource().size() != 1) {
			return false;
		}
		ContextSource source = (ContextSource) getLink().getContextsource().get(0);
		if (!(getLink().eContainer() instanceof ContextModel)) {
			return false;
		}
		ContextModel container = (ContextModel) getLink().eContainer();
		return CIM3BaseItemSemanticEditPolicy.getLinkConstraints().canExistSensed_4012(container, getLink(), source,
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
		getLink().getContextsource().remove(getOldSource());
		getLink().getContextsource().add(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getAquiredcontext().remove(getOldTarget());
		getLink().getAquiredcontext().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected Sensed getLink() {
		return (Sensed) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected ContextSource getOldSource() {
		return (ContextSource) oldEnd;
	}

	/**
	* @generated
	*/
	protected ContextSource getNewSource() {
		return (ContextSource) newEnd;
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
