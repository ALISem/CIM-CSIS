package context.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import context.diagram.edit.parts.CIM3EditPartFactory;
import context.diagram.edit.parts.ContextModelEditPart;
import context.diagram.part.CIM3VisualIDRegistry;

/**
 * @generated
 */
public class CIM3EditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public CIM3EditPartProvider() {
		super(new CIM3EditPartFactory(), CIM3VisualIDRegistry.TYPED_INSTANCE, ContextModelEditPart.MODEL_ID);
	}

}
