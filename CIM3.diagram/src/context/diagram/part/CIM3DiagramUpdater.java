package context.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import context.Activity;
import context.Causal;
import context.Characterization;
import context.Composite;
import context.Computing;
import context.Conflict;
import context.Congnitive;
import context.ContextElement;
import context.ContextModel;
import context.ContextPackage;
import context.ContextSource;
import context.Current;
import context.Derived;
import context.Entity;
import context.Fixed;
import context.Focus;
import context.Future;
import context.Identify;
import context.Location;
import context.Parallel;
import context.Past;
import context.Preference;
import context.Profiled;
import context.Refinement;
import context.Relationship;
import context.Relative;
import context.Relevance;
import context.Sensed;
import context.Social;
import context.Static;
import context.Support;
import context.TimeConstraint;
import context.User;
import context.Validity;
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
import context.diagram.providers.CIM3ElementTypes;

/**
 * @generated
 */
public class CIM3DiagramUpdater {

	/**
	* @generated
	*/
	public static List<CIM3NodeDescriptor> getSemanticChildren(View view) {
		switch (CIM3VisualIDRegistry.getVisualID(view)) {
		case ContextModelEditPart.VISUAL_ID:
			return getContextModel_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CIM3NodeDescriptor> getContextModel_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ContextModel modelElement = (ContextModel) view.getElement();
		LinkedList<CIM3NodeDescriptor> result = new LinkedList<CIM3NodeDescriptor>();
		for (Iterator<?> it = modelElement.getContextelements().iterator(); it.hasNext();) {
			ContextElement childElement = (ContextElement) it.next();
			int visualID = CIM3VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CongnitiveEditPart.VISUAL_ID) {
				result.add(new CIM3NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IdentifyEditPart.VISUAL_ID) {
				result.add(new CIM3NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CurrentEditPart.VISUAL_ID) {
				result.add(new CIM3NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SocialEditPart.VISUAL_ID) {
				result.add(new CIM3NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityEditPart.VISUAL_ID) {
				result.add(new CIM3NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PastEditPart.VISUAL_ID) {
				result.add(new CIM3NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PreferenceEditPart.VISUAL_ID) {
				result.add(new CIM3NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComputingEditPart.VISUAL_ID) {
				result.add(new CIM3NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FutureEditPart.VISUAL_ID) {
				result.add(new CIM3NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CompositeEditPart.VISUAL_ID) {
				result.add(new CIM3NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LocationEditPart.VISUAL_ID) {
				result.add(new CIM3NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UserEditPart.VISUAL_ID) {
				result.add(new CIM3NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRefinements().iterator(); it.hasNext();) {
			Refinement childElement = (Refinement) it.next();
			int visualID = CIM3VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RefinementEditPart.VISUAL_ID) {
				result.add(new CIM3NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEntities().iterator(); it.hasNext();) {
			Entity childElement = (Entity) it.next();
			int visualID = CIM3VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EntityEditPart.VISUAL_ID) {
				result.add(new CIM3NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTimeconstraints().iterator(); it.hasNext();) {
			TimeConstraint childElement = (TimeConstraint) it.next();
			int visualID = CIM3VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RelativeEditPart.VISUAL_ID) {
				result.add(new CIM3NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FixedEditPart.VISUAL_ID) {
				result.add(new CIM3NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSources().iterator(); it.hasNext();) {
			ContextSource childElement = (ContextSource) it.next();
			int visualID = CIM3VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ContextSourceEditPart.VISUAL_ID) {
				result.add(new CIM3NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFoci().iterator(); it.hasNext();) {
			Focus childElement = (Focus) it.next();
			int visualID = CIM3VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FocusEditPart.VISUAL_ID) {
				result.add(new CIM3NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CIM3LinkDescriptor> getContainedLinks(View view) {
		switch (CIM3VisualIDRegistry.getVisualID(view)) {
		case ContextModelEditPart.VISUAL_ID:
			return getContextModel_1000ContainedLinks(view);
		case CongnitiveEditPart.VISUAL_ID:
			return getCongnitive_2001ContainedLinks(view);
		case IdentifyEditPart.VISUAL_ID:
			return getIdentify_2002ContainedLinks(view);
		case CurrentEditPart.VISUAL_ID:
			return getCurrent_2003ContainedLinks(view);
		case SocialEditPart.VISUAL_ID:
			return getSocial_2004ContainedLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2005ContainedLinks(view);
		case PastEditPart.VISUAL_ID:
			return getPast_2006ContainedLinks(view);
		case RefinementEditPart.VISUAL_ID:
			return getRefinement_2007ContainedLinks(view);
		case PreferenceEditPart.VISUAL_ID:
			return getPreference_2008ContainedLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2009ContainedLinks(view);
		case ComputingEditPart.VISUAL_ID:
			return getComputing_2010ContainedLinks(view);
		case FutureEditPart.VISUAL_ID:
			return getFuture_2011ContainedLinks(view);
		case RelativeEditPart.VISUAL_ID:
			return getRelative_2012ContainedLinks(view);
		case ContextSourceEditPart.VISUAL_ID:
			return getContextSource_2013ContainedLinks(view);
		case FocusEditPart.VISUAL_ID:
			return getFocus_2014ContainedLinks(view);
		case FixedEditPart.VISUAL_ID:
			return getFixed_2015ContainedLinks(view);
		case CompositeEditPart.VISUAL_ID:
			return getComposite_2016ContainedLinks(view);
		case LocationEditPart.VISUAL_ID:
			return getLocation_2017ContainedLinks(view);
		case UserEditPart.VISUAL_ID:
			return getUser_2018ContainedLinks(view);
		case ParallelEditPart.VISUAL_ID:
			return getParallel_4003ContainedLinks(view);
		case ProfiledEditPart.VISUAL_ID:
			return getProfiled_4005ContainedLinks(view);
		case CharacterizationEditPart.VISUAL_ID:
			return getCharacterization_4006ContainedLinks(view);
		case CausalEditPart.VISUAL_ID:
			return getCausal_4007ContainedLinks(view);
		case ValidityEditPart.VISUAL_ID:
			return getValidity_4009ContainedLinks(view);
		case DerivedEditPart.VISUAL_ID:
			return getDerived_4010ContainedLinks(view);
		case StaticEditPart.VISUAL_ID:
			return getStatic_4011ContainedLinks(view);
		case SensedEditPart.VISUAL_ID:
			return getSensed_4012ContainedLinks(view);
		case SupportEditPart.VISUAL_ID:
			return getSupport_4013ContainedLinks(view);
		case RelevanceEditPart.VISUAL_ID:
			return getRelevance_4015ContainedLinks(view);
		case ConflictEditPart.VISUAL_ID:
			return getConflict_4016ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CIM3LinkDescriptor> getIncomingLinks(View view) {
		switch (CIM3VisualIDRegistry.getVisualID(view)) {
		case CongnitiveEditPart.VISUAL_ID:
			return getCongnitive_2001IncomingLinks(view);
		case IdentifyEditPart.VISUAL_ID:
			return getIdentify_2002IncomingLinks(view);
		case CurrentEditPart.VISUAL_ID:
			return getCurrent_2003IncomingLinks(view);
		case SocialEditPart.VISUAL_ID:
			return getSocial_2004IncomingLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2005IncomingLinks(view);
		case PastEditPart.VISUAL_ID:
			return getPast_2006IncomingLinks(view);
		case RefinementEditPart.VISUAL_ID:
			return getRefinement_2007IncomingLinks(view);
		case PreferenceEditPart.VISUAL_ID:
			return getPreference_2008IncomingLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2009IncomingLinks(view);
		case ComputingEditPart.VISUAL_ID:
			return getComputing_2010IncomingLinks(view);
		case FutureEditPart.VISUAL_ID:
			return getFuture_2011IncomingLinks(view);
		case RelativeEditPart.VISUAL_ID:
			return getRelative_2012IncomingLinks(view);
		case ContextSourceEditPart.VISUAL_ID:
			return getContextSource_2013IncomingLinks(view);
		case FocusEditPart.VISUAL_ID:
			return getFocus_2014IncomingLinks(view);
		case FixedEditPart.VISUAL_ID:
			return getFixed_2015IncomingLinks(view);
		case CompositeEditPart.VISUAL_ID:
			return getComposite_2016IncomingLinks(view);
		case LocationEditPart.VISUAL_ID:
			return getLocation_2017IncomingLinks(view);
		case UserEditPart.VISUAL_ID:
			return getUser_2018IncomingLinks(view);
		case ParallelEditPart.VISUAL_ID:
			return getParallel_4003IncomingLinks(view);
		case ProfiledEditPart.VISUAL_ID:
			return getProfiled_4005IncomingLinks(view);
		case CharacterizationEditPart.VISUAL_ID:
			return getCharacterization_4006IncomingLinks(view);
		case CausalEditPart.VISUAL_ID:
			return getCausal_4007IncomingLinks(view);
		case ValidityEditPart.VISUAL_ID:
			return getValidity_4009IncomingLinks(view);
		case DerivedEditPart.VISUAL_ID:
			return getDerived_4010IncomingLinks(view);
		case StaticEditPart.VISUAL_ID:
			return getStatic_4011IncomingLinks(view);
		case SensedEditPart.VISUAL_ID:
			return getSensed_4012IncomingLinks(view);
		case SupportEditPart.VISUAL_ID:
			return getSupport_4013IncomingLinks(view);
		case RelevanceEditPart.VISUAL_ID:
			return getRelevance_4015IncomingLinks(view);
		case ConflictEditPart.VISUAL_ID:
			return getConflict_4016IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CIM3LinkDescriptor> getOutgoingLinks(View view) {
		switch (CIM3VisualIDRegistry.getVisualID(view)) {
		case CongnitiveEditPart.VISUAL_ID:
			return getCongnitive_2001OutgoingLinks(view);
		case IdentifyEditPart.VISUAL_ID:
			return getIdentify_2002OutgoingLinks(view);
		case CurrentEditPart.VISUAL_ID:
			return getCurrent_2003OutgoingLinks(view);
		case SocialEditPart.VISUAL_ID:
			return getSocial_2004OutgoingLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2005OutgoingLinks(view);
		case PastEditPart.VISUAL_ID:
			return getPast_2006OutgoingLinks(view);
		case RefinementEditPart.VISUAL_ID:
			return getRefinement_2007OutgoingLinks(view);
		case PreferenceEditPart.VISUAL_ID:
			return getPreference_2008OutgoingLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2009OutgoingLinks(view);
		case ComputingEditPart.VISUAL_ID:
			return getComputing_2010OutgoingLinks(view);
		case FutureEditPart.VISUAL_ID:
			return getFuture_2011OutgoingLinks(view);
		case RelativeEditPart.VISUAL_ID:
			return getRelative_2012OutgoingLinks(view);
		case ContextSourceEditPart.VISUAL_ID:
			return getContextSource_2013OutgoingLinks(view);
		case FocusEditPart.VISUAL_ID:
			return getFocus_2014OutgoingLinks(view);
		case FixedEditPart.VISUAL_ID:
			return getFixed_2015OutgoingLinks(view);
		case CompositeEditPart.VISUAL_ID:
			return getComposite_2016OutgoingLinks(view);
		case LocationEditPart.VISUAL_ID:
			return getLocation_2017OutgoingLinks(view);
		case UserEditPart.VISUAL_ID:
			return getUser_2018OutgoingLinks(view);
		case ParallelEditPart.VISUAL_ID:
			return getParallel_4003OutgoingLinks(view);
		case ProfiledEditPart.VISUAL_ID:
			return getProfiled_4005OutgoingLinks(view);
		case CharacterizationEditPart.VISUAL_ID:
			return getCharacterization_4006OutgoingLinks(view);
		case CausalEditPart.VISUAL_ID:
			return getCausal_4007OutgoingLinks(view);
		case ValidityEditPart.VISUAL_ID:
			return getValidity_4009OutgoingLinks(view);
		case DerivedEditPart.VISUAL_ID:
			return getDerived_4010OutgoingLinks(view);
		case StaticEditPart.VISUAL_ID:
			return getStatic_4011OutgoingLinks(view);
		case SensedEditPart.VISUAL_ID:
			return getSensed_4012OutgoingLinks(view);
		case SupportEditPart.VISUAL_ID:
			return getSupport_4013OutgoingLinks(view);
		case RelevanceEditPart.VISUAL_ID:
			return getRelevance_4015OutgoingLinks(view);
		case ConflictEditPart.VISUAL_ID:
			return getConflict_4016OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getContextModel_1000ContainedLinks(View view) {
		ContextModel modelElement = (ContextModel) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Parallel_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Profiled_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Characterization_4006(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Causal_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Validity_4009(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Derived_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Static_4011(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Sensed_4012(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Support_4013(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Relevance_4015(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Conflict_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getCongnitive_2001ContainedLinks(View view) {
		Congnitive modelElement = (Congnitive) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getIdentify_2002ContainedLinks(View view) {
		Identify modelElement = (Identify) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getCurrent_2003ContainedLinks(View view) {
		Current modelElement = (Current) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getSocial_2004ContainedLinks(View view) {
		Social modelElement = (Social) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getActivity_2005ContainedLinks(View view) {
		Activity modelElement = (Activity) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getPast_2006ContainedLinks(View view) {
		Past modelElement = (Past) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getRefinement_2007ContainedLinks(View view) {
		Refinement modelElement = (Refinement) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Refinement_Refiningcontexts_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getPreference_2008ContainedLinks(View view) {
		Preference modelElement = (Preference) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getEntity_2009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getComputing_2010ContainedLinks(View view) {
		Computing modelElement = (Computing) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getFuture_2011ContainedLinks(View view) {
		Future modelElement = (Future) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getRelative_2012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getContextSource_2013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getFocus_2014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getFixed_2015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getComposite_2016ContainedLinks(View view) {
		Composite modelElement = (Composite) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getLocation_2017ContainedLinks(View view) {
		Location modelElement = (Location) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getUser_2018ContainedLinks(View view) {
		User modelElement = (User) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getParallel_4003ContainedLinks(View view) {
		Parallel modelElement = (Parallel) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getProfiled_4005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getCharacterization_4006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getCausal_4007ContainedLinks(View view) {
		Causal modelElement = (Causal) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getValidity_4009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getDerived_4010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getStatic_4011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getSensed_4012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getSupport_4013ContainedLinks(View view) {
		Support modelElement = (Support) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getRelevance_4015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getConflict_4016ContainedLinks(View view) {
		Conflict modelElement = (Conflict) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getCongnitive_2001IncomingLinks(View view) {
		Congnitive modelElement = (Congnitive) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_Refinement_Refiningcontexts_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Parallel_4003(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Profiled_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Causal_4007(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Validity_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derived_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Static_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Sensed_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Support_4013(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Conflict_4016(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getIdentify_2002IncomingLinks(View view) {
		Identify modelElement = (Identify) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_Refinement_Refiningcontexts_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Parallel_4003(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Profiled_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Causal_4007(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Validity_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derived_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Static_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Sensed_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Support_4013(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Conflict_4016(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getCurrent_2003IncomingLinks(View view) {
		Current modelElement = (Current) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_Refinement_Refiningcontexts_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Parallel_4003(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Profiled_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Causal_4007(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Validity_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derived_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Static_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Sensed_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Support_4013(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Conflict_4016(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getSocial_2004IncomingLinks(View view) {
		Social modelElement = (Social) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_Refinement_Refiningcontexts_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Parallel_4003(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Profiled_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Causal_4007(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Validity_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derived_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Static_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Sensed_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Support_4013(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Conflict_4016(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getActivity_2005IncomingLinks(View view) {
		Activity modelElement = (Activity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_Refinement_Refiningcontexts_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Parallel_4003(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Profiled_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Causal_4007(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Validity_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derived_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Static_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Sensed_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Support_4013(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Conflict_4016(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getPast_2006IncomingLinks(View view) {
		Past modelElement = (Past) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_Refinement_Refiningcontexts_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Parallel_4003(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Profiled_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Causal_4007(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Validity_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derived_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Static_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Sensed_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Support_4013(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Conflict_4016(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getRefinement_2007IncomingLinks(View view) {
		Refinement modelElement = (Refinement) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getPreference_2008IncomingLinks(View view) {
		Preference modelElement = (Preference) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_Refinement_Refiningcontexts_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Parallel_4003(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Profiled_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Causal_4007(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Validity_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derived_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Static_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Sensed_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Support_4013(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Conflict_4016(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getEntity_2009IncomingLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Characterization_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getComputing_2010IncomingLinks(View view) {
		Computing modelElement = (Computing) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_Refinement_Refiningcontexts_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Parallel_4003(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Profiled_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Causal_4007(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Validity_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derived_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Static_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Sensed_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Support_4013(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Conflict_4016(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getFuture_2011IncomingLinks(View view) {
		Future modelElement = (Future) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_Refinement_Refiningcontexts_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Parallel_4003(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Profiled_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Causal_4007(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Validity_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derived_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Static_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Sensed_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Support_4013(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Conflict_4016(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getRelative_2012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getContextSource_2013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getFocus_2014IncomingLinks(View view) {
		Focus modelElement = (Focus) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relevance_4015(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getFixed_2015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getComposite_2016IncomingLinks(View view) {
		Composite modelElement = (Composite) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_Refinement_Refiningcontexts_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Parallel_4003(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Profiled_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Causal_4007(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Validity_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derived_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Static_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Sensed_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Support_4013(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Conflict_4016(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getLocation_2017IncomingLinks(View view) {
		Location modelElement = (Location) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_Refinement_Refiningcontexts_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Parallel_4003(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Profiled_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Causal_4007(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Validity_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derived_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Static_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Sensed_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Support_4013(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Conflict_4016(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getUser_2018IncomingLinks(View view) {
		User modelElement = (User) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_Refinement_Refiningcontexts_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Parallel_4003(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Profiled_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Causal_4007(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Validity_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Derived_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Static_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Sensed_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Support_4013(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Conflict_4016(modelElement, crossReferences));
		result.addAll(
				getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getParallel_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getProfiled_4005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getCharacterization_4006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getCausal_4007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getValidity_4009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getDerived_4010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getStatic_4011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getSensed_4012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getSupport_4013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getRelevance_4015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getConflict_4016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getCongnitive_2001OutgoingLinks(View view) {
		Congnitive modelElement = (Congnitive) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Parallel_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Characterization_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Causal_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Support_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relevance_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Conflict_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getIdentify_2002OutgoingLinks(View view) {
		Identify modelElement = (Identify) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Parallel_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Characterization_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Causal_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Support_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relevance_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Conflict_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getCurrent_2003OutgoingLinks(View view) {
		Current modelElement = (Current) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Parallel_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Characterization_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Causal_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Support_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relevance_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Conflict_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getSocial_2004OutgoingLinks(View view) {
		Social modelElement = (Social) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Parallel_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Characterization_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Causal_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Support_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relevance_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Conflict_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getActivity_2005OutgoingLinks(View view) {
		Activity modelElement = (Activity) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Parallel_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Characterization_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Causal_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Support_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relevance_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Conflict_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getPast_2006OutgoingLinks(View view) {
		Past modelElement = (Past) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Parallel_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Characterization_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Causal_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Support_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relevance_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Conflict_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getRefinement_2007OutgoingLinks(View view) {
		Refinement modelElement = (Refinement) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Refinement_Refiningcontexts_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getPreference_2008OutgoingLinks(View view) {
		Preference modelElement = (Preference) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Parallel_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Characterization_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Causal_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Support_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relevance_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Conflict_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getEntity_2009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getComputing_2010OutgoingLinks(View view) {
		Computing modelElement = (Computing) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Parallel_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Characterization_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Causal_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Support_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relevance_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Conflict_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getFuture_2011OutgoingLinks(View view) {
		Future modelElement = (Future) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Parallel_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Characterization_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Causal_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Support_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relevance_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Conflict_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getRelative_2012OutgoingLinks(View view) {
		Relative modelElement = (Relative) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Validity_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getContextSource_2013OutgoingLinks(View view) {
		ContextSource modelElement = (ContextSource) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Profiled_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Derived_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Static_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Sensed_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getFocus_2014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getFixed_2015OutgoingLinks(View view) {
		Fixed modelElement = (Fixed) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Validity_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getComposite_2016OutgoingLinks(View view) {
		Composite modelElement = (Composite) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Parallel_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Characterization_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Causal_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Support_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relevance_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Conflict_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getLocation_2017OutgoingLinks(View view) {
		Location modelElement = (Location) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Parallel_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Characterization_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Causal_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Support_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relevance_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Conflict_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getUser_2018OutgoingLinks(View view) {
		User modelElement = (User) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Parallel_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Characterization_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Causal_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Support_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relevance_4015(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Conflict_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getParallel_4003OutgoingLinks(View view) {
		Parallel modelElement = (Parallel) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getProfiled_4005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getCharacterization_4006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getCausal_4007OutgoingLinks(View view) {
		Causal modelElement = (Causal) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getValidity_4009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getDerived_4010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getStatic_4011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getSensed_4012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getSupport_4013OutgoingLinks(View view) {
		Support modelElement = (Support) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getRelevance_4015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CIM3LinkDescriptor> getConflict_4016OutgoingLinks(View view) {
		Conflict modelElement = (Conflict) view.getElement();
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getContainedTypeModelFacetLinks_Parallel_4003(
			ContextModel container) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Parallel) {
				continue;
			}
			Parallel link = (Parallel) linkObject;
			if (ParallelEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ContextElement dst = link.getTocontextelement();
			List sources = link.getFromcontextelement();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextElement) {
				continue;
			}
			ContextElement src = (ContextElement) theSource;
			result.add(
					new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Parallel_4003, ParallelEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getContainedTypeModelFacetLinks_Profiled_4005(
			ContextModel container) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getAcquisitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Profiled) {
				continue;
			}
			Profiled link = (Profiled) linkObject;
			if (ProfiledEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getAquiredcontext();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ContextElement) {
				continue;
			}
			ContextElement dst = (ContextElement) theTarget;
			List sources = link.getContextsource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextSource) {
				continue;
			}
			ContextSource src = (ContextSource) theSource;
			result.add(
					new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Profiled_4005, ProfiledEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getContainedTypeModelFacetLinks_Characterization_4006(
			ContextModel container) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getCharacterizations().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Characterization) {
				continue;
			}
			Characterization link = (Characterization) linkObject;
			if (CharacterizationEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getCharEntity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Entity) {
				continue;
			}
			Entity dst = (Entity) theTarget;
			List sources = link.getCharContext();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextElement) {
				continue;
			}
			ContextElement src = (ContextElement) theSource;
			result.add(new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Characterization_4006,
					CharacterizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getContainedTypeModelFacetLinks_Causal_4007(ContextModel container) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Causal) {
				continue;
			}
			Causal link = (Causal) linkObject;
			if (CausalEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ContextElement dst = link.getTocontextelement();
			List sources = link.getFromcontextelement();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextElement) {
				continue;
			}
			ContextElement src = (ContextElement) theSource;
			result.add(new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Causal_4007, CausalEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getContainedTypeModelFacetLinks_Validity_4009(
			ContextModel container) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getValidity().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Validity) {
				continue;
			}
			Validity link = (Validity) linkObject;
			if (ValidityEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getValidContext();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ContextElement) {
				continue;
			}
			ContextElement dst = (ContextElement) theTarget;
			List sources = link.getConstraint();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof TimeConstraint) {
				continue;
			}
			TimeConstraint src = (TimeConstraint) theSource;
			result.add(
					new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Validity_4009, ValidityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getContainedTypeModelFacetLinks_Derived_4010(ContextModel container) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getAcquisitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Derived) {
				continue;
			}
			Derived link = (Derived) linkObject;
			if (DerivedEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getAquiredcontext();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ContextElement) {
				continue;
			}
			ContextElement dst = (ContextElement) theTarget;
			List sources = link.getContextsource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextSource) {
				continue;
			}
			ContextSource src = (ContextSource) theSource;
			result.add(
					new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Derived_4010, DerivedEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getContainedTypeModelFacetLinks_Static_4011(ContextModel container) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getAcquisitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Static) {
				continue;
			}
			Static link = (Static) linkObject;
			if (StaticEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getAquiredcontext();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ContextElement) {
				continue;
			}
			ContextElement dst = (ContextElement) theTarget;
			List sources = link.getContextsource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextSource) {
				continue;
			}
			ContextSource src = (ContextSource) theSource;
			result.add(new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Static_4011, StaticEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getContainedTypeModelFacetLinks_Sensed_4012(ContextModel container) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getAcquisitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Sensed) {
				continue;
			}
			Sensed link = (Sensed) linkObject;
			if (SensedEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getAquiredcontext();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ContextElement) {
				continue;
			}
			ContextElement dst = (ContextElement) theTarget;
			List sources = link.getContextsource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextSource) {
				continue;
			}
			ContextSource src = (ContextSource) theSource;
			result.add(new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Sensed_4012, SensedEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getContainedTypeModelFacetLinks_Support_4013(ContextModel container) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Support) {
				continue;
			}
			Support link = (Support) linkObject;
			if (SupportEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ContextElement dst = link.getTocontextelement();
			List sources = link.getFromcontextelement();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextElement) {
				continue;
			}
			ContextElement src = (ContextElement) theSource;
			result.add(
					new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Support_4013, SupportEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getContainedTypeModelFacetLinks_Relevance_4015(
			ContextModel container) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getRelevance().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relevance) {
				continue;
			}
			Relevance link = (Relevance) linkObject;
			if (RelevanceEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getFocus();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Focus) {
				continue;
			}
			Focus dst = (Focus) theTarget;
			List sources = link.getRelevantContext();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextElement) {
				continue;
			}
			ContextElement src = (ContextElement) theSource;
			result.add(new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Relevance_4015,
					RelevanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getContainedTypeModelFacetLinks_Conflict_4016(
			ContextModel container) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Conflict) {
				continue;
			}
			Conflict link = (Conflict) linkObject;
			if (ConflictEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ContextElement dst = link.getTocontextelement();
			List sources = link.getFromcontextelement();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextElement) {
				continue;
			}
			ContextElement src = (ContextElement) theSource;
			result.add(
					new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Conflict_4016, ConflictEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CIM3LinkDescriptor> getIncomingFeatureModelFacetLinks_ContextElement_Refinement_4001(
			Refinement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ContextPackage.eINSTANCE.getContextElement_Refinement()) {
				result.add(new CIM3LinkDescriptor(setting.getEObject(), target,
						CIM3ElementTypes.ContextElementRefinement_4001, ContextElementRefinementEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CIM3LinkDescriptor> getIncomingFeatureModelFacetLinks_Refinement_Refiningcontexts_4002(
			ContextElement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ContextPackage.eINSTANCE.getRefinement_Refiningcontexts()) {
				result.add(new CIM3LinkDescriptor(setting.getEObject(), target,
						CIM3ElementTypes.RefinementRefiningcontexts_4002,
						RefinementRefiningcontextsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CIM3LinkDescriptor> getIncomingTypeModelFacetLinks_Parallel_4003(ContextElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ContextPackage.eINSTANCE.getRelationship_Tocontextelement()
					|| false == setting.getEObject() instanceof Parallel) {
				continue;
			}
			Parallel link = (Parallel) setting.getEObject();
			if (ParallelEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getFromcontextelement();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextElement) {
				continue;
			}
			ContextElement src = (ContextElement) theSource;
			result.add(new CIM3LinkDescriptor(src, target, link, CIM3ElementTypes.Parallel_4003,
					ParallelEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CIM3LinkDescriptor> getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(
			ContextElement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ContextPackage.eINSTANCE.getRelationship_Tocontextelement()) {
				result.add(new CIM3LinkDescriptor(setting.getEObject(), target,
						CIM3ElementTypes.RelationshipTocontextelement_4018,
						RelationshipTocontextelementEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CIM3LinkDescriptor> getIncomingTypeModelFacetLinks_Profiled_4005(ContextElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ContextPackage.eINSTANCE.getAcquisition_Aquiredcontext()
					|| false == setting.getEObject() instanceof Profiled) {
				continue;
			}
			Profiled link = (Profiled) setting.getEObject();
			if (ProfiledEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getContextsource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextSource) {
				continue;
			}
			ContextSource src = (ContextSource) theSource;
			result.add(new CIM3LinkDescriptor(src, target, link, CIM3ElementTypes.Profiled_4005,
					ProfiledEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CIM3LinkDescriptor> getIncomingTypeModelFacetLinks_Characterization_4006(Entity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ContextPackage.eINSTANCE.getCharacterization_CharEntity()
					|| false == setting.getEObject() instanceof Characterization) {
				continue;
			}
			Characterization link = (Characterization) setting.getEObject();
			if (CharacterizationEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getCharContext();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextElement) {
				continue;
			}
			ContextElement src = (ContextElement) theSource;
			result.add(new CIM3LinkDescriptor(src, target, link, CIM3ElementTypes.Characterization_4006,
					CharacterizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CIM3LinkDescriptor> getIncomingTypeModelFacetLinks_Causal_4007(ContextElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ContextPackage.eINSTANCE.getRelationship_Tocontextelement()
					|| false == setting.getEObject() instanceof Causal) {
				continue;
			}
			Causal link = (Causal) setting.getEObject();
			if (CausalEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getFromcontextelement();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextElement) {
				continue;
			}
			ContextElement src = (ContextElement) theSource;
			result.add(
					new CIM3LinkDescriptor(src, target, link, CIM3ElementTypes.Causal_4007, CausalEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CIM3LinkDescriptor> getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(
			ContextElement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ContextPackage.eINSTANCE.getRelationship_Tocontextelement()) {
				result.add(new CIM3LinkDescriptor(setting.getEObject(), target,
						CIM3ElementTypes.RelationshipTocontextelement_4019,
						RelationshipTocontextelement2EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CIM3LinkDescriptor> getIncomingTypeModelFacetLinks_Validity_4009(ContextElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ContextPackage.eINSTANCE.getValidity_ValidContext()
					|| false == setting.getEObject() instanceof Validity) {
				continue;
			}
			Validity link = (Validity) setting.getEObject();
			if (ValidityEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getConstraint();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof TimeConstraint) {
				continue;
			}
			TimeConstraint src = (TimeConstraint) theSource;
			result.add(new CIM3LinkDescriptor(src, target, link, CIM3ElementTypes.Validity_4009,
					ValidityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CIM3LinkDescriptor> getIncomingTypeModelFacetLinks_Derived_4010(ContextElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ContextPackage.eINSTANCE.getAcquisition_Aquiredcontext()
					|| false == setting.getEObject() instanceof Derived) {
				continue;
			}
			Derived link = (Derived) setting.getEObject();
			if (DerivedEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getContextsource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextSource) {
				continue;
			}
			ContextSource src = (ContextSource) theSource;
			result.add(new CIM3LinkDescriptor(src, target, link, CIM3ElementTypes.Derived_4010,
					DerivedEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CIM3LinkDescriptor> getIncomingTypeModelFacetLinks_Static_4011(ContextElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ContextPackage.eINSTANCE.getAcquisition_Aquiredcontext()
					|| false == setting.getEObject() instanceof Static) {
				continue;
			}
			Static link = (Static) setting.getEObject();
			if (StaticEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getContextsource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextSource) {
				continue;
			}
			ContextSource src = (ContextSource) theSource;
			result.add(
					new CIM3LinkDescriptor(src, target, link, CIM3ElementTypes.Static_4011, StaticEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CIM3LinkDescriptor> getIncomingTypeModelFacetLinks_Sensed_4012(ContextElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ContextPackage.eINSTANCE.getAcquisition_Aquiredcontext()
					|| false == setting.getEObject() instanceof Sensed) {
				continue;
			}
			Sensed link = (Sensed) setting.getEObject();
			if (SensedEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getContextsource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextSource) {
				continue;
			}
			ContextSource src = (ContextSource) theSource;
			result.add(
					new CIM3LinkDescriptor(src, target, link, CIM3ElementTypes.Sensed_4012, SensedEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CIM3LinkDescriptor> getIncomingTypeModelFacetLinks_Support_4013(ContextElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ContextPackage.eINSTANCE.getRelationship_Tocontextelement()
					|| false == setting.getEObject() instanceof Support) {
				continue;
			}
			Support link = (Support) setting.getEObject();
			if (SupportEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getFromcontextelement();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextElement) {
				continue;
			}
			ContextElement src = (ContextElement) theSource;
			result.add(new CIM3LinkDescriptor(src, target, link, CIM3ElementTypes.Support_4013,
					SupportEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CIM3LinkDescriptor> getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(
			ContextElement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ContextPackage.eINSTANCE.getRelationship_Tocontextelement()) {
				result.add(new CIM3LinkDescriptor(setting.getEObject(), target,
						CIM3ElementTypes.RelationshipTocontextelement_4020,
						RelationshipTocontextelement3EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CIM3LinkDescriptor> getIncomingTypeModelFacetLinks_Relevance_4015(Focus target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ContextPackage.eINSTANCE.getRelevance_Focus()
					|| false == setting.getEObject() instanceof Relevance) {
				continue;
			}
			Relevance link = (Relevance) setting.getEObject();
			if (RelevanceEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getRelevantContext();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextElement) {
				continue;
			}
			ContextElement src = (ContextElement) theSource;
			result.add(new CIM3LinkDescriptor(src, target, link, CIM3ElementTypes.Relevance_4015,
					RelevanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CIM3LinkDescriptor> getIncomingTypeModelFacetLinks_Conflict_4016(ContextElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ContextPackage.eINSTANCE.getRelationship_Tocontextelement()
					|| false == setting.getEObject() instanceof Conflict) {
				continue;
			}
			Conflict link = (Conflict) setting.getEObject();
			if (ConflictEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getFromcontextelement();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextElement) {
				continue;
			}
			ContextElement src = (ContextElement) theSource;
			result.add(new CIM3LinkDescriptor(src, target, link, CIM3ElementTypes.Conflict_4016,
					ConflictEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CIM3LinkDescriptor> getIncomingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(
			ContextElement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ContextPackage.eINSTANCE.getRelationship_Tocontextelement()) {
				result.add(new CIM3LinkDescriptor(setting.getEObject(), target,
						CIM3ElementTypes.RelationshipTocontextelement_4021,
						RelationshipTocontextelement4EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getOutgoingFeatureModelFacetLinks_ContextElement_Refinement_4001(
			ContextElement source) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> destinations = source.getRefinement().iterator(); destinations.hasNext();) {
			Refinement destination = (Refinement) destinations.next();
			result.add(new CIM3LinkDescriptor(source, destination, CIM3ElementTypes.ContextElementRefinement_4001,
					ContextElementRefinementEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getOutgoingFeatureModelFacetLinks_Refinement_Refiningcontexts_4002(
			Refinement source) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> destinations = source.getRefiningcontexts().iterator(); destinations.hasNext();) {
			ContextElement destination = (ContextElement) destinations.next();
			result.add(new CIM3LinkDescriptor(source, destination, CIM3ElementTypes.RefinementRefiningcontexts_4002,
					RefinementRefiningcontextsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getOutgoingTypeModelFacetLinks_Parallel_4003(ContextElement source) {
		ContextModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ContextModel) {
				container = (ContextModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Parallel) {
				continue;
			}
			Parallel link = (Parallel) linkObject;
			if (ParallelEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ContextElement dst = link.getTocontextelement();
			List sources = link.getFromcontextelement();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextElement) {
				continue;
			}
			ContextElement src = (ContextElement) theSource;
			if (src != source) {
				continue;
			}
			result.add(
					new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Parallel_4003, ParallelEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4018(
			Relationship source) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		ContextElement destination = source.getTocontextelement();
		if (destination == null) {
			return result;
		}
		result.add(new CIM3LinkDescriptor(source, destination, CIM3ElementTypes.RelationshipTocontextelement_4018,
				RelationshipTocontextelementEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getOutgoingTypeModelFacetLinks_Profiled_4005(ContextSource source) {
		ContextModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ContextModel) {
				container = (ContextModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getAcquisitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Profiled) {
				continue;
			}
			Profiled link = (Profiled) linkObject;
			if (ProfiledEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getAquiredcontext();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ContextElement) {
				continue;
			}
			ContextElement dst = (ContextElement) theTarget;
			List sources = link.getContextsource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextSource) {
				continue;
			}
			ContextSource src = (ContextSource) theSource;
			if (src != source) {
				continue;
			}
			result.add(
					new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Profiled_4005, ProfiledEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getOutgoingTypeModelFacetLinks_Characterization_4006(
			ContextElement source) {
		ContextModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ContextModel) {
				container = (ContextModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getCharacterizations().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Characterization) {
				continue;
			}
			Characterization link = (Characterization) linkObject;
			if (CharacterizationEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getCharEntity();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Entity) {
				continue;
			}
			Entity dst = (Entity) theTarget;
			List sources = link.getCharContext();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextElement) {
				continue;
			}
			ContextElement src = (ContextElement) theSource;
			if (src != source) {
				continue;
			}
			result.add(new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Characterization_4006,
					CharacterizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getOutgoingTypeModelFacetLinks_Causal_4007(ContextElement source) {
		ContextModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ContextModel) {
				container = (ContextModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Causal) {
				continue;
			}
			Causal link = (Causal) linkObject;
			if (CausalEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ContextElement dst = link.getTocontextelement();
			List sources = link.getFromcontextelement();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextElement) {
				continue;
			}
			ContextElement src = (ContextElement) theSource;
			if (src != source) {
				continue;
			}
			result.add(new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Causal_4007, CausalEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4019(
			Relationship source) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		ContextElement destination = source.getTocontextelement();
		if (destination == null) {
			return result;
		}
		result.add(new CIM3LinkDescriptor(source, destination, CIM3ElementTypes.RelationshipTocontextelement_4019,
				RelationshipTocontextelement2EditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getOutgoingTypeModelFacetLinks_Validity_4009(TimeConstraint source) {
		ContextModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ContextModel) {
				container = (ContextModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getValidity().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Validity) {
				continue;
			}
			Validity link = (Validity) linkObject;
			if (ValidityEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getValidContext();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ContextElement) {
				continue;
			}
			ContextElement dst = (ContextElement) theTarget;
			List sources = link.getConstraint();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof TimeConstraint) {
				continue;
			}
			TimeConstraint src = (TimeConstraint) theSource;
			if (src != source) {
				continue;
			}
			result.add(
					new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Validity_4009, ValidityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getOutgoingTypeModelFacetLinks_Derived_4010(ContextSource source) {
		ContextModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ContextModel) {
				container = (ContextModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getAcquisitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Derived) {
				continue;
			}
			Derived link = (Derived) linkObject;
			if (DerivedEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getAquiredcontext();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ContextElement) {
				continue;
			}
			ContextElement dst = (ContextElement) theTarget;
			List sources = link.getContextsource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextSource) {
				continue;
			}
			ContextSource src = (ContextSource) theSource;
			if (src != source) {
				continue;
			}
			result.add(
					new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Derived_4010, DerivedEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getOutgoingTypeModelFacetLinks_Static_4011(ContextSource source) {
		ContextModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ContextModel) {
				container = (ContextModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getAcquisitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Static) {
				continue;
			}
			Static link = (Static) linkObject;
			if (StaticEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getAquiredcontext();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ContextElement) {
				continue;
			}
			ContextElement dst = (ContextElement) theTarget;
			List sources = link.getContextsource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextSource) {
				continue;
			}
			ContextSource src = (ContextSource) theSource;
			if (src != source) {
				continue;
			}
			result.add(new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Static_4011, StaticEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getOutgoingTypeModelFacetLinks_Sensed_4012(ContextSource source) {
		ContextModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ContextModel) {
				container = (ContextModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getAcquisitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Sensed) {
				continue;
			}
			Sensed link = (Sensed) linkObject;
			if (SensedEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getAquiredcontext();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof ContextElement) {
				continue;
			}
			ContextElement dst = (ContextElement) theTarget;
			List sources = link.getContextsource();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextSource) {
				continue;
			}
			ContextSource src = (ContextSource) theSource;
			if (src != source) {
				continue;
			}
			result.add(new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Sensed_4012, SensedEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getOutgoingTypeModelFacetLinks_Support_4013(ContextElement source) {
		ContextModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ContextModel) {
				container = (ContextModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Support) {
				continue;
			}
			Support link = (Support) linkObject;
			if (SupportEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ContextElement dst = link.getTocontextelement();
			List sources = link.getFromcontextelement();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextElement) {
				continue;
			}
			ContextElement src = (ContextElement) theSource;
			if (src != source) {
				continue;
			}
			result.add(
					new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Support_4013, SupportEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4020(
			Relationship source) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		ContextElement destination = source.getTocontextelement();
		if (destination == null) {
			return result;
		}
		result.add(new CIM3LinkDescriptor(source, destination, CIM3ElementTypes.RelationshipTocontextelement_4020,
				RelationshipTocontextelement3EditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getOutgoingTypeModelFacetLinks_Relevance_4015(ContextElement source) {
		ContextModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ContextModel) {
				container = (ContextModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getRelevance().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relevance) {
				continue;
			}
			Relevance link = (Relevance) linkObject;
			if (RelevanceEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getFocus();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Focus) {
				continue;
			}
			Focus dst = (Focus) theTarget;
			List sources = link.getRelevantContext();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextElement) {
				continue;
			}
			ContextElement src = (ContextElement) theSource;
			if (src != source) {
				continue;
			}
			result.add(new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Relevance_4015,
					RelevanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getOutgoingTypeModelFacetLinks_Conflict_4016(ContextElement source) {
		ContextModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ContextModel) {
				container = (ContextModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		for (Iterator<?> links = container.getRelationships().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Conflict) {
				continue;
			}
			Conflict link = (Conflict) linkObject;
			if (ConflictEditPart.VISUAL_ID != CIM3VisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ContextElement dst = link.getTocontextelement();
			List sources = link.getFromcontextelement();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ContextElement) {
				continue;
			}
			ContextElement src = (ContextElement) theSource;
			if (src != source) {
				continue;
			}
			result.add(
					new CIM3LinkDescriptor(src, dst, link, CIM3ElementTypes.Conflict_4016, ConflictEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CIM3LinkDescriptor> getOutgoingFeatureModelFacetLinks_Relationship_Tocontextelement_4021(
			Relationship source) {
		LinkedList<CIM3LinkDescriptor> result = new LinkedList<CIM3LinkDescriptor>();
		ContextElement destination = source.getTocontextelement();
		if (destination == null) {
			return result;
		}
		result.add(new CIM3LinkDescriptor(source, destination, CIM3ElementTypes.RelationshipTocontextelement_4021,
				RelationshipTocontextelement4EditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<CIM3NodeDescriptor> getSemanticChildren(View view) {
			return CIM3DiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CIM3LinkDescriptor> getContainedLinks(View view) {
			return CIM3DiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CIM3LinkDescriptor> getIncomingLinks(View view) {
			return CIM3DiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CIM3LinkDescriptor> getOutgoingLinks(View view) {
			return CIM3DiagramUpdater.getOutgoingLinks(view);
		}
	};

}
