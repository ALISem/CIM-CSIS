package context.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import context.ContextModel;
import context.ContextPackage;
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
import context.diagram.edit.parts.RefinementTypeEditPart;
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

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class CIM3VisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "CIM3.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ContextModelEditPart.MODEL_ID.equals(view.getType())) {
				return ContextModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return context.diagram.part.CIM3VisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				CIM3DiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ContextPackage.eINSTANCE.getContextModel().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ContextModel) domainElement)) {
			return ContextModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = context.diagram.part.CIM3VisualIDRegistry.getModelID(containerView);
		if (!ContextModelEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ContextModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = context.diagram.part.CIM3VisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ContextModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ContextModelEditPart.VISUAL_ID:
			if (ContextPackage.eINSTANCE.getCongnitive().isSuperTypeOf(domainElement.eClass())) {
				return CongnitiveEditPart.VISUAL_ID;
			}
			if (ContextPackage.eINSTANCE.getIdentify().isSuperTypeOf(domainElement.eClass())) {
				return IdentifyEditPart.VISUAL_ID;
			}
			if (ContextPackage.eINSTANCE.getCurrent().isSuperTypeOf(domainElement.eClass())) {
				return CurrentEditPart.VISUAL_ID;
			}
			if (ContextPackage.eINSTANCE.getSocial().isSuperTypeOf(domainElement.eClass())) {
				return SocialEditPart.VISUAL_ID;
			}
			if (ContextPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
				return ActivityEditPart.VISUAL_ID;
			}
			if (ContextPackage.eINSTANCE.getPast().isSuperTypeOf(domainElement.eClass())) {
				return PastEditPart.VISUAL_ID;
			}
			if (ContextPackage.eINSTANCE.getRefinement().isSuperTypeOf(domainElement.eClass())) {
				return RefinementEditPart.VISUAL_ID;
			}
			if (ContextPackage.eINSTANCE.getPreference().isSuperTypeOf(domainElement.eClass())) {
				return PreferenceEditPart.VISUAL_ID;
			}
			if (ContextPackage.eINSTANCE.getEntity().isSuperTypeOf(domainElement.eClass())) {
				return EntityEditPart.VISUAL_ID;
			}
			if (ContextPackage.eINSTANCE.getComputing().isSuperTypeOf(domainElement.eClass())) {
				return ComputingEditPart.VISUAL_ID;
			}
			if (ContextPackage.eINSTANCE.getFuture().isSuperTypeOf(domainElement.eClass())) {
				return FutureEditPart.VISUAL_ID;
			}
			if (ContextPackage.eINSTANCE.getRelative().isSuperTypeOf(domainElement.eClass())) {
				return RelativeEditPart.VISUAL_ID;
			}
			if (ContextPackage.eINSTANCE.getContextSource().isSuperTypeOf(domainElement.eClass())) {
				return ContextSourceEditPart.VISUAL_ID;
			}
			if (ContextPackage.eINSTANCE.getFocus().isSuperTypeOf(domainElement.eClass())) {
				return FocusEditPart.VISUAL_ID;
			}
			if (ContextPackage.eINSTANCE.getFixed().isSuperTypeOf(domainElement.eClass())) {
				return FixedEditPart.VISUAL_ID;
			}
			if (ContextPackage.eINSTANCE.getComposite().isSuperTypeOf(domainElement.eClass())) {
				return CompositeEditPart.VISUAL_ID;
			}
			if (ContextPackage.eINSTANCE.getLocation().isSuperTypeOf(domainElement.eClass())) {
				return LocationEditPart.VISUAL_ID;
			}
			if (ContextPackage.eINSTANCE.getUser().isSuperTypeOf(domainElement.eClass())) {
				return UserEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = context.diagram.part.CIM3VisualIDRegistry.getModelID(containerView);
		if (!ContextModelEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ContextModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = context.diagram.part.CIM3VisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ContextModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ContextModelEditPart.VISUAL_ID:
			if (CongnitiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IdentifyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CurrentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SocialEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PastEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RefinementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PreferenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComputingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FutureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RelativeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextSourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FocusEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FixedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CompositeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LocationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CongnitiveEditPart.VISUAL_ID:
			if (CongnitiveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IdentifyEditPart.VISUAL_ID:
			if (IdentifyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CurrentEditPart.VISUAL_ID:
			if (CurrentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SocialEditPart.VISUAL_ID:
			if (SocialNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityEditPart.VISUAL_ID:
			if (ActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PastEditPart.VISUAL_ID:
			if (PastNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RefinementEditPart.VISUAL_ID:
			if (RefinementTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PreferenceEditPart.VISUAL_ID:
			if (PreferenceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityEditPart.VISUAL_ID:
			if (EntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComputingEditPart.VISUAL_ID:
			if (ComputingNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FutureEditPart.VISUAL_ID:
			if (FutureNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RelativeEditPart.VISUAL_ID:
			if (RelativeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContextSourceEditPart.VISUAL_ID:
			if (ContextSourceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FocusEditPart.VISUAL_ID:
			if (FocusFocalElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FixedEditPart.VISUAL_ID:
			if (FixedNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeEditPart.VISUAL_ID:
			if (CompositeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LocationEditPart.VISUAL_ID:
			if (LocationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelEditPart.VISUAL_ID:
			if (ParallelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProfiledEditPart.VISUAL_ID:
			if (ProfiledNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CharacterizationEditPart.VISUAL_ID:
			if (CharacterizationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CausalEditPart.VISUAL_ID:
			if (CausalNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValidityEditPart.VISUAL_ID:
			if (ValidityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DerivedEditPart.VISUAL_ID:
			if (DerivedNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StaticEditPart.VISUAL_ID:
			if (StaticNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SensedEditPart.VISUAL_ID:
			if (SensedNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SupportEditPart.VISUAL_ID:
			if (SupportNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RelevanceEditPart.VISUAL_ID:
			if (RelevanceArgumentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConflictEditPart.VISUAL_ID:
			if (ConflictNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ContextPackage.eINSTANCE.getParallel().isSuperTypeOf(domainElement.eClass())) {
			return ParallelEditPart.VISUAL_ID;
		}
		if (ContextPackage.eINSTANCE.getProfiled().isSuperTypeOf(domainElement.eClass())) {
			return ProfiledEditPart.VISUAL_ID;
		}
		if (ContextPackage.eINSTANCE.getCharacterization().isSuperTypeOf(domainElement.eClass())) {
			return CharacterizationEditPart.VISUAL_ID;
		}
		if (ContextPackage.eINSTANCE.getCausal().isSuperTypeOf(domainElement.eClass())) {
			return CausalEditPart.VISUAL_ID;
		}
		if (ContextPackage.eINSTANCE.getValidity().isSuperTypeOf(domainElement.eClass())) {
			return ValidityEditPart.VISUAL_ID;
		}
		if (ContextPackage.eINSTANCE.getDerived().isSuperTypeOf(domainElement.eClass())) {
			return DerivedEditPart.VISUAL_ID;
		}
		if (ContextPackage.eINSTANCE.getStatic().isSuperTypeOf(domainElement.eClass())) {
			return StaticEditPart.VISUAL_ID;
		}
		if (ContextPackage.eINSTANCE.getSensed().isSuperTypeOf(domainElement.eClass())) {
			return SensedEditPart.VISUAL_ID;
		}
		if (ContextPackage.eINSTANCE.getSupport().isSuperTypeOf(domainElement.eClass())) {
			return SupportEditPart.VISUAL_ID;
		}
		if (ContextPackage.eINSTANCE.getRelevance().isSuperTypeOf(domainElement.eClass())) {
			return RelevanceEditPart.VISUAL_ID;
		}
		if (ContextPackage.eINSTANCE.getConflict().isSuperTypeOf(domainElement.eClass())) {
			return ConflictEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ContextModel element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ContextModelEditPart.VISUAL_ID:
			return false;
		case CongnitiveEditPart.VISUAL_ID:
		case IdentifyEditPart.VISUAL_ID:
		case CurrentEditPart.VISUAL_ID:
		case SocialEditPart.VISUAL_ID:
		case ActivityEditPart.VISUAL_ID:
		case PastEditPart.VISUAL_ID:
		case RefinementEditPart.VISUAL_ID:
		case PreferenceEditPart.VISUAL_ID:
		case EntityEditPart.VISUAL_ID:
		case ComputingEditPart.VISUAL_ID:
		case FutureEditPart.VISUAL_ID:
		case RelativeEditPart.VISUAL_ID:
		case ContextSourceEditPart.VISUAL_ID:
		case FocusEditPart.VISUAL_ID:
		case FixedEditPart.VISUAL_ID:
		case CompositeEditPart.VISUAL_ID:
		case LocationEditPart.VISUAL_ID:
		case UserEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return context.diagram.part.CIM3VisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return context.diagram.part.CIM3VisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return context.diagram.part.CIM3VisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return context.diagram.part.CIM3VisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return context.diagram.part.CIM3VisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return context.diagram.part.CIM3VisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
