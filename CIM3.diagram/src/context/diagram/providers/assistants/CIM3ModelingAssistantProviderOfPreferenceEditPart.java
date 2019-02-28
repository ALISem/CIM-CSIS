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
import context.diagram.edit.parts.EntityEditPart;
import context.diagram.edit.parts.FocusEditPart;
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
public class CIM3ModelingAssistantProviderOfPreferenceEditPart extends CIM3ModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((PreferenceEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(PreferenceEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(7);
		types.add(CIM3ElementTypes.ContextElementRefinement_4001);
		types.add(CIM3ElementTypes.Parallel_4003);
		types.add(CIM3ElementTypes.Characterization_4006);
		types.add(CIM3ElementTypes.Causal_4007);
		types.add(CIM3ElementTypes.Support_4013);
		types.add(CIM3ElementTypes.Relevance_4015);
		types.add(CIM3ElementTypes.Conflict_4016);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((PreferenceEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(PreferenceEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof RefinementEditPart) {
			types.add(CIM3ElementTypes.ContextElementRefinement_4001);
		}
		if (targetEditPart instanceof CongnitiveEditPart) {
			types.add(CIM3ElementTypes.Parallel_4003);
		}
		if (targetEditPart instanceof IdentifyEditPart) {
			types.add(CIM3ElementTypes.Parallel_4003);
		}
		if (targetEditPart instanceof CurrentEditPart) {
			types.add(CIM3ElementTypes.Parallel_4003);
		}
		if (targetEditPart instanceof SocialEditPart) {
			types.add(CIM3ElementTypes.Parallel_4003);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(CIM3ElementTypes.Parallel_4003);
		}
		if (targetEditPart instanceof PastEditPart) {
			types.add(CIM3ElementTypes.Parallel_4003);
		}
		if (targetEditPart instanceof PreferenceEditPart) {
			types.add(CIM3ElementTypes.Parallel_4003);
		}
		if (targetEditPart instanceof ComputingEditPart) {
			types.add(CIM3ElementTypes.Parallel_4003);
		}
		if (targetEditPart instanceof FutureEditPart) {
			types.add(CIM3ElementTypes.Parallel_4003);
		}
		if (targetEditPart instanceof CompositeEditPart) {
			types.add(CIM3ElementTypes.Parallel_4003);
		}
		if (targetEditPart instanceof LocationEditPart) {
			types.add(CIM3ElementTypes.Parallel_4003);
		}
		if (targetEditPart instanceof UserEditPart) {
			types.add(CIM3ElementTypes.Parallel_4003);
		}
		if (targetEditPart instanceof EntityEditPart) {
			types.add(CIM3ElementTypes.Characterization_4006);
		}
		if (targetEditPart instanceof CongnitiveEditPart) {
			types.add(CIM3ElementTypes.Causal_4007);
		}
		if (targetEditPart instanceof IdentifyEditPart) {
			types.add(CIM3ElementTypes.Causal_4007);
		}
		if (targetEditPart instanceof CurrentEditPart) {
			types.add(CIM3ElementTypes.Causal_4007);
		}
		if (targetEditPart instanceof SocialEditPart) {
			types.add(CIM3ElementTypes.Causal_4007);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(CIM3ElementTypes.Causal_4007);
		}
		if (targetEditPart instanceof PastEditPart) {
			types.add(CIM3ElementTypes.Causal_4007);
		}
		if (targetEditPart instanceof PreferenceEditPart) {
			types.add(CIM3ElementTypes.Causal_4007);
		}
		if (targetEditPart instanceof ComputingEditPart) {
			types.add(CIM3ElementTypes.Causal_4007);
		}
		if (targetEditPart instanceof FutureEditPart) {
			types.add(CIM3ElementTypes.Causal_4007);
		}
		if (targetEditPart instanceof CompositeEditPart) {
			types.add(CIM3ElementTypes.Causal_4007);
		}
		if (targetEditPart instanceof LocationEditPart) {
			types.add(CIM3ElementTypes.Causal_4007);
		}
		if (targetEditPart instanceof UserEditPart) {
			types.add(CIM3ElementTypes.Causal_4007);
		}
		if (targetEditPart instanceof CongnitiveEditPart) {
			types.add(CIM3ElementTypes.Support_4013);
		}
		if (targetEditPart instanceof IdentifyEditPart) {
			types.add(CIM3ElementTypes.Support_4013);
		}
		if (targetEditPart instanceof CurrentEditPart) {
			types.add(CIM3ElementTypes.Support_4013);
		}
		if (targetEditPart instanceof SocialEditPart) {
			types.add(CIM3ElementTypes.Support_4013);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(CIM3ElementTypes.Support_4013);
		}
		if (targetEditPart instanceof PastEditPart) {
			types.add(CIM3ElementTypes.Support_4013);
		}
		if (targetEditPart instanceof PreferenceEditPart) {
			types.add(CIM3ElementTypes.Support_4013);
		}
		if (targetEditPart instanceof ComputingEditPart) {
			types.add(CIM3ElementTypes.Support_4013);
		}
		if (targetEditPart instanceof FutureEditPart) {
			types.add(CIM3ElementTypes.Support_4013);
		}
		if (targetEditPart instanceof CompositeEditPart) {
			types.add(CIM3ElementTypes.Support_4013);
		}
		if (targetEditPart instanceof LocationEditPart) {
			types.add(CIM3ElementTypes.Support_4013);
		}
		if (targetEditPart instanceof UserEditPart) {
			types.add(CIM3ElementTypes.Support_4013);
		}
		if (targetEditPart instanceof FocusEditPart) {
			types.add(CIM3ElementTypes.Relevance_4015);
		}
		if (targetEditPart instanceof CongnitiveEditPart) {
			types.add(CIM3ElementTypes.Conflict_4016);
		}
		if (targetEditPart instanceof IdentifyEditPart) {
			types.add(CIM3ElementTypes.Conflict_4016);
		}
		if (targetEditPart instanceof CurrentEditPart) {
			types.add(CIM3ElementTypes.Conflict_4016);
		}
		if (targetEditPart instanceof SocialEditPart) {
			types.add(CIM3ElementTypes.Conflict_4016);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(CIM3ElementTypes.Conflict_4016);
		}
		if (targetEditPart instanceof PastEditPart) {
			types.add(CIM3ElementTypes.Conflict_4016);
		}
		if (targetEditPart instanceof PreferenceEditPart) {
			types.add(CIM3ElementTypes.Conflict_4016);
		}
		if (targetEditPart instanceof ComputingEditPart) {
			types.add(CIM3ElementTypes.Conflict_4016);
		}
		if (targetEditPart instanceof FutureEditPart) {
			types.add(CIM3ElementTypes.Conflict_4016);
		}
		if (targetEditPart instanceof CompositeEditPart) {
			types.add(CIM3ElementTypes.Conflict_4016);
		}
		if (targetEditPart instanceof LocationEditPart) {
			types.add(CIM3ElementTypes.Conflict_4016);
		}
		if (targetEditPart instanceof UserEditPart) {
			types.add(CIM3ElementTypes.Conflict_4016);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((PreferenceEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(PreferenceEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CIM3ElementTypes.ContextElementRefinement_4001) {
			types.add(CIM3ElementTypes.Refinement_2007);
		} else if (relationshipType == CIM3ElementTypes.Parallel_4003) {
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
		} else if (relationshipType == CIM3ElementTypes.Characterization_4006) {
			types.add(CIM3ElementTypes.Entity_2009);
		} else if (relationshipType == CIM3ElementTypes.Causal_4007) {
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
		} else if (relationshipType == CIM3ElementTypes.Support_4013) {
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
		} else if (relationshipType == CIM3ElementTypes.Relevance_4015) {
			types.add(CIM3ElementTypes.Focus_2014);
		} else if (relationshipType == CIM3ElementTypes.Conflict_4016) {
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
		return doGetRelTypesOnTarget((PreferenceEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(PreferenceEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(10);
		types.add(CIM3ElementTypes.RefinementRefiningcontexts_4002);
		types.add(CIM3ElementTypes.Parallel_4003);
		types.add(CIM3ElementTypes.Profiled_4005);
		types.add(CIM3ElementTypes.Causal_4007);
		types.add(CIM3ElementTypes.Validity_4009);
		types.add(CIM3ElementTypes.Derived_4010);
		types.add(CIM3ElementTypes.Static_4011);
		types.add(CIM3ElementTypes.Sensed_4012);
		types.add(CIM3ElementTypes.Support_4013);
		types.add(CIM3ElementTypes.Conflict_4016);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((PreferenceEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(PreferenceEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CIM3ElementTypes.RefinementRefiningcontexts_4002) {
			types.add(CIM3ElementTypes.Refinement_2007);
		} else if (relationshipType == CIM3ElementTypes.Parallel_4003) {
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
		} else if (relationshipType == CIM3ElementTypes.Profiled_4005) {
			types.add(CIM3ElementTypes.ContextSource_2013);
		} else if (relationshipType == CIM3ElementTypes.Causal_4007) {
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
		} else if (relationshipType == CIM3ElementTypes.Validity_4009) {
			types.add(CIM3ElementTypes.Relative_2012);
			types.add(CIM3ElementTypes.Fixed_2015);
		} else if (relationshipType == CIM3ElementTypes.Derived_4010) {
			types.add(CIM3ElementTypes.ContextSource_2013);
		} else if (relationshipType == CIM3ElementTypes.Static_4011) {
			types.add(CIM3ElementTypes.ContextSource_2013);
		} else if (relationshipType == CIM3ElementTypes.Sensed_4012) {
			types.add(CIM3ElementTypes.ContextSource_2013);
		} else if (relationshipType == CIM3ElementTypes.Support_4013) {
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
		} else if (relationshipType == CIM3ElementTypes.Conflict_4016) {
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
