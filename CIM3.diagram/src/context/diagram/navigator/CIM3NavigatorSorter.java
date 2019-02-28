package context.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import context.diagram.part.CIM3VisualIDRegistry;

/**
 * @generated
 */
public class CIM3NavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4023;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof CIM3NavigatorItem) {
			CIM3NavigatorItem item = (CIM3NavigatorItem) element;
			return CIM3VisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
