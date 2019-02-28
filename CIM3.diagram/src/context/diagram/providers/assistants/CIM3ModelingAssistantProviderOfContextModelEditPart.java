package context.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import context.diagram.providers.CIM3ElementTypes;
import context.diagram.providers.CIM3ModelingAssistantProvider;

/**
 * @generated
 */
public class CIM3ModelingAssistantProviderOfContextModelEditPart extends CIM3ModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(18);
		types.add(CIM3ElementTypes.Congnitive_2001);
		types.add(CIM3ElementTypes.Identify_2002);
		types.add(CIM3ElementTypes.Current_2003);
		types.add(CIM3ElementTypes.Social_2004);
		types.add(CIM3ElementTypes.Activity_2005);
		types.add(CIM3ElementTypes.Past_2006);
		types.add(CIM3ElementTypes.Refinement_2007);
		types.add(CIM3ElementTypes.Preference_2008);
		types.add(CIM3ElementTypes.Entity_2009);
		types.add(CIM3ElementTypes.Computing_2010);
		types.add(CIM3ElementTypes.Future_2011);
		types.add(CIM3ElementTypes.Relative_2012);
		types.add(CIM3ElementTypes.ContextSource_2013);
		types.add(CIM3ElementTypes.Focus_2014);
		types.add(CIM3ElementTypes.Fixed_2015);
		types.add(CIM3ElementTypes.Composite_2016);
		types.add(CIM3ElementTypes.Location_2017);
		types.add(CIM3ElementTypes.User_2018);
		return types;
	}

}
