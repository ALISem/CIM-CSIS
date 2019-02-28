package context.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import context.diagram.edit.parts.FocusEditPart;
import context.diagram.providers.CIM3ElementTypes;
import context.diagram.providers.CIM3ModelingAssistantProvider;

/**
 * @generated
 */
public class CIM3ModelingAssistantProviderOfFocusEditPart extends CIM3ModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((FocusEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(FocusEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CIM3ElementTypes.Relevance_4015);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((FocusEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(FocusEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CIM3ElementTypes.Relevance_4015) {
			types.add(CIM3ElementTypes.Congnitive_2001);
			types.add(CIM3ElementTypes.Identify_2002);
			types.add(CIM3ElementTypes.Current_2003);
			types.add(CIM3ElementTypes.Social_2004);
			types.add(CIM3ElementTypes.Activity_2005);
			types.add(CIM3ElementTypes.Past_2006);
			types.add(CIM3ElementTypes.Preference_2008);
			types.add(CIM3ElementTypes.Computing_2010);
			types.add(CIM3ElementTypes.Future_2011);
			types.add(CIM3ElementTypes.Composite_2016);
			types.add(CIM3ElementTypes.Location_2017);
			types.add(CIM3ElementTypes.User_2018);
		}
		return types;
	}

}
