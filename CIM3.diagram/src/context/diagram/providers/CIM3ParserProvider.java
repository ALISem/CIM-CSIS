package context.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;

import context.ContextPackage;
import context.diagram.edit.parts.ActivityNameEditPart;
import context.diagram.edit.parts.CausalNameEditPart;
import context.diagram.edit.parts.CharacterizationNameEditPart;
import context.diagram.edit.parts.CompositeNameEditPart;
import context.diagram.edit.parts.ComputingNameEditPart;
import context.diagram.edit.parts.ConflictNameEditPart;
import context.diagram.edit.parts.CongnitiveNameEditPart;
import context.diagram.edit.parts.ContextSourceNameEditPart;
import context.diagram.edit.parts.CurrentNameEditPart;
import context.diagram.edit.parts.DerivedNameEditPart;
import context.diagram.edit.parts.EntityNameEditPart;
import context.diagram.edit.parts.FixedNameEditPart;
import context.diagram.edit.parts.FocusFocalElementEditPart;
import context.diagram.edit.parts.FutureNameEditPart;
import context.diagram.edit.parts.IdentifyNameEditPart;
import context.diagram.edit.parts.LocationNameEditPart;
import context.diagram.edit.parts.ParallelNameEditPart;
import context.diagram.edit.parts.PastNameEditPart;
import context.diagram.edit.parts.PreferenceNameEditPart;
import context.diagram.edit.parts.ProfiledNameEditPart;
import context.diagram.edit.parts.RefinementTypeEditPart;
import context.diagram.edit.parts.RelativeNameEditPart;
import context.diagram.edit.parts.RelevanceArgumentEditPart;
import context.diagram.edit.parts.SensedNameEditPart;
import context.diagram.edit.parts.SocialNameEditPart;
import context.diagram.edit.parts.StaticNameEditPart;
import context.diagram.edit.parts.SupportNameEditPart;
import context.diagram.edit.parts.ValidityNameEditPart;
import context.diagram.parsers.MessageFormatParser;
import context.diagram.part.CIM3VisualIDRegistry;

/**
 * @generated
 */
public class CIM3ParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser congnitiveName_5001Parser;

	/**
	* @generated
	*/
	private IParser getCongnitiveName_5001Parser() {
		if (congnitiveName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getContextElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			congnitiveName_5001Parser = parser;
		}
		return congnitiveName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser identifyName_5002Parser;

	/**
	* @generated
	*/
	private IParser getIdentifyName_5002Parser() {
		if (identifyName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getContextElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			identifyName_5002Parser = parser;
		}
		return identifyName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser currentName_5003Parser;

	/**
	* @generated
	*/
	private IParser getCurrentName_5003Parser() {
		if (currentName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getContextElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			currentName_5003Parser = parser;
		}
		return currentName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser socialName_5004Parser;

	/**
	* @generated
	*/
	private IParser getSocialName_5004Parser() {
		if (socialName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getContextElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			socialName_5004Parser = parser;
		}
		return socialName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser activityName_5005Parser;

	/**
	* @generated
	*/
	private IParser getActivityName_5005Parser() {
		if (activityName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getContextElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			activityName_5005Parser = parser;
		}
		return activityName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser pastName_5006Parser;

	/**
	* @generated
	*/
	private IParser getPastName_5006Parser() {
		if (pastName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getContextElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pastName_5006Parser = parser;
		}
		return pastName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser refinementType_5017Parser;

	/**
	* @generated
	*/
	private IParser getRefinementType_5017Parser() {
		if (refinementType_5017Parser == null) {
			EAttribute editableFeature = ContextPackage.eINSTANCE.getRefinement_Type();
			EnumParser parser = new EnumParser(editableFeature);
			refinementType_5017Parser = parser;
		}
		return refinementType_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser preferenceName_5007Parser;

	/**
	* @generated
	*/
	private IParser getPreferenceName_5007Parser() {
		if (preferenceName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getContextElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			preferenceName_5007Parser = parser;
		}
		return preferenceName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser entityName_5008Parser;

	/**
	* @generated
	*/
	private IParser getEntityName_5008Parser() {
		if (entityName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getEntity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entityName_5008Parser = parser;
		}
		return entityName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser computingName_5009Parser;

	/**
	* @generated
	*/
	private IParser getComputingName_5009Parser() {
		if (computingName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getContextElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			computingName_5009Parser = parser;
		}
		return computingName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser futureName_5010Parser;

	/**
	* @generated
	*/
	private IParser getFutureName_5010Parser() {
		if (futureName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getContextElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			futureName_5010Parser = parser;
		}
		return futureName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser relativeName_5011Parser;

	/**
	* @generated
	*/
	private IParser getRelativeName_5011Parser() {
		if (relativeName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getTimeConstraint_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			relativeName_5011Parser = parser;
		}
		return relativeName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser contextSourceName_5012Parser;

	/**
	* @generated
	*/
	private IParser getContextSourceName_5012Parser() {
		if (contextSourceName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getContextSource_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contextSourceName_5012Parser = parser;
		}
		return contextSourceName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser focusFocalElement_5013Parser;

	/**
	* @generated
	*/
	private IParser getFocusFocalElement_5013Parser() {
		if (focusFocalElement_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getFocus_FocalElement() };
			MessageFormatParser parser = new MessageFormatParser(features);
			focusFocalElement_5013Parser = parser;
		}
		return focusFocalElement_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser fixedName_5014Parser;

	/**
	* @generated
	*/
	private IParser getFixedName_5014Parser() {
		if (fixedName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getTimeConstraint_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fixedName_5014Parser = parser;
		}
		return fixedName_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser compositeName_5015Parser;

	/**
	* @generated
	*/
	private IParser getCompositeName_5015Parser() {
		if (compositeName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getContextElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeName_5015Parser = parser;
		}
		return compositeName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser locationName_5016Parser;

	/**
	* @generated
	*/
	private IParser getLocationName_5016Parser() {
		if (locationName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getContextElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationName_5016Parser = parser;
		}
		return locationName_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser parallelName_6001Parser;

	/**
	* @generated
	*/
	private IParser getParallelName_6001Parser() {
		if (parallelName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getRelationship_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parallelName_6001Parser = parser;
		}
		return parallelName_6001Parser;
	}

	/**
	* @generated
	*/
	private IParser profiledName_6003Parser;

	/**
	* @generated
	*/
	private IParser getProfiledName_6003Parser() {
		if (profiledName_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getAcquisition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			profiledName_6003Parser = parser;
		}
		return profiledName_6003Parser;
	}

	/**
	* @generated
	*/
	private IParser characterizationName_6004Parser;

	/**
	* @generated
	*/
	private IParser getCharacterizationName_6004Parser() {
		if (characterizationName_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getCharacterization_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			characterizationName_6004Parser = parser;
		}
		return characterizationName_6004Parser;
	}

	/**
	* @generated
	*/
	private IParser causalName_6005Parser;

	/**
	* @generated
	*/
	private IParser getCausalName_6005Parser() {
		if (causalName_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getRelationship_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			causalName_6005Parser = parser;
		}
		return causalName_6005Parser;
	}

	/**
	* @generated
	*/
	private IParser validityName_6007Parser;

	/**
	* @generated
	*/
	private IParser getValidityName_6007Parser() {
		if (validityName_6007Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getValidity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			validityName_6007Parser = parser;
		}
		return validityName_6007Parser;
	}

	/**
	* @generated
	*/
	private IParser derivedName_6008Parser;

	/**
	* @generated
	*/
	private IParser getDerivedName_6008Parser() {
		if (derivedName_6008Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getAcquisition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			derivedName_6008Parser = parser;
		}
		return derivedName_6008Parser;
	}

	/**
	* @generated
	*/
	private IParser staticName_6009Parser;

	/**
	* @generated
	*/
	private IParser getStaticName_6009Parser() {
		if (staticName_6009Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getAcquisition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			staticName_6009Parser = parser;
		}
		return staticName_6009Parser;
	}

	/**
	* @generated
	*/
	private IParser sensedName_6010Parser;

	/**
	* @generated
	*/
	private IParser getSensedName_6010Parser() {
		if (sensedName_6010Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getAcquisition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sensedName_6010Parser = parser;
		}
		return sensedName_6010Parser;
	}

	/**
	* @generated
	*/
	private IParser supportName_6011Parser;

	/**
	* @generated
	*/
	private IParser getSupportName_6011Parser() {
		if (supportName_6011Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getRelationship_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			supportName_6011Parser = parser;
		}
		return supportName_6011Parser;
	}

	/**
	* @generated
	*/
	private IParser relevanceArgument_6013Parser;

	/**
	* @generated
	*/
	private IParser getRelevanceArgument_6013Parser() {
		if (relevanceArgument_6013Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getRelevance_Argument() };
			MessageFormatParser parser = new MessageFormatParser(features);
			relevanceArgument_6013Parser = parser;
		}
		return relevanceArgument_6013Parser;
	}

	/**
	* @generated
	*/
	private IParser conflictName_6014Parser;

	/**
	* @generated
	*/
	private IParser getConflictName_6014Parser() {
		if (conflictName_6014Parser == null) {
			EAttribute[] features = new EAttribute[] { ContextPackage.eINSTANCE.getRelationship_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conflictName_6014Parser = parser;
		}
		return conflictName_6014Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CongnitiveNameEditPart.VISUAL_ID:
			return getCongnitiveName_5001Parser();
		case IdentifyNameEditPart.VISUAL_ID:
			return getIdentifyName_5002Parser();
		case CurrentNameEditPart.VISUAL_ID:
			return getCurrentName_5003Parser();
		case SocialNameEditPart.VISUAL_ID:
			return getSocialName_5004Parser();
		case ActivityNameEditPart.VISUAL_ID:
			return getActivityName_5005Parser();
		case PastNameEditPart.VISUAL_ID:
			return getPastName_5006Parser();

		case RefinementTypeEditPart.VISUAL_ID:
			return getRefinementType_5017Parser();
		case PreferenceNameEditPart.VISUAL_ID:
			return getPreferenceName_5007Parser();
		case EntityNameEditPart.VISUAL_ID:
			return getEntityName_5008Parser();
		case ComputingNameEditPart.VISUAL_ID:
			return getComputingName_5009Parser();
		case FutureNameEditPart.VISUAL_ID:
			return getFutureName_5010Parser();
		case RelativeNameEditPart.VISUAL_ID:
			return getRelativeName_5011Parser();
		case ContextSourceNameEditPart.VISUAL_ID:
			return getContextSourceName_5012Parser();
		case FocusFocalElementEditPart.VISUAL_ID:
			return getFocusFocalElement_5013Parser();
		case FixedNameEditPart.VISUAL_ID:
			return getFixedName_5014Parser();
		case CompositeNameEditPart.VISUAL_ID:
			return getCompositeName_5015Parser();
		case LocationNameEditPart.VISUAL_ID:
			return getLocationName_5016Parser();
		case ParallelNameEditPart.VISUAL_ID:
			return getParallelName_6001Parser();
		case ProfiledNameEditPart.VISUAL_ID:
			return getProfiledName_6003Parser();
		case CharacterizationNameEditPart.VISUAL_ID:
			return getCharacterizationName_6004Parser();
		case CausalNameEditPart.VISUAL_ID:
			return getCausalName_6005Parser();
		case ValidityNameEditPart.VISUAL_ID:
			return getValidityName_6007Parser();
		case DerivedNameEditPart.VISUAL_ID:
			return getDerivedName_6008Parser();
		case StaticNameEditPart.VISUAL_ID:
			return getStaticName_6009Parser();
		case SensedNameEditPart.VISUAL_ID:
			return getSensedName_6010Parser();
		case SupportNameEditPart.VISUAL_ID:
			return getSupportName_6011Parser();
		case RelevanceArgumentEditPart.VISUAL_ID:
			return getRelevanceArgument_6013Parser();
		case ConflictNameEditPart.VISUAL_ID:
			return getConflictName_6014Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(CIM3VisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(CIM3VisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (CIM3ElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
