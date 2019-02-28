package context.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import context.ContextModel;
import context.User;
import context.diagram.edit.parts.ActivityEditPart;
import context.diagram.edit.parts.ActivityNameEditPart;
import context.diagram.edit.parts.CausalEditPart;
import context.diagram.edit.parts.CausalNameEditPart;
import context.diagram.edit.parts.CharacterizationEditPart;
import context.diagram.edit.parts.CharacterizationNameEditPart;
import context.diagram.edit.parts.CompositeEditPart;
import context.diagram.edit.parts.CompositeNameEditPart;
import context.diagram.edit.parts.ComputingEditPart;
import context.diagram.edit.parts.ComputingNameEditPart;
import context.diagram.edit.parts.ConflictEditPart;
import context.diagram.edit.parts.ConflictNameEditPart;
import context.diagram.edit.parts.CongnitiveEditPart;
import context.diagram.edit.parts.CongnitiveNameEditPart;
import context.diagram.edit.parts.ContextElementRefinementEditPart;
import context.diagram.edit.parts.ContextModelEditPart;
import context.diagram.edit.parts.ContextSourceEditPart;
import context.diagram.edit.parts.ContextSourceNameEditPart;
import context.diagram.edit.parts.CurrentEditPart;
import context.diagram.edit.parts.CurrentNameEditPart;
import context.diagram.edit.parts.DerivedEditPart;
import context.diagram.edit.parts.DerivedNameEditPart;
import context.diagram.edit.parts.EntityEditPart;
import context.diagram.edit.parts.EntityNameEditPart;
import context.diagram.edit.parts.FixedEditPart;
import context.diagram.edit.parts.FixedNameEditPart;
import context.diagram.edit.parts.FocusEditPart;
import context.diagram.edit.parts.FocusFocalElementEditPart;
import context.diagram.edit.parts.FutureEditPart;
import context.diagram.edit.parts.FutureNameEditPart;
import context.diagram.edit.parts.IdentifyEditPart;
import context.diagram.edit.parts.IdentifyNameEditPart;
import context.diagram.edit.parts.LocationEditPart;
import context.diagram.edit.parts.LocationNameEditPart;
import context.diagram.edit.parts.ParallelEditPart;
import context.diagram.edit.parts.ParallelNameEditPart;
import context.diagram.edit.parts.PastEditPart;
import context.diagram.edit.parts.PastNameEditPart;
import context.diagram.edit.parts.PreferenceEditPart;
import context.diagram.edit.parts.PreferenceNameEditPart;
import context.diagram.edit.parts.ProfiledEditPart;
import context.diagram.edit.parts.ProfiledNameEditPart;
import context.diagram.edit.parts.RefinementEditPart;
import context.diagram.edit.parts.RefinementRefiningcontextsEditPart;
import context.diagram.edit.parts.RefinementTypeEditPart;
import context.diagram.edit.parts.RelationshipTocontextelement2EditPart;
import context.diagram.edit.parts.RelationshipTocontextelement3EditPart;
import context.diagram.edit.parts.RelationshipTocontextelement4EditPart;
import context.diagram.edit.parts.RelationshipTocontextelementEditPart;
import context.diagram.edit.parts.RelativeEditPart;
import context.diagram.edit.parts.RelativeNameEditPart;
import context.diagram.edit.parts.RelevanceArgumentEditPart;
import context.diagram.edit.parts.RelevanceEditPart;
import context.diagram.edit.parts.SensedEditPart;
import context.diagram.edit.parts.SensedNameEditPart;
import context.diagram.edit.parts.SocialEditPart;
import context.diagram.edit.parts.SocialNameEditPart;
import context.diagram.edit.parts.StaticEditPart;
import context.diagram.edit.parts.StaticNameEditPart;
import context.diagram.edit.parts.SupportEditPart;
import context.diagram.edit.parts.SupportNameEditPart;
import context.diagram.edit.parts.UserEditPart;
import context.diagram.edit.parts.ValidityEditPart;
import context.diagram.edit.parts.ValidityNameEditPart;
import context.diagram.part.CIM3DiagramEditorPlugin;
import context.diagram.part.CIM3VisualIDRegistry;
import context.diagram.providers.CIM3ElementTypes;
import context.diagram.providers.CIM3ParserProvider;

/**
 * @generated
 */
public class CIM3NavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		CIM3DiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		CIM3DiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CIM3NavigatorItem && !isOwnView(((CIM3NavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof CIM3NavigatorGroup) {
			CIM3NavigatorGroup group = (CIM3NavigatorGroup) element;
			return CIM3DiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof CIM3NavigatorItem) {
			CIM3NavigatorItem navigatorItem = (CIM3NavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (CIM3VisualIDRegistry.getVisualID(view)) {
		case ContextModelEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?context?ContextModel", CIM3ElementTypes.ContextModel_1000); //$NON-NLS-1$
		case CongnitiveEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?context?Congnitive", CIM3ElementTypes.Congnitive_2001); //$NON-NLS-1$
		case IdentifyEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?context?Identify", CIM3ElementTypes.Identify_2002); //$NON-NLS-1$
		case CurrentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?context?Current", CIM3ElementTypes.Current_2003); //$NON-NLS-1$
		case SocialEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?context?Social", CIM3ElementTypes.Social_2004); //$NON-NLS-1$
		case ActivityEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?context?Activity", CIM3ElementTypes.Activity_2005); //$NON-NLS-1$
		case PastEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?context?Past", CIM3ElementTypes.Past_2006); //$NON-NLS-1$
		case RefinementEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?context?Refinement", CIM3ElementTypes.Refinement_2007); //$NON-NLS-1$
		case PreferenceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?context?Preference", CIM3ElementTypes.Preference_2008); //$NON-NLS-1$
		case EntityEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?context?Entity", CIM3ElementTypes.Entity_2009); //$NON-NLS-1$
		case ComputingEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?context?Computing", CIM3ElementTypes.Computing_2010); //$NON-NLS-1$
		case FutureEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?context?Future", CIM3ElementTypes.Future_2011); //$NON-NLS-1$
		case RelativeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?context?Relative", CIM3ElementTypes.Relative_2012); //$NON-NLS-1$
		case ContextSourceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?context?ContextSource", CIM3ElementTypes.ContextSource_2013); //$NON-NLS-1$
		case FocusEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?context?Focus", CIM3ElementTypes.Focus_2014); //$NON-NLS-1$
		case FixedEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?context?Fixed", CIM3ElementTypes.Fixed_2015); //$NON-NLS-1$
		case CompositeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?context?Composite", CIM3ElementTypes.Composite_2016); //$NON-NLS-1$
		case LocationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?context?Location", CIM3ElementTypes.Location_2017); //$NON-NLS-1$
		case UserEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?context?User", CIM3ElementTypes.User_2018); //$NON-NLS-1$
		case ContextElementRefinementEditPart.VISUAL_ID:
			return getImage("Navigator?Link?context?ContextElement?refinement", //$NON-NLS-1$
					CIM3ElementTypes.ContextElementRefinement_4001);
		case RefinementRefiningcontextsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?context?Refinement?Refiningcontexts", //$NON-NLS-1$
					CIM3ElementTypes.RefinementRefiningcontexts_4002);
		case ParallelEditPart.VISUAL_ID:
			return getImage("Navigator?Link?context?Parallel", CIM3ElementTypes.Parallel_4003); //$NON-NLS-1$
		case ProfiledEditPart.VISUAL_ID:
			return getImage("Navigator?Link?context?Profiled", CIM3ElementTypes.Profiled_4005); //$NON-NLS-1$
		case CharacterizationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?context?Characterization", CIM3ElementTypes.Characterization_4006); //$NON-NLS-1$
		case CausalEditPart.VISUAL_ID:
			return getImage("Navigator?Link?context?Causal", CIM3ElementTypes.Causal_4007); //$NON-NLS-1$
		case ValidityEditPart.VISUAL_ID:
			return getImage("Navigator?Link?context?Validity", CIM3ElementTypes.Validity_4009); //$NON-NLS-1$
		case DerivedEditPart.VISUAL_ID:
			return getImage("Navigator?Link?context?Derived", CIM3ElementTypes.Derived_4010); //$NON-NLS-1$
		case StaticEditPart.VISUAL_ID:
			return getImage("Navigator?Link?context?Static", CIM3ElementTypes.Static_4011); //$NON-NLS-1$
		case SensedEditPart.VISUAL_ID:
			return getImage("Navigator?Link?context?Sensed", CIM3ElementTypes.Sensed_4012); //$NON-NLS-1$
		case SupportEditPart.VISUAL_ID:
			return getImage("Navigator?Link?context?Support", CIM3ElementTypes.Support_4013); //$NON-NLS-1$
		case RelevanceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?context?Relevance", CIM3ElementTypes.Relevance_4015); //$NON-NLS-1$
		case ConflictEditPart.VISUAL_ID:
			return getImage("Navigator?Link?context?Conflict", CIM3ElementTypes.Conflict_4016); //$NON-NLS-1$
		case RelationshipTocontextelementEditPart.VISUAL_ID:
			return getImage("Navigator?Link?context?Relationship?Tocontextelement", //$NON-NLS-1$
					CIM3ElementTypes.RelationshipTocontextelement_4018);
		case RelationshipTocontextelement2EditPart.VISUAL_ID:
			return getImage("Navigator?Link?context?Relationship?Tocontextelement", //$NON-NLS-1$
					CIM3ElementTypes.RelationshipTocontextelement_4019);
		case RelationshipTocontextelement3EditPart.VISUAL_ID:
			return getImage("Navigator?Link?context?Relationship?Tocontextelement", //$NON-NLS-1$
					CIM3ElementTypes.RelationshipTocontextelement_4020);
		case RelationshipTocontextelement4EditPart.VISUAL_ID:
			return getImage("Navigator?Link?context?Relationship?Tocontextelement", //$NON-NLS-1$
					CIM3ElementTypes.RelationshipTocontextelement_4021);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = CIM3DiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && CIM3ElementTypes.isKnownElementType(elementType)) {
			image = CIM3ElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof CIM3NavigatorGroup) {
			CIM3NavigatorGroup group = (CIM3NavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CIM3NavigatorItem) {
			CIM3NavigatorItem navigatorItem = (CIM3NavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (CIM3VisualIDRegistry.getVisualID(view)) {
		case ContextModelEditPart.VISUAL_ID:
			return getContextModel_1000Text(view);
		case CongnitiveEditPart.VISUAL_ID:
			return getCongnitive_2001Text(view);
		case IdentifyEditPart.VISUAL_ID:
			return getIdentify_2002Text(view);
		case CurrentEditPart.VISUAL_ID:
			return getCurrent_2003Text(view);
		case SocialEditPart.VISUAL_ID:
			return getSocial_2004Text(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2005Text(view);
		case PastEditPart.VISUAL_ID:
			return getPast_2006Text(view);
		case RefinementEditPart.VISUAL_ID:
			return getRefinement_2007Text(view);
		case PreferenceEditPart.VISUAL_ID:
			return getPreference_2008Text(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2009Text(view);
		case ComputingEditPart.VISUAL_ID:
			return getComputing_2010Text(view);
		case FutureEditPart.VISUAL_ID:
			return getFuture_2011Text(view);
		case RelativeEditPart.VISUAL_ID:
			return getRelative_2012Text(view);
		case ContextSourceEditPart.VISUAL_ID:
			return getContextSource_2013Text(view);
		case FocusEditPart.VISUAL_ID:
			return getFocus_2014Text(view);
		case FixedEditPart.VISUAL_ID:
			return getFixed_2015Text(view);
		case CompositeEditPart.VISUAL_ID:
			return getComposite_2016Text(view);
		case LocationEditPart.VISUAL_ID:
			return getLocation_2017Text(view);
		case UserEditPart.VISUAL_ID:
			return getUser_2018Text(view);
		case ContextElementRefinementEditPart.VISUAL_ID:
			return getContextElementRefinement_4001Text(view);
		case RefinementRefiningcontextsEditPart.VISUAL_ID:
			return getRefinementRefiningcontexts_4002Text(view);
		case ParallelEditPart.VISUAL_ID:
			return getParallel_4003Text(view);
		case ProfiledEditPart.VISUAL_ID:
			return getProfiled_4005Text(view);
		case CharacterizationEditPart.VISUAL_ID:
			return getCharacterization_4006Text(view);
		case CausalEditPart.VISUAL_ID:
			return getCausal_4007Text(view);
		case ValidityEditPart.VISUAL_ID:
			return getValidity_4009Text(view);
		case DerivedEditPart.VISUAL_ID:
			return getDerived_4010Text(view);
		case StaticEditPart.VISUAL_ID:
			return getStatic_4011Text(view);
		case SensedEditPart.VISUAL_ID:
			return getSensed_4012Text(view);
		case SupportEditPart.VISUAL_ID:
			return getSupport_4013Text(view);
		case RelevanceEditPart.VISUAL_ID:
			return getRelevance_4015Text(view);
		case ConflictEditPart.VISUAL_ID:
			return getConflict_4016Text(view);
		case RelationshipTocontextelementEditPart.VISUAL_ID:
			return getRelationshipTocontextelement_4018Text(view);
		case RelationshipTocontextelement2EditPart.VISUAL_ID:
			return getRelationshipTocontextelement_4019Text(view);
		case RelationshipTocontextelement3EditPart.VISUAL_ID:
			return getRelationshipTocontextelement_4020Text(view);
		case RelationshipTocontextelement4EditPart.VISUAL_ID:
			return getRelationshipTocontextelement_4021Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getContextModel_1000Text(View view) {
		ContextModel domainModelElement = (ContextModel) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCongnitive_2001Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Congnitive_2001,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(CongnitiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIdentify_2002Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Identify_2002,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(IdentifyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCurrent_2003Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Current_2003,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(CurrentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSocial_2004Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Social_2004,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(SocialNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActivity_2005Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Activity_2005,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(ActivityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPast_2006Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Past_2006,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(PastNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRefinement_2007Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Refinement_2007,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(RefinementTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPreference_2008Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Preference_2008,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(PreferenceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntity_2009Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Entity_2009,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(EntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComputing_2010Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Computing_2010,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(ComputingNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFuture_2011Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Future_2011,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(FutureNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRelative_2012Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Relative_2012,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(RelativeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContextSource_2013Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.ContextSource_2013,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(ContextSourceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFocus_2014Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Focus_2014,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(FocusFocalElementEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFixed_2015Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Fixed_2015,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(FixedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComposite_2016Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Composite_2016,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(CompositeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLocation_2017Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Location_2017,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(LocationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUser_2018Text(View view) {
		User domainModelElement = (User) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContextElementRefinement_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getRefinementRefiningcontexts_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getParallel_4003Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Parallel_4003,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(ParallelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProfiled_4005Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Profiled_4005,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(ProfiledNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCharacterization_4006Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Characterization_4006,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(CharacterizationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCausal_4007Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Causal_4007,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(CausalNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getValidity_4009Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Validity_4009,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(ValidityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDerived_4010Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Derived_4010,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(DerivedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getStatic_4011Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Static_4011,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(StaticNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSensed_4012Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Sensed_4012,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(SensedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSupport_4013Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Support_4013,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(SupportNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRelevance_4015Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Relevance_4015,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(RelevanceArgumentEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConflict_4016Text(View view) {
		IParser parser = CIM3ParserProvider.getParser(CIM3ElementTypes.Conflict_4016,
				view.getElement() != null ? view.getElement() : view,
				CIM3VisualIDRegistry.getType(ConflictNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CIM3DiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRelationshipTocontextelement_4018Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getRelationshipTocontextelement_4019Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getRelationshipTocontextelement_4020Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getRelationshipTocontextelement_4021Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return ContextModelEditPart.MODEL_ID.equals(CIM3VisualIDRegistry.getModelID(view));
	}

}
