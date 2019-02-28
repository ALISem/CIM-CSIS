package context.diagram.providers;

import context.diagram.part.CIM3DiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = CIM3DiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			CIM3DiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
