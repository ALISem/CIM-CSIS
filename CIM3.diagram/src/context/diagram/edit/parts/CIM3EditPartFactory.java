package context.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import context.diagram.part.CIM3VisualIDRegistry;

/**
 * @generated
 */
public class CIM3EditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CIM3VisualIDRegistry.getVisualID(view)) {

			case ContextModelEditPart.VISUAL_ID:
				return new ContextModelEditPart(view);

			case CongnitiveEditPart.VISUAL_ID:
				return new CongnitiveEditPart(view);

			case CongnitiveNameEditPart.VISUAL_ID:
				return new CongnitiveNameEditPart(view);

			case IdentifyEditPart.VISUAL_ID:
				return new IdentifyEditPart(view);

			case IdentifyNameEditPart.VISUAL_ID:
				return new IdentifyNameEditPart(view);

			case CurrentEditPart.VISUAL_ID:
				return new CurrentEditPart(view);

			case CurrentNameEditPart.VISUAL_ID:
				return new CurrentNameEditPart(view);

			case SocialEditPart.VISUAL_ID:
				return new SocialEditPart(view);

			case SocialNameEditPart.VISUAL_ID:
				return new SocialNameEditPart(view);

			case ActivityEditPart.VISUAL_ID:
				return new ActivityEditPart(view);

			case ActivityNameEditPart.VISUAL_ID:
				return new ActivityNameEditPart(view);

			case PastEditPart.VISUAL_ID:
				return new PastEditPart(view);

			case PastNameEditPart.VISUAL_ID:
				return new PastNameEditPart(view);

			case RefinementEditPart.VISUAL_ID:
				return new RefinementEditPart(view);

			case RefinementTypeEditPart.VISUAL_ID:
				return new RefinementTypeEditPart(view);

			case PreferenceEditPart.VISUAL_ID:
				return new PreferenceEditPart(view);

			case PreferenceNameEditPart.VISUAL_ID:
				return new PreferenceNameEditPart(view);

			case EntityEditPart.VISUAL_ID:
				return new EntityEditPart(view);

			case EntityNameEditPart.VISUAL_ID:
				return new EntityNameEditPart(view);

			case ComputingEditPart.VISUAL_ID:
				return new ComputingEditPart(view);

			case ComputingNameEditPart.VISUAL_ID:
				return new ComputingNameEditPart(view);

			case FutureEditPart.VISUAL_ID:
				return new FutureEditPart(view);

			case FutureNameEditPart.VISUAL_ID:
				return new FutureNameEditPart(view);

			case RelativeEditPart.VISUAL_ID:
				return new RelativeEditPart(view);

			case RelativeNameEditPart.VISUAL_ID:
				return new RelativeNameEditPart(view);

			case ContextSourceEditPart.VISUAL_ID:
				return new ContextSourceEditPart(view);

			case ContextSourceNameEditPart.VISUAL_ID:
				return new ContextSourceNameEditPart(view);

			case FocusEditPart.VISUAL_ID:
				return new FocusEditPart(view);

			case FocusFocalElementEditPart.VISUAL_ID:
				return new FocusFocalElementEditPart(view);

			case FixedEditPart.VISUAL_ID:
				return new FixedEditPart(view);

			case FixedNameEditPart.VISUAL_ID:
				return new FixedNameEditPart(view);

			case CompositeEditPart.VISUAL_ID:
				return new CompositeEditPart(view);

			case CompositeNameEditPart.VISUAL_ID:
				return new CompositeNameEditPart(view);

			case LocationEditPart.VISUAL_ID:
				return new LocationEditPart(view);

			case LocationNameEditPart.VISUAL_ID:
				return new LocationNameEditPart(view);

			case UserEditPart.VISUAL_ID:
				return new UserEditPart(view);

			case ContextElementRefinementEditPart.VISUAL_ID:
				return new ContextElementRefinementEditPart(view);

			case RefinementRefiningcontextsEditPart.VISUAL_ID:
				return new RefinementRefiningcontextsEditPart(view);

			case ParallelEditPart.VISUAL_ID:
				return new ParallelEditPart(view);

			case ParallelNameEditPart.VISUAL_ID:
				return new ParallelNameEditPart(view);

			case RelationshipTocontextelementEditPart.VISUAL_ID:
				return new RelationshipTocontextelementEditPart(view);

			case ProfiledEditPart.VISUAL_ID:
				return new ProfiledEditPart(view);

			case ProfiledNameEditPart.VISUAL_ID:
				return new ProfiledNameEditPart(view);

			case CharacterizationEditPart.VISUAL_ID:
				return new CharacterizationEditPart(view);

			case CharacterizationNameEditPart.VISUAL_ID:
				return new CharacterizationNameEditPart(view);

			case CausalEditPart.VISUAL_ID:
				return new CausalEditPart(view);

			case CausalNameEditPart.VISUAL_ID:
				return new CausalNameEditPart(view);

			case RelationshipTocontextelement2EditPart.VISUAL_ID:
				return new RelationshipTocontextelement2EditPart(view);

			case ValidityEditPart.VISUAL_ID:
				return new ValidityEditPart(view);

			case ValidityNameEditPart.VISUAL_ID:
				return new ValidityNameEditPart(view);

			case DerivedEditPart.VISUAL_ID:
				return new DerivedEditPart(view);

			case DerivedNameEditPart.VISUAL_ID:
				return new DerivedNameEditPart(view);

			case StaticEditPart.VISUAL_ID:
				return new StaticEditPart(view);

			case StaticNameEditPart.VISUAL_ID:
				return new StaticNameEditPart(view);

			case SensedEditPart.VISUAL_ID:
				return new SensedEditPart(view);

			case SensedNameEditPart.VISUAL_ID:
				return new SensedNameEditPart(view);

			case SupportEditPart.VISUAL_ID:
				return new SupportEditPart(view);

			case SupportNameEditPart.VISUAL_ID:
				return new SupportNameEditPart(view);

			case RelationshipTocontextelement3EditPart.VISUAL_ID:
				return new RelationshipTocontextelement3EditPart(view);

			case RelevanceEditPart.VISUAL_ID:
				return new RelevanceEditPart(view);

			case RelevanceArgumentEditPart.VISUAL_ID:
				return new RelevanceArgumentEditPart(view);

			case ConflictEditPart.VISUAL_ID:
				return new ConflictEditPart(view);

			case ConflictNameEditPart.VISUAL_ID:
				return new ConflictNameEditPart(view);

			case RelationshipTocontextelement4EditPart.VISUAL_ID:
				return new RelationshipTocontextelement4EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
