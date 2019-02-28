package context.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import context.diagram.edit.parts.ActivityEditPart;
import context.diagram.edit.parts.CompositeEditPart;
import context.diagram.edit.parts.ComputingEditPart;
import context.diagram.edit.parts.CongnitiveEditPart;
import context.diagram.edit.parts.CurrentEditPart;
import context.diagram.edit.parts.FutureEditPart;
import context.diagram.edit.parts.IdentifyEditPart;
import context.diagram.edit.parts.LocationEditPart;
import context.diagram.edit.parts.PastEditPart;
import context.diagram.edit.parts.PreferenceEditPart;
import context.diagram.edit.parts.RefinementEditPart;
import context.diagram.edit.parts.SocialEditPart;
import context.diagram.edit.parts.UserEditPart;
import context.diagram.providers.CIM3ElementTypes;
import context.diagram.providers.CIM3ModelingAssistantProvider;

/**
 * @generated
 */
public class CIM3ModelingAssistantProviderOfRefinementEditPart extends CIM3ModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((RefinementEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(RefinementEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CIM3ElementTypes.RefinementRefiningcontexts_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((RefinementEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(RefinementEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof CongnitiveEditPart) {
			types.add(CIM3ElementTypes.RefinementRefiningcontexts_4002);
		}
		if (targetEditPart instanceof IdentifyEditPart) {
			types.add(CIM3ElementTypes.RefinementRefiningcontexts_4002);
		}
		if (targetEditPart instanceof CurrentEditPart) {
			types.add(CIM3ElementTypes.RefinementRefiningcontexts_4002);
		}
		if (targetEditPart instanceof SocialEditPart) {
			types.add(CIM3ElementTypes.RefinementRefiningcontexts_4002);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(CIM3ElementTypes.RefinementRefiningcontexts_4002);
		}
		if (targetEditPart instanceof PastEditPart) {
			types.add(CIM3ElementTypes.RefinementRefiningcontexts_4002);
		}
		if (targetEditPart instanceof PreferenceEditPart) {
			types.add(CIM3ElementTypes.RefinementRefiningcontexts_4002);
		}
		if (targetEditPart instanceof ComputingEditPart) {
			types.add(CIM3ElementTypes.RefinementRefiningcontexts_4002);
		}
		if (targetEditPart instanceof FutureEditPart) {
			types.add(CIM3ElementTypes.RefinementRefiningcontexts_4002);
		}
		if (targetEditPart instanceof CompositeEditPart) {
			types.add(CIM3ElementTypes.RefinementRefiningcontexts_4002);
		}
		if (targetEditPart instanceof LocationEditPart) {
			types.add(CIM3ElementTypes.RefinementRefiningcontexts_4002);
		}
		if (targetEditPart instanceof UserEditPart) {
			types.add(CIM3ElementTypes.RefinementRefiningcontexts_4002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((RefinementEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(RefinementEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CIM3ElementTypes.RefinementRefiningcontexts_4002) {
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

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((RefinementEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(RefinementEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CIM3ElementTypes.ContextElementRefinement_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((RefinementEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(RefinementEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CIM3ElementTypes.ContextElementRefinement_4001) {
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
