package context.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import context.diagram.providers.CIM3ElementTypes;

/**
 * @generated
 */
public class CharacterizationItemSemanticEditPolicy extends CIM3BaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CharacterizationItemSemanticEditPolicy() {
		super(CIM3ElementTypes.Characterization_4006);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
