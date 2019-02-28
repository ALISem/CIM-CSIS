package context.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import context.ContextPackage;
import context.diagram.edit.parts.ActivityEditPart;
import context.diagram.edit.parts.CausalEditPart;
import context.diagram.edit.parts.CharacterizationEditPart;
import context.diagram.edit.parts.CompositeEditPart;
import context.diagram.edit.parts.ComputingEditPart;
import context.diagram.edit.parts.ConflictEditPart;
import context.diagram.edit.parts.CongnitiveEditPart;
import context.diagram.edit.parts.ContextElementRefinementEditPart;
import context.diagram.edit.parts.ContextModelEditPart;
import context.diagram.edit.parts.ContextSourceEditPart;
import context.diagram.edit.parts.CurrentEditPart;
import context.diagram.edit.parts.DerivedEditPart;
import context.diagram.edit.parts.EntityEditPart;
import context.diagram.edit.parts.FixedEditPart;
import context.diagram.edit.parts.FocusEditPart;
import context.diagram.edit.parts.FutureEditPart;
import context.diagram.edit.parts.IdentifyEditPart;
import context.diagram.edit.parts.LocationEditPart;
import context.diagram.edit.parts.ParallelEditPart;
import context.diagram.edit.parts.PastEditPart;
import context.diagram.edit.parts.PreferenceEditPart;
import context.diagram.edit.parts.ProfiledEditPart;
import context.diagram.edit.parts.RefinementEditPart;
import context.diagram.edit.parts.RefinementRefiningcontextsEditPart;
import context.diagram.edit.parts.RelationshipTocontextelement2EditPart;
import context.diagram.edit.parts.RelationshipTocontextelement3EditPart;
import context.diagram.edit.parts.RelationshipTocontextelement4EditPart;
import context.diagram.edit.parts.RelationshipTocontextelementEditPart;
import context.diagram.edit.parts.RelativeEditPart;
import context.diagram.edit.parts.RelevanceEditPart;
import context.diagram.edit.parts.SensedEditPart;
import context.diagram.edit.parts.SocialEditPart;
import context.diagram.edit.parts.StaticEditPart;
import context.diagram.edit.parts.SupportEditPart;
import context.diagram.edit.parts.UserEditPart;
import context.diagram.edit.parts.ValidityEditPart;
import context.diagram.part.CIM3DiagramEditorPlugin;

/**
 * @generated
 */
public class CIM3ElementTypes {

	/**
	* @generated
	*/
	private CIM3ElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			CIM3DiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType ContextModel_1000 = getElementType("CIM3.diagram.ContextModel_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Congnitive_2001 = getElementType("CIM3.diagram.Congnitive_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Identify_2002 = getElementType("CIM3.diagram.Identify_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Current_2003 = getElementType("CIM3.diagram.Current_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Social_2004 = getElementType("CIM3.diagram.Social_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Activity_2005 = getElementType("CIM3.diagram.Activity_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Past_2006 = getElementType("CIM3.diagram.Past_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Refinement_2007 = getElementType("CIM3.diagram.Refinement_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Preference_2008 = getElementType("CIM3.diagram.Preference_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Entity_2009 = getElementType("CIM3.diagram.Entity_2009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Computing_2010 = getElementType("CIM3.diagram.Computing_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Future_2011 = getElementType("CIM3.diagram.Future_2011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Relative_2012 = getElementType("CIM3.diagram.Relative_2012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContextSource_2013 = getElementType("CIM3.diagram.ContextSource_2013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Focus_2014 = getElementType("CIM3.diagram.Focus_2014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Fixed_2015 = getElementType("CIM3.diagram.Fixed_2015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Composite_2016 = getElementType("CIM3.diagram.Composite_2016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Location_2017 = getElementType("CIM3.diagram.Location_2017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType User_2018 = getElementType("CIM3.diagram.User_2018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContextElementRefinement_4001 = getElementType(
			"CIM3.diagram.ContextElementRefinement_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RefinementRefiningcontexts_4002 = getElementType(
			"CIM3.diagram.RefinementRefiningcontexts_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Parallel_4003 = getElementType("CIM3.diagram.Parallel_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RelationshipTocontextelement_4018 = getElementType(
			"CIM3.diagram.RelationshipTocontextelement_4018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Profiled_4005 = getElementType("CIM3.diagram.Profiled_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Characterization_4006 = getElementType("CIM3.diagram.Characterization_4006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Causal_4007 = getElementType("CIM3.diagram.Causal_4007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RelationshipTocontextelement_4019 = getElementType(
			"CIM3.diagram.RelationshipTocontextelement_4019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Validity_4009 = getElementType("CIM3.diagram.Validity_4009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Derived_4010 = getElementType("CIM3.diagram.Derived_4010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Static_4011 = getElementType("CIM3.diagram.Static_4011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Sensed_4012 = getElementType("CIM3.diagram.Sensed_4012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Support_4013 = getElementType("CIM3.diagram.Support_4013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RelationshipTocontextelement_4020 = getElementType(
			"CIM3.diagram.RelationshipTocontextelement_4020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Relevance_4015 = getElementType("CIM3.diagram.Relevance_4015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Conflict_4016 = getElementType("CIM3.diagram.Conflict_4016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RelationshipTocontextelement_4021 = getElementType(
			"CIM3.diagram.RelationshipTocontextelement_4021"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ContextModel_1000, ContextPackage.eINSTANCE.getContextModel());

			elements.put(Congnitive_2001, ContextPackage.eINSTANCE.getCongnitive());

			elements.put(Identify_2002, ContextPackage.eINSTANCE.getIdentify());

			elements.put(Current_2003, ContextPackage.eINSTANCE.getCurrent());

			elements.put(Social_2004, ContextPackage.eINSTANCE.getSocial());

			elements.put(Activity_2005, ContextPackage.eINSTANCE.getActivity());

			elements.put(Past_2006, ContextPackage.eINSTANCE.getPast());

			elements.put(Refinement_2007, ContextPackage.eINSTANCE.getRefinement());

			elements.put(Preference_2008, ContextPackage.eINSTANCE.getPreference());

			elements.put(Entity_2009, ContextPackage.eINSTANCE.getEntity());

			elements.put(Computing_2010, ContextPackage.eINSTANCE.getComputing());

			elements.put(Future_2011, ContextPackage.eINSTANCE.getFuture());

			elements.put(Relative_2012, ContextPackage.eINSTANCE.getRelative());

			elements.put(ContextSource_2013, ContextPackage.eINSTANCE.getContextSource());

			elements.put(Focus_2014, ContextPackage.eINSTANCE.getFocus());

			elements.put(Fixed_2015, ContextPackage.eINSTANCE.getFixed());

			elements.put(Composite_2016, ContextPackage.eINSTANCE.getComposite());

			elements.put(Location_2017, ContextPackage.eINSTANCE.getLocation());

			elements.put(User_2018, ContextPackage.eINSTANCE.getUser());

			elements.put(ContextElementRefinement_4001, ContextPackage.eINSTANCE.getContextElement_Refinement());

			elements.put(RefinementRefiningcontexts_4002, ContextPackage.eINSTANCE.getRefinement_Refiningcontexts());

			elements.put(Parallel_4003, ContextPackage.eINSTANCE.getParallel());

			elements.put(RelationshipTocontextelement_4018,
					ContextPackage.eINSTANCE.getRelationship_Tocontextelement());

			elements.put(Profiled_4005, ContextPackage.eINSTANCE.getProfiled());

			elements.put(Characterization_4006, ContextPackage.eINSTANCE.getCharacterization());

			elements.put(Causal_4007, ContextPackage.eINSTANCE.getCausal());

			elements.put(RelationshipTocontextelement_4019,
					ContextPackage.eINSTANCE.getRelationship_Tocontextelement());

			elements.put(Validity_4009, ContextPackage.eINSTANCE.getValidity());

			elements.put(Derived_4010, ContextPackage.eINSTANCE.getDerived());

			elements.put(Static_4011, ContextPackage.eINSTANCE.getStatic());

			elements.put(Sensed_4012, ContextPackage.eINSTANCE.getSensed());

			elements.put(Support_4013, ContextPackage.eINSTANCE.getSupport());

			elements.put(RelationshipTocontextelement_4020,
					ContextPackage.eINSTANCE.getRelationship_Tocontextelement());

			elements.put(Relevance_4015, ContextPackage.eINSTANCE.getRelevance());

			elements.put(Conflict_4016, ContextPackage.eINSTANCE.getConflict());

			elements.put(RelationshipTocontextelement_4021,
					ContextPackage.eINSTANCE.getRelationship_Tocontextelement());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ContextModel_1000);
			KNOWN_ELEMENT_TYPES.add(Congnitive_2001);
			KNOWN_ELEMENT_TYPES.add(Identify_2002);
			KNOWN_ELEMENT_TYPES.add(Current_2003);
			KNOWN_ELEMENT_TYPES.add(Social_2004);
			KNOWN_ELEMENT_TYPES.add(Activity_2005);
			KNOWN_ELEMENT_TYPES.add(Past_2006);
			KNOWN_ELEMENT_TYPES.add(Refinement_2007);
			KNOWN_ELEMENT_TYPES.add(Preference_2008);
			KNOWN_ELEMENT_TYPES.add(Entity_2009);
			KNOWN_ELEMENT_TYPES.add(Computing_2010);
			KNOWN_ELEMENT_TYPES.add(Future_2011);
			KNOWN_ELEMENT_TYPES.add(Relative_2012);
			KNOWN_ELEMENT_TYPES.add(ContextSource_2013);
			KNOWN_ELEMENT_TYPES.add(Focus_2014);
			KNOWN_ELEMENT_TYPES.add(Fixed_2015);
			KNOWN_ELEMENT_TYPES.add(Composite_2016);
			KNOWN_ELEMENT_TYPES.add(Location_2017);
			KNOWN_ELEMENT_TYPES.add(User_2018);
			KNOWN_ELEMENT_TYPES.add(ContextElementRefinement_4001);
			KNOWN_ELEMENT_TYPES.add(RefinementRefiningcontexts_4002);
			KNOWN_ELEMENT_TYPES.add(Parallel_4003);
			KNOWN_ELEMENT_TYPES.add(RelationshipTocontextelement_4018);
			KNOWN_ELEMENT_TYPES.add(Profiled_4005);
			KNOWN_ELEMENT_TYPES.add(Characterization_4006);
			KNOWN_ELEMENT_TYPES.add(Causal_4007);
			KNOWN_ELEMENT_TYPES.add(RelationshipTocontextelement_4019);
			KNOWN_ELEMENT_TYPES.add(Validity_4009);
			KNOWN_ELEMENT_TYPES.add(Derived_4010);
			KNOWN_ELEMENT_TYPES.add(Static_4011);
			KNOWN_ELEMENT_TYPES.add(Sensed_4012);
			KNOWN_ELEMENT_TYPES.add(Support_4013);
			KNOWN_ELEMENT_TYPES.add(RelationshipTocontextelement_4020);
			KNOWN_ELEMENT_TYPES.add(Relevance_4015);
			KNOWN_ELEMENT_TYPES.add(Conflict_4016);
			KNOWN_ELEMENT_TYPES.add(RelationshipTocontextelement_4021);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ContextModelEditPart.VISUAL_ID:
			return ContextModel_1000;
		case CongnitiveEditPart.VISUAL_ID:
			return Congnitive_2001;
		case IdentifyEditPart.VISUAL_ID:
			return Identify_2002;
		case CurrentEditPart.VISUAL_ID:
			return Current_2003;
		case SocialEditPart.VISUAL_ID:
			return Social_2004;
		case ActivityEditPart.VISUAL_ID:
			return Activity_2005;
		case PastEditPart.VISUAL_ID:
			return Past_2006;
		case RefinementEditPart.VISUAL_ID:
			return Refinement_2007;
		case PreferenceEditPart.VISUAL_ID:
			return Preference_2008;
		case EntityEditPart.VISUAL_ID:
			return Entity_2009;
		case ComputingEditPart.VISUAL_ID:
			return Computing_2010;
		case FutureEditPart.VISUAL_ID:
			return Future_2011;
		case RelativeEditPart.VISUAL_ID:
			return Relative_2012;
		case ContextSourceEditPart.VISUAL_ID:
			return ContextSource_2013;
		case FocusEditPart.VISUAL_ID:
			return Focus_2014;
		case FixedEditPart.VISUAL_ID:
			return Fixed_2015;
		case CompositeEditPart.VISUAL_ID:
			return Composite_2016;
		case LocationEditPart.VISUAL_ID:
			return Location_2017;
		case UserEditPart.VISUAL_ID:
			return User_2018;
		case ContextElementRefinementEditPart.VISUAL_ID:
			return ContextElementRefinement_4001;
		case RefinementRefiningcontextsEditPart.VISUAL_ID:
			return RefinementRefiningcontexts_4002;
		case ParallelEditPart.VISUAL_ID:
			return Parallel_4003;
		case RelationshipTocontextelementEditPart.VISUAL_ID:
			return RelationshipTocontextelement_4018;
		case ProfiledEditPart.VISUAL_ID:
			return Profiled_4005;
		case CharacterizationEditPart.VISUAL_ID:
			return Characterization_4006;
		case CausalEditPart.VISUAL_ID:
			return Causal_4007;
		case RelationshipTocontextelement2EditPart.VISUAL_ID:
			return RelationshipTocontextelement_4019;
		case ValidityEditPart.VISUAL_ID:
			return Validity_4009;
		case DerivedEditPart.VISUAL_ID:
			return Derived_4010;
		case StaticEditPart.VISUAL_ID:
			return Static_4011;
		case SensedEditPart.VISUAL_ID:
			return Sensed_4012;
		case SupportEditPart.VISUAL_ID:
			return Support_4013;
		case RelationshipTocontextelement3EditPart.VISUAL_ID:
			return RelationshipTocontextelement_4020;
		case RelevanceEditPart.VISUAL_ID:
			return Relevance_4015;
		case ConflictEditPart.VISUAL_ID:
			return Conflict_4016;
		case RelationshipTocontextelement4EditPart.VISUAL_ID:
			return RelationshipTocontextelement_4021;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return context.diagram.providers.CIM3ElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return context.diagram.providers.CIM3ElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return context.diagram.providers.CIM3ElementTypes.getElement(elementTypeAdapter);
		}
	};

}
