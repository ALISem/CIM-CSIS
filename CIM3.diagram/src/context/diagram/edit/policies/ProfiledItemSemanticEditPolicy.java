package context.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import context.diagram.providers.CIM3ElementTypes;

/**
 * @generated
 */
public class ProfiledItemSemanticEditPolicy extends CIM3BaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ProfiledItemSemanticEditPolicy() {
		super(CIM3ElementTypes.Profiled_4005);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
