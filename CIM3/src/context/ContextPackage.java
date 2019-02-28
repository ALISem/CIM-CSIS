/**
 */
package context;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see context.ContextFactory
 * @model kind="package"
 * @generated
 */
public interface ContextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "context";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "context";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "context";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContextPackage eINSTANCE = context.impl.ContextPackageImpl.init();

	/**
	 * The meta object id for the '{@link context.impl.ContextElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.ContextElementImpl
	 * @see context.impl.ContextPackageImpl#getContextElement()
	 * @generated
	 */
	int CONTEXT_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fromrelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT__FROMRELATION = 1;

	/**
	 * The feature id for the '<em><b>Torelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT__TORELATION = 2;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT__REFINEMENT = 3;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT__IS_ABSTRACT = 4;

	/**
	 * The feature id for the '<em><b>Is Monitorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT__IS_MONITORABLE = 5;

	/**
	 * The feature id for the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT__IS_VERIFIABLE = 6;

	/**
	 * The feature id for the '<em><b>Is Factual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT__IS_FACTUAL = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT__DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Formal Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT__FORMAL_SPECIFICATION = 9;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT__PROPERTY = 10;

	/**
	 * The feature id for the '<em><b>Cont To Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT__CONT_TO_RELATIONSHIP = 11;

	/**
	 * The feature id for the '<em><b>Cont From Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT__CONT_FROM_RELATIONSHIP = 12;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link context.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.RelationshipImpl
	 * @see context.impl.ContextPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 1;

	/**
	 * The feature id for the '<em><b>Tocontextelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TOCONTEXTELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Fromcontextelement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__FROMCONTEXTELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = 2;

	/**
	 * The feature id for the '<em><b>Relfrom Refinement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELFROM_REFINEMENT = 3;

	/**
	 * The feature id for the '<em><b>Rel To Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__REL_TO_CONTEXT = 4;

	/**
	 * The feature id for the '<em><b>Rel From Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__REL_FROM_CONTEXT = 5;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link context.impl.ContextModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.ContextModelImpl
	 * @see context.impl.ContextPackageImpl#getContextModel()
	 * @generated
	 */
	int CONTEXT_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contextelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__CONTEXTELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Refinements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__REFINEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__RELATIONSHIPS = 3;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__SOURCES = 4;

	/**
	 * The feature id for the '<em><b>Acquisitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__ACQUISITIONS = 5;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__ENTITIES = 6;

	/**
	 * The feature id for the '<em><b>Characterizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__CHARACTERIZATIONS = 7;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__VALIDITY = 8;

	/**
	 * The feature id for the '<em><b>Timeconstraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__TIMECONSTRAINTS = 9;

	/**
	 * The feature id for the '<em><b>Foci</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__FOCI = 10;

	/**
	 * The feature id for the '<em><b>Relevance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__RELEVANCE = 11;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link context.impl.RefinementImpl <em>Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.RefinementImpl
	 * @see context.impl.ContextPackageImpl#getRefinement()
	 * @generated
	 */
	int REFINEMENT = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Refiningcontexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT__REFININGCONTEXTS = 1;

	/**
	 * The feature id for the '<em><b>Ref To Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT__REF_TO_RELATIONSHIP = 2;

	/**
	 * The number of structural features of the '<em>Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link context.impl.CausalImpl <em>Causal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.CausalImpl
	 * @see context.impl.ContextPackageImpl#getCausal()
	 * @generated
	 */
	int CAUSAL = 4;

	/**
	 * The feature id for the '<em><b>Tocontextelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL__TOCONTEXTELEMENT = RELATIONSHIP__TOCONTEXTELEMENT;

	/**
	 * The feature id for the '<em><b>Fromcontextelement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL__FROMCONTEXTELEMENT = RELATIONSHIP__FROMCONTEXTELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Relfrom Refinement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL__RELFROM_REFINEMENT = RELATIONSHIP__RELFROM_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Rel To Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL__REL_TO_CONTEXT = RELATIONSHIP__REL_TO_CONTEXT;

	/**
	 * The feature id for the '<em><b>Rel From Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL__REL_FROM_CONTEXT = RELATIONSHIP__REL_FROM_CONTEXT;

	/**
	 * The number of structural features of the '<em>Causal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Causal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.SupportImpl <em>Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.SupportImpl
	 * @see context.impl.ContextPackageImpl#getSupport()
	 * @generated
	 */
	int SUPPORT = 5;

	/**
	 * The feature id for the '<em><b>Tocontextelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__TOCONTEXTELEMENT = RELATIONSHIP__TOCONTEXTELEMENT;

	/**
	 * The feature id for the '<em><b>Fromcontextelement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__FROMCONTEXTELEMENT = RELATIONSHIP__FROMCONTEXTELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Relfrom Refinement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__RELFROM_REFINEMENT = RELATIONSHIP__RELFROM_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Rel To Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__REL_TO_CONTEXT = RELATIONSHIP__REL_TO_CONTEXT;

	/**
	 * The feature id for the '<em><b>Rel From Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__REL_FROM_CONTEXT = RELATIONSHIP__REL_FROM_CONTEXT;

	/**
	 * The number of structural features of the '<em>Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.AcquisitionImpl <em>Acquisition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.AcquisitionImpl
	 * @see context.impl.ContextPackageImpl#getAcquisition()
	 * @generated
	 */
	int ACQUISITION = 6;

	/**
	 * The feature id for the '<em><b>Aquiredcontext</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUISITION__AQUIREDCONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Contextsource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUISITION__CONTEXTSOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUISITION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Update Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUISITION__UPDATE_FREQUENCY = 3;

	/**
	 * The number of structural features of the '<em>Acquisition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUISITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Acquisition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUISITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link context.impl.ContextSourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.ContextSourceImpl
	 * @see context.impl.ContextPackageImpl#getContextSource()
	 * @generated
	 */
	int CONTEXT_SOURCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SOURCE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link context.impl.StaticImpl <em>Static</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.StaticImpl
	 * @see context.impl.ContextPackageImpl#getStatic()
	 * @generated
	 */
	int STATIC = 8;

	/**
	 * The feature id for the '<em><b>Aquiredcontext</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC__AQUIREDCONTEXT = ACQUISITION__AQUIREDCONTEXT;

	/**
	 * The feature id for the '<em><b>Contextsource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC__CONTEXTSOURCE = ACQUISITION__CONTEXTSOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC__NAME = ACQUISITION__NAME;

	/**
	 * The feature id for the '<em><b>Update Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC__UPDATE_FREQUENCY = ACQUISITION__UPDATE_FREQUENCY;

	/**
	 * The number of structural features of the '<em>Static</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FEATURE_COUNT = ACQUISITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Static</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OPERATION_COUNT = ACQUISITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.ProfiledImpl <em>Profiled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.ProfiledImpl
	 * @see context.impl.ContextPackageImpl#getProfiled()
	 * @generated
	 */
	int PROFILED = 9;

	/**
	 * The feature id for the '<em><b>Aquiredcontext</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILED__AQUIREDCONTEXT = ACQUISITION__AQUIREDCONTEXT;

	/**
	 * The feature id for the '<em><b>Contextsource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILED__CONTEXTSOURCE = ACQUISITION__CONTEXTSOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILED__NAME = ACQUISITION__NAME;

	/**
	 * The feature id for the '<em><b>Update Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILED__UPDATE_FREQUENCY = ACQUISITION__UPDATE_FREQUENCY;

	/**
	 * The number of structural features of the '<em>Profiled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILED_FEATURE_COUNT = ACQUISITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Profiled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILED_OPERATION_COUNT = ACQUISITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.DerivedImpl <em>Derived</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.DerivedImpl
	 * @see context.impl.ContextPackageImpl#getDerived()
	 * @generated
	 */
	int DERIVED = 10;

	/**
	 * The feature id for the '<em><b>Aquiredcontext</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__AQUIREDCONTEXT = ACQUISITION__AQUIREDCONTEXT;

	/**
	 * The feature id for the '<em><b>Contextsource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__CONTEXTSOURCE = ACQUISITION__CONTEXTSOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__NAME = ACQUISITION__NAME;

	/**
	 * The feature id for the '<em><b>Update Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__UPDATE_FREQUENCY = ACQUISITION__UPDATE_FREQUENCY;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__EXPRESSION = ACQUISITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURE_COUNT = ACQUISITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Derived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_OPERATION_COUNT = ACQUISITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.SensedImpl <em>Sensed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.SensedImpl
	 * @see context.impl.ContextPackageImpl#getSensed()
	 * @generated
	 */
	int SENSED = 11;

	/**
	 * The feature id for the '<em><b>Aquiredcontext</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSED__AQUIREDCONTEXT = ACQUISITION__AQUIREDCONTEXT;

	/**
	 * The feature id for the '<em><b>Contextsource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSED__CONTEXTSOURCE = ACQUISITION__CONTEXTSOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSED__NAME = ACQUISITION__NAME;

	/**
	 * The feature id for the '<em><b>Update Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSED__UPDATE_FREQUENCY = ACQUISITION__UPDATE_FREQUENCY;

	/**
	 * The number of structural features of the '<em>Sensed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSED_FEATURE_COUNT = ACQUISITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSED_OPERATION_COUNT = ACQUISITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.ConflictImpl <em>Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.ConflictImpl
	 * @see context.impl.ContextPackageImpl#getConflict()
	 * @generated
	 */
	int CONFLICT = 12;

	/**
	 * The feature id for the '<em><b>Tocontextelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__TOCONTEXTELEMENT = RELATIONSHIP__TOCONTEXTELEMENT;

	/**
	 * The feature id for the '<em><b>Fromcontextelement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__FROMCONTEXTELEMENT = RELATIONSHIP__FROMCONTEXTELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Relfrom Refinement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__RELFROM_REFINEMENT = RELATIONSHIP__RELFROM_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Rel To Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__REL_TO_CONTEXT = RELATIONSHIP__REL_TO_CONTEXT;

	/**
	 * The feature id for the '<em><b>Rel From Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__REL_FROM_CONTEXT = RELATIONSHIP__REL_FROM_CONTEXT;

	/**
	 * The number of structural features of the '<em>Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.ParallelImpl <em>Parallel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.ParallelImpl
	 * @see context.impl.ContextPackageImpl#getParallel()
	 * @generated
	 */
	int PARALLEL = 13;

	/**
	 * The feature id for the '<em><b>Tocontextelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__TOCONTEXTELEMENT = RELATIONSHIP__TOCONTEXTELEMENT;

	/**
	 * The feature id for the '<em><b>Fromcontextelement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__FROMCONTEXTELEMENT = RELATIONSHIP__FROMCONTEXTELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Relfrom Refinement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__RELFROM_REFINEMENT = RELATIONSHIP__RELFROM_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Rel To Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__REL_TO_CONTEXT = RELATIONSHIP__REL_TO_CONTEXT;

	/**
	 * The feature id for the '<em><b>Rel From Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__REL_FROM_CONTEXT = RELATIONSHIP__REL_FROM_CONTEXT;

	/**
	 * The number of structural features of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.EntityImpl
	 * @see context.impl.ContextPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link context.impl.CharacterizationImpl <em>Characterization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.CharacterizationImpl
	 * @see context.impl.ContextPackageImpl#getCharacterization()
	 * @generated
	 */
	int CHARACTERIZATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Char Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__CHAR_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Char Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION__CHAR_CONTEXT = 2;

	/**
	 * The number of structural features of the '<em>Characterization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Characterization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link context.impl.AtomicImpl <em>Atomic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.AtomicImpl
	 * @see context.impl.ContextPackageImpl#getAtomic()
	 * @generated
	 */
	int ATOMIC = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC__NAME = CONTEXT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Fromrelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC__FROMRELATION = CONTEXT_ELEMENT__FROMRELATION;

	/**
	 * The feature id for the '<em><b>Torelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC__TORELATION = CONTEXT_ELEMENT__TORELATION;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC__REFINEMENT = CONTEXT_ELEMENT__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC__IS_ABSTRACT = CONTEXT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Monitorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC__IS_MONITORABLE = CONTEXT_ELEMENT__IS_MONITORABLE;

	/**
	 * The feature id for the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC__IS_VERIFIABLE = CONTEXT_ELEMENT__IS_VERIFIABLE;

	/**
	 * The feature id for the '<em><b>Is Factual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC__IS_FACTUAL = CONTEXT_ELEMENT__IS_FACTUAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC__DESCRIPTION = CONTEXT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Formal Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC__FORMAL_SPECIFICATION = CONTEXT_ELEMENT__FORMAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC__PROPERTY = CONTEXT_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Cont To Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC__CONT_TO_RELATIONSHIP = CONTEXT_ELEMENT__CONT_TO_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Cont From Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC__CONT_FROM_RELATIONSHIP = CONTEXT_ELEMENT__CONT_FROM_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FEATURE_COUNT = CONTEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_OPERATION_COUNT = CONTEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.CompositeImpl
	 * @see context.impl.ContextPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__NAME = CONTEXT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Fromrelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__FROMRELATION = CONTEXT_ELEMENT__FROMRELATION;

	/**
	 * The feature id for the '<em><b>Torelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__TORELATION = CONTEXT_ELEMENT__TORELATION;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__REFINEMENT = CONTEXT_ELEMENT__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__IS_ABSTRACT = CONTEXT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Monitorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__IS_MONITORABLE = CONTEXT_ELEMENT__IS_MONITORABLE;

	/**
	 * The feature id for the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__IS_VERIFIABLE = CONTEXT_ELEMENT__IS_VERIFIABLE;

	/**
	 * The feature id for the '<em><b>Is Factual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__IS_FACTUAL = CONTEXT_ELEMENT__IS_FACTUAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__DESCRIPTION = CONTEXT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Formal Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__FORMAL_SPECIFICATION = CONTEXT_ELEMENT__FORMAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__PROPERTY = CONTEXT_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Cont To Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__CONT_TO_RELATIONSHIP = CONTEXT_ELEMENT__CONT_TO_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Cont From Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__CONT_FROM_RELATIONSHIP = CONTEXT_ELEMENT__CONT_FROM_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Atomic Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__ATOMIC_CONTEXT = CONTEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = CONTEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_COUNT = CONTEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.CongnitiveImpl <em>Congnitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.CongnitiveImpl
	 * @see context.impl.ContextPackageImpl#getCongnitive()
	 * @generated
	 */
	int CONGNITIVE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONGNITIVE__NAME = ATOMIC__NAME;

	/**
	 * The feature id for the '<em><b>Fromrelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONGNITIVE__FROMRELATION = ATOMIC__FROMRELATION;

	/**
	 * The feature id for the '<em><b>Torelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONGNITIVE__TORELATION = ATOMIC__TORELATION;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONGNITIVE__REFINEMENT = ATOMIC__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONGNITIVE__IS_ABSTRACT = ATOMIC__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Monitorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONGNITIVE__IS_MONITORABLE = ATOMIC__IS_MONITORABLE;

	/**
	 * The feature id for the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONGNITIVE__IS_VERIFIABLE = ATOMIC__IS_VERIFIABLE;

	/**
	 * The feature id for the '<em><b>Is Factual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONGNITIVE__IS_FACTUAL = ATOMIC__IS_FACTUAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONGNITIVE__DESCRIPTION = ATOMIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Formal Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONGNITIVE__FORMAL_SPECIFICATION = ATOMIC__FORMAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONGNITIVE__PROPERTY = ATOMIC__PROPERTY;

	/**
	 * The feature id for the '<em><b>Cont To Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONGNITIVE__CONT_TO_RELATIONSHIP = ATOMIC__CONT_TO_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Cont From Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONGNITIVE__CONT_FROM_RELATIONSHIP = ATOMIC__CONT_FROM_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>Congnitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONGNITIVE_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Congnitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONGNITIVE_OPERATION_COUNT = ATOMIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.SocialImpl <em>Social</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.SocialImpl
	 * @see context.impl.ContextPackageImpl#getSocial()
	 * @generated
	 */
	int SOCIAL = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL__NAME = ATOMIC__NAME;

	/**
	 * The feature id for the '<em><b>Fromrelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL__FROMRELATION = ATOMIC__FROMRELATION;

	/**
	 * The feature id for the '<em><b>Torelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL__TORELATION = ATOMIC__TORELATION;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL__REFINEMENT = ATOMIC__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL__IS_ABSTRACT = ATOMIC__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Monitorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL__IS_MONITORABLE = ATOMIC__IS_MONITORABLE;

	/**
	 * The feature id for the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL__IS_VERIFIABLE = ATOMIC__IS_VERIFIABLE;

	/**
	 * The feature id for the '<em><b>Is Factual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL__IS_FACTUAL = ATOMIC__IS_FACTUAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL__DESCRIPTION = ATOMIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Formal Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL__FORMAL_SPECIFICATION = ATOMIC__FORMAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL__PROPERTY = ATOMIC__PROPERTY;

	/**
	 * The feature id for the '<em><b>Cont To Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL__CONT_TO_RELATIONSHIP = ATOMIC__CONT_TO_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Cont From Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL__CONT_FROM_RELATIONSHIP = ATOMIC__CONT_FROM_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>Social</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Social</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_OPERATION_COUNT = ATOMIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.PhysicalImpl <em>Physical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.PhysicalImpl
	 * @see context.impl.ContextPackageImpl#getPhysical()
	 * @generated
	 */
	int PHYSICAL = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__NAME = ATOMIC__NAME;

	/**
	 * The feature id for the '<em><b>Fromrelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__FROMRELATION = ATOMIC__FROMRELATION;

	/**
	 * The feature id for the '<em><b>Torelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__TORELATION = ATOMIC__TORELATION;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__REFINEMENT = ATOMIC__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__IS_ABSTRACT = ATOMIC__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Monitorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__IS_MONITORABLE = ATOMIC__IS_MONITORABLE;

	/**
	 * The feature id for the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__IS_VERIFIABLE = ATOMIC__IS_VERIFIABLE;

	/**
	 * The feature id for the '<em><b>Is Factual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__IS_FACTUAL = ATOMIC__IS_FACTUAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__DESCRIPTION = ATOMIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Formal Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__FORMAL_SPECIFICATION = ATOMIC__FORMAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__PROPERTY = ATOMIC__PROPERTY;

	/**
	 * The feature id for the '<em><b>Cont To Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__CONT_TO_RELATIONSHIP = ATOMIC__CONT_TO_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Cont From Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__CONT_FROM_RELATIONSHIP = ATOMIC__CONT_FROM_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>Physical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Physical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OPERATION_COUNT = ATOMIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.LocationImpl
	 * @see context.impl.ContextPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = PHYSICAL__NAME;

	/**
	 * The feature id for the '<em><b>Fromrelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__FROMRELATION = PHYSICAL__FROMRELATION;

	/**
	 * The feature id for the '<em><b>Torelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TORELATION = PHYSICAL__TORELATION;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__REFINEMENT = PHYSICAL__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__IS_ABSTRACT = PHYSICAL__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Monitorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__IS_MONITORABLE = PHYSICAL__IS_MONITORABLE;

	/**
	 * The feature id for the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__IS_VERIFIABLE = PHYSICAL__IS_VERIFIABLE;

	/**
	 * The feature id for the '<em><b>Is Factual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__IS_FACTUAL = PHYSICAL__IS_FACTUAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DESCRIPTION = PHYSICAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Formal Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__FORMAL_SPECIFICATION = PHYSICAL__FORMAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PROPERTY = PHYSICAL__PROPERTY;

	/**
	 * The feature id for the '<em><b>Cont To Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONT_TO_RELATIONSHIP = PHYSICAL__CONT_TO_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Cont From Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONT_FROM_RELATIONSHIP = PHYSICAL__CONT_FROM_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = PHYSICAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = PHYSICAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.TemporalImpl <em>Temporal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.TemporalImpl
	 * @see context.impl.ContextPackageImpl#getTemporal()
	 * @generated
	 */
	int TEMPORAL = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__NAME = ATOMIC__NAME;

	/**
	 * The feature id for the '<em><b>Fromrelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__FROMRELATION = ATOMIC__FROMRELATION;

	/**
	 * The feature id for the '<em><b>Torelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__TORELATION = ATOMIC__TORELATION;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__REFINEMENT = ATOMIC__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__IS_ABSTRACT = ATOMIC__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Monitorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__IS_MONITORABLE = ATOMIC__IS_MONITORABLE;

	/**
	 * The feature id for the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__IS_VERIFIABLE = ATOMIC__IS_VERIFIABLE;

	/**
	 * The feature id for the '<em><b>Is Factual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__IS_FACTUAL = ATOMIC__IS_FACTUAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__DESCRIPTION = ATOMIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Formal Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__FORMAL_SPECIFICATION = ATOMIC__FORMAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__PROPERTY = ATOMIC__PROPERTY;

	/**
	 * The feature id for the '<em><b>Cont To Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__CONT_TO_RELATIONSHIP = ATOMIC__CONT_TO_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Cont From Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__CONT_FROM_RELATIONSHIP = ATOMIC__CONT_FROM_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>Temporal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temporal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_OPERATION_COUNT = ATOMIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.PastImpl <em>Past</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.PastImpl
	 * @see context.impl.ContextPackageImpl#getPast()
	 * @generated
	 */
	int PAST = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST__NAME = TEMPORAL__NAME;

	/**
	 * The feature id for the '<em><b>Fromrelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST__FROMRELATION = TEMPORAL__FROMRELATION;

	/**
	 * The feature id for the '<em><b>Torelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST__TORELATION = TEMPORAL__TORELATION;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST__REFINEMENT = TEMPORAL__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST__IS_ABSTRACT = TEMPORAL__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Monitorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST__IS_MONITORABLE = TEMPORAL__IS_MONITORABLE;

	/**
	 * The feature id for the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST__IS_VERIFIABLE = TEMPORAL__IS_VERIFIABLE;

	/**
	 * The feature id for the '<em><b>Is Factual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST__IS_FACTUAL = TEMPORAL__IS_FACTUAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST__DESCRIPTION = TEMPORAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Formal Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST__FORMAL_SPECIFICATION = TEMPORAL__FORMAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST__PROPERTY = TEMPORAL__PROPERTY;

	/**
	 * The feature id for the '<em><b>Cont To Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST__CONT_TO_RELATIONSHIP = TEMPORAL__CONT_TO_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Cont From Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST__CONT_FROM_RELATIONSHIP = TEMPORAL__CONT_FROM_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>Past</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_FEATURE_COUNT = TEMPORAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Past</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_OPERATION_COUNT = TEMPORAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.CurrentImpl <em>Current</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.CurrentImpl
	 * @see context.impl.ContextPackageImpl#getCurrent()
	 * @generated
	 */
	int CURRENT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT__NAME = TEMPORAL__NAME;

	/**
	 * The feature id for the '<em><b>Fromrelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT__FROMRELATION = TEMPORAL__FROMRELATION;

	/**
	 * The feature id for the '<em><b>Torelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT__TORELATION = TEMPORAL__TORELATION;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT__REFINEMENT = TEMPORAL__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT__IS_ABSTRACT = TEMPORAL__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Monitorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT__IS_MONITORABLE = TEMPORAL__IS_MONITORABLE;

	/**
	 * The feature id for the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT__IS_VERIFIABLE = TEMPORAL__IS_VERIFIABLE;

	/**
	 * The feature id for the '<em><b>Is Factual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT__IS_FACTUAL = TEMPORAL__IS_FACTUAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT__DESCRIPTION = TEMPORAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Formal Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT__FORMAL_SPECIFICATION = TEMPORAL__FORMAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT__PROPERTY = TEMPORAL__PROPERTY;

	/**
	 * The feature id for the '<em><b>Cont To Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT__CONT_TO_RELATIONSHIP = TEMPORAL__CONT_TO_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Cont From Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT__CONT_FROM_RELATIONSHIP = TEMPORAL__CONT_FROM_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>Current</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_FEATURE_COUNT = TEMPORAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Current</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_OPERATION_COUNT = TEMPORAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.FutureImpl <em>Future</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.FutureImpl
	 * @see context.impl.ContextPackageImpl#getFuture()
	 * @generated
	 */
	int FUTURE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE__NAME = TEMPORAL__NAME;

	/**
	 * The feature id for the '<em><b>Fromrelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE__FROMRELATION = TEMPORAL__FROMRELATION;

	/**
	 * The feature id for the '<em><b>Torelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE__TORELATION = TEMPORAL__TORELATION;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE__REFINEMENT = TEMPORAL__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE__IS_ABSTRACT = TEMPORAL__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Monitorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE__IS_MONITORABLE = TEMPORAL__IS_MONITORABLE;

	/**
	 * The feature id for the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE__IS_VERIFIABLE = TEMPORAL__IS_VERIFIABLE;

	/**
	 * The feature id for the '<em><b>Is Factual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE__IS_FACTUAL = TEMPORAL__IS_FACTUAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE__DESCRIPTION = TEMPORAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Formal Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE__FORMAL_SPECIFICATION = TEMPORAL__FORMAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE__PROPERTY = TEMPORAL__PROPERTY;

	/**
	 * The feature id for the '<em><b>Cont To Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE__CONT_TO_RELATIONSHIP = TEMPORAL__CONT_TO_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Cont From Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE__CONT_FROM_RELATIONSHIP = TEMPORAL__CONT_FROM_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>Future</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_FEATURE_COUNT = TEMPORAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Future</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_OPERATION_COUNT = TEMPORAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.ComputingImpl <em>Computing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.ComputingImpl
	 * @see context.impl.ContextPackageImpl#getComputing()
	 * @generated
	 */
	int COMPUTING = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__NAME = ATOMIC__NAME;

	/**
	 * The feature id for the '<em><b>Fromrelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__FROMRELATION = ATOMIC__FROMRELATION;

	/**
	 * The feature id for the '<em><b>Torelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__TORELATION = ATOMIC__TORELATION;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__REFINEMENT = ATOMIC__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__IS_ABSTRACT = ATOMIC__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Monitorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__IS_MONITORABLE = ATOMIC__IS_MONITORABLE;

	/**
	 * The feature id for the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__IS_VERIFIABLE = ATOMIC__IS_VERIFIABLE;

	/**
	 * The feature id for the '<em><b>Is Factual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__IS_FACTUAL = ATOMIC__IS_FACTUAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__DESCRIPTION = ATOMIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Formal Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__FORMAL_SPECIFICATION = ATOMIC__FORMAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__PROPERTY = ATOMIC__PROPERTY;

	/**
	 * The feature id for the '<em><b>Cont To Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__CONT_TO_RELATIONSHIP = ATOMIC__CONT_TO_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Cont From Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__CONT_FROM_RELATIONSHIP = ATOMIC__CONT_FROM_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>Computing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Computing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_OPERATION_COUNT = ATOMIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.ActivityImpl
	 * @see context.impl.ContextPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = ATOMIC__NAME;

	/**
	 * The feature id for the '<em><b>Fromrelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__FROMRELATION = ATOMIC__FROMRELATION;

	/**
	 * The feature id for the '<em><b>Torelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TORELATION = ATOMIC__TORELATION;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__REFINEMENT = ATOMIC__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_ABSTRACT = ATOMIC__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Monitorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_MONITORABLE = ATOMIC__IS_MONITORABLE;

	/**
	 * The feature id for the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_VERIFIABLE = ATOMIC__IS_VERIFIABLE;

	/**
	 * The feature id for the '<em><b>Is Factual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_FACTUAL = ATOMIC__IS_FACTUAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DESCRIPTION = ATOMIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Formal Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__FORMAL_SPECIFICATION = ATOMIC__FORMAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PROPERTY = ATOMIC__PROPERTY;

	/**
	 * The feature id for the '<em><b>Cont To Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CONT_TO_RELATIONSHIP = ATOMIC__CONT_TO_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Cont From Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CONT_FROM_RELATIONSHIP = ATOMIC__CONT_FROM_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = ATOMIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.UserImpl
	 * @see context.impl.ContextPackageImpl#getUser()
	 * @generated
	 */
	int USER = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = ATOMIC__NAME;

	/**
	 * The feature id for the '<em><b>Fromrelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FROMRELATION = ATOMIC__FROMRELATION;

	/**
	 * The feature id for the '<em><b>Torelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TORELATION = ATOMIC__TORELATION;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__REFINEMENT = ATOMIC__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__IS_ABSTRACT = ATOMIC__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Monitorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__IS_MONITORABLE = ATOMIC__IS_MONITORABLE;

	/**
	 * The feature id for the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__IS_VERIFIABLE = ATOMIC__IS_VERIFIABLE;

	/**
	 * The feature id for the '<em><b>Is Factual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__IS_FACTUAL = ATOMIC__IS_FACTUAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DESCRIPTION = ATOMIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Formal Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FORMAL_SPECIFICATION = ATOMIC__FORMAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PROPERTY = ATOMIC__PROPERTY;

	/**
	 * The feature id for the '<em><b>Cont To Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CONT_TO_RELATIONSHIP = ATOMIC__CONT_TO_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Cont From Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CONT_FROM_RELATIONSHIP = ATOMIC__CONT_FROM_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = ATOMIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.IdentifyImpl <em>Identify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.IdentifyImpl
	 * @see context.impl.ContextPackageImpl#getIdentify()
	 * @generated
	 */
	int IDENTIFY = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Fromrelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY__FROMRELATION = USER__FROMRELATION;

	/**
	 * The feature id for the '<em><b>Torelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY__TORELATION = USER__TORELATION;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY__REFINEMENT = USER__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY__IS_ABSTRACT = USER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Monitorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY__IS_MONITORABLE = USER__IS_MONITORABLE;

	/**
	 * The feature id for the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY__IS_VERIFIABLE = USER__IS_VERIFIABLE;

	/**
	 * The feature id for the '<em><b>Is Factual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY__IS_FACTUAL = USER__IS_FACTUAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY__DESCRIPTION = USER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Formal Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY__FORMAL_SPECIFICATION = USER__FORMAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY__PROPERTY = USER__PROPERTY;

	/**
	 * The feature id for the '<em><b>Cont To Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY__CONT_TO_RELATIONSHIP = USER__CONT_TO_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Cont From Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY__CONT_FROM_RELATIONSHIP = USER__CONT_FROM_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>Identify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Identify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.PreferenceImpl <em>Preference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.PreferenceImpl
	 * @see context.impl.ContextPackageImpl#getPreference()
	 * @generated
	 */
	int PREFERENCE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Fromrelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__FROMRELATION = USER__FROMRELATION;

	/**
	 * The feature id for the '<em><b>Torelation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__TORELATION = USER__TORELATION;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__REFINEMENT = USER__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__IS_ABSTRACT = USER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Monitorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__IS_MONITORABLE = USER__IS_MONITORABLE;

	/**
	 * The feature id for the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__IS_VERIFIABLE = USER__IS_VERIFIABLE;

	/**
	 * The feature id for the '<em><b>Is Factual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__IS_FACTUAL = USER__IS_FACTUAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__DESCRIPTION = USER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Formal Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__FORMAL_SPECIFICATION = USER__FORMAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__PROPERTY = USER__PROPERTY;

	/**
	 * The feature id for the '<em><b>Cont To Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__CONT_TO_RELATIONSHIP = USER__CONT_TO_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Cont From Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__CONT_FROM_RELATIONSHIP = USER__CONT_FROM_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.TimeConstraintImpl <em>Time Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.TimeConstraintImpl
	 * @see context.impl.ContextPackageImpl#getTimeConstraint()
	 * @generated
	 */
	int TIME_CONSTRAINT = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Time Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Time Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link context.impl.FixedImpl <em>Fixed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.FixedImpl
	 * @see context.impl.ContextPackageImpl#getFixed()
	 * @generated
	 */
	int FIXED = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__NAME = TIME_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__START_TIME = TIME_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__END_TIME = TIME_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fixed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FEATURE_COUNT = TIME_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fixed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OPERATION_COUNT = TIME_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.RelativeImpl <em>Relative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.RelativeImpl
	 * @see context.impl.ContextPackageImpl#getRelative()
	 * @generated
	 */
	int RELATIVE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE__NAME = TIME_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Expire Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE__EXPIRE_TIME = TIME_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_FEATURE_COUNT = TIME_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_OPERATION_COUNT = TIME_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link context.impl.ValidityImpl <em>Validity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.ValidityImpl
	 * @see context.impl.ContextPackageImpl#getValidity()
	 * @generated
	 */
	int VALIDITY = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY__CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Valid Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY__VALID_CONTEXT = 2;

	/**
	 * The number of structural features of the '<em>Validity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Validity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link context.impl.FocusImpl <em>Focus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.FocusImpl
	 * @see context.impl.ContextPackageImpl#getFocus()
	 * @generated
	 */
	int FOCUS = 35;

	/**
	 * The feature id for the '<em><b>Focal Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS__FOCAL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS__AGENT = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS__ROLE = 2;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS__ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Is Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS__IS_ACTIVATED = 4;

	/**
	 * The number of structural features of the '<em>Focus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Focus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link context.impl.RelevanceImpl <em>Relevance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.impl.RelevanceImpl
	 * @see context.impl.ContextPackageImpl#getRelevance()
	 * @generated
	 */
	int RELEVANCE = 36;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE__ARGUMENT = 1;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE__FOCUS = 2;

	/**
	 * The feature id for the '<em><b>Relevant Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE__RELEVANT_CONTEXT = 3;

	/**
	 * The number of structural features of the '<em>Relevance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Relevance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link context.RefinementType <em>Refinement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.RefinementType
	 * @see context.impl.ContextPackageImpl#getRefinementType()
	 * @generated
	 */
	int REFINEMENT_TYPE = 37;

	/**
	 * The meta object id for the '{@link context.UpdateType <em>Update Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.UpdateType
	 * @see context.impl.ContextPackageImpl#getUpdateType()
	 * @generated
	 */
	int UPDATE_TYPE = 38;

	/**
	 * The meta object id for the '{@link context.SourceType <em>Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.SourceType
	 * @see context.impl.ContextPackageImpl#getSourceType()
	 * @generated
	 */
	int SOURCE_TYPE = 39;

	/**
	 * The meta object id for the '{@link context.EntityType <em>Entity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.EntityType
	 * @see context.impl.ContextPackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 40;

	/**
	 * The meta object id for the '{@link context.Date <em>Date</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.Date
	 * @see context.impl.ContextPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 41;

	/**
	 * The meta object id for the '{@link context.RelevanceLevel <em>Relevance Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see context.RelevanceLevel
	 * @see context.impl.ContextPackageImpl#getRelevanceLevel()
	 * @generated
	 */
	int RELEVANCE_LEVEL = 42;


	/**
	 * Returns the meta object for class '{@link context.ContextElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see context.ContextElement
	 * @generated
	 */
	EClass getContextElement();

	/**
	 * Returns the meta object for the attribute '{@link context.ContextElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see context.ContextElement#getName()
	 * @see #getContextElement()
	 * @generated
	 */
	EAttribute getContextElement_Name();

	/**
	 * Returns the meta object for the reference list '{@link context.ContextElement#getFromrelation <em>Fromrelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fromrelation</em>'.
	 * @see context.ContextElement#getFromrelation()
	 * @see #getContextElement()
	 * @generated
	 */
	EReference getContextElement_Fromrelation();

	/**
	 * Returns the meta object for the reference list '{@link context.ContextElement#getTorelation <em>Torelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Torelation</em>'.
	 * @see context.ContextElement#getTorelation()
	 * @see #getContextElement()
	 * @generated
	 */
	EReference getContextElement_Torelation();

	/**
	 * Returns the meta object for the reference list '{@link context.ContextElement#getRefinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refinement</em>'.
	 * @see context.ContextElement#getRefinement()
	 * @see #getContextElement()
	 * @generated
	 */
	EReference getContextElement_Refinement();

	/**
	 * Returns the meta object for the attribute '{@link context.ContextElement#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see context.ContextElement#isIsAbstract()
	 * @see #getContextElement()
	 * @generated
	 */
	EAttribute getContextElement_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link context.ContextElement#isIsMonitorable <em>Is Monitorable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Monitorable</em>'.
	 * @see context.ContextElement#isIsMonitorable()
	 * @see #getContextElement()
	 * @generated
	 */
	EAttribute getContextElement_IsMonitorable();

	/**
	 * Returns the meta object for the attribute '{@link context.ContextElement#isIsVerifiable <em>Is Verifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Verifiable</em>'.
	 * @see context.ContextElement#isIsVerifiable()
	 * @see #getContextElement()
	 * @generated
	 */
	EAttribute getContextElement_IsVerifiable();

	/**
	 * Returns the meta object for the attribute '{@link context.ContextElement#isIsFactual <em>Is Factual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Factual</em>'.
	 * @see context.ContextElement#isIsFactual()
	 * @see #getContextElement()
	 * @generated
	 */
	EAttribute getContextElement_IsFactual();

	/**
	 * Returns the meta object for the attribute '{@link context.ContextElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see context.ContextElement#getDescription()
	 * @see #getContextElement()
	 * @generated
	 */
	EAttribute getContextElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link context.ContextElement#getFormalSpecification <em>Formal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal Specification</em>'.
	 * @see context.ContextElement#getFormalSpecification()
	 * @see #getContextElement()
	 * @generated
	 */
	EAttribute getContextElement_FormalSpecification();

	/**
	 * Returns the meta object for the attribute '{@link context.ContextElement#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see context.ContextElement#getProperty()
	 * @see #getContextElement()
	 * @generated
	 */
	EAttribute getContextElement_Property();

	/**
	 * Returns the meta object for the reference list '{@link context.ContextElement#getContToRelationship <em>Cont To Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cont To Relationship</em>'.
	 * @see context.ContextElement#getContToRelationship()
	 * @see #getContextElement()
	 * @generated
	 */
	EReference getContextElement_ContToRelationship();

	/**
	 * Returns the meta object for the reference list '{@link context.ContextElement#getContFromRelationship <em>Cont From Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cont From Relationship</em>'.
	 * @see context.ContextElement#getContFromRelationship()
	 * @see #getContextElement()
	 * @generated
	 */
	EReference getContextElement_ContFromRelationship();

	/**
	 * Returns the meta object for class '{@link context.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see context.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link context.Relationship#getTocontextelement <em>Tocontextelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tocontextelement</em>'.
	 * @see context.Relationship#getTocontextelement()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Tocontextelement();

	/**
	 * Returns the meta object for the reference list '{@link context.Relationship#getFromcontextelement <em>Fromcontextelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fromcontextelement</em>'.
	 * @see context.Relationship#getFromcontextelement()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Fromcontextelement();

	/**
	 * Returns the meta object for the attribute '{@link context.Relationship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see context.Relationship#getName()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Name();

	/**
	 * Returns the meta object for the reference '{@link context.Relationship#getRelfromRefinement <em>Relfrom Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relfrom Refinement</em>'.
	 * @see context.Relationship#getRelfromRefinement()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_RelfromRefinement();

	/**
	 * Returns the meta object for the reference '{@link context.Relationship#getRelToContext <em>Rel To Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rel To Context</em>'.
	 * @see context.Relationship#getRelToContext()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_RelToContext();

	/**
	 * Returns the meta object for the reference list '{@link context.Relationship#getRelFromContext <em>Rel From Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rel From Context</em>'.
	 * @see context.Relationship#getRelFromContext()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_RelFromContext();

	/**
	 * Returns the meta object for class '{@link context.ContextModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see context.ContextModel
	 * @generated
	 */
	EClass getContextModel();

	/**
	 * Returns the meta object for the attribute '{@link context.ContextModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see context.ContextModel#getName()
	 * @see #getContextModel()
	 * @generated
	 */
	EAttribute getContextModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link context.ContextModel#getContextelements <em>Contextelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contextelements</em>'.
	 * @see context.ContextModel#getContextelements()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_Contextelements();

	/**
	 * Returns the meta object for the containment reference list '{@link context.ContextModel#getRefinements <em>Refinements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refinements</em>'.
	 * @see context.ContextModel#getRefinements()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_Refinements();

	/**
	 * Returns the meta object for the containment reference list '{@link context.ContextModel#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see context.ContextModel#getRelationships()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_Relationships();

	/**
	 * Returns the meta object for the containment reference list '{@link context.ContextModel#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see context.ContextModel#getSources()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_Sources();

	/**
	 * Returns the meta object for the containment reference list '{@link context.ContextModel#getAcquisitions <em>Acquisitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acquisitions</em>'.
	 * @see context.ContextModel#getAcquisitions()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_Acquisitions();

	/**
	 * Returns the meta object for the containment reference list '{@link context.ContextModel#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see context.ContextModel#getEntities()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link context.ContextModel#getCharacterizations <em>Characterizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characterizations</em>'.
	 * @see context.ContextModel#getCharacterizations()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_Characterizations();

	/**
	 * Returns the meta object for the containment reference list '{@link context.ContextModel#getValidity <em>Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validity</em>'.
	 * @see context.ContextModel#getValidity()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_Validity();

	/**
	 * Returns the meta object for the containment reference list '{@link context.ContextModel#getTimeconstraints <em>Timeconstraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timeconstraints</em>'.
	 * @see context.ContextModel#getTimeconstraints()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_Timeconstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link context.ContextModel#getFoci <em>Foci</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foci</em>'.
	 * @see context.ContextModel#getFoci()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_Foci();

	/**
	 * Returns the meta object for the containment reference list '{@link context.ContextModel#getRelevance <em>Relevance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relevance</em>'.
	 * @see context.ContextModel#getRelevance()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_Relevance();

	/**
	 * Returns the meta object for class '{@link context.Refinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinement</em>'.
	 * @see context.Refinement
	 * @generated
	 */
	EClass getRefinement();

	/**
	 * Returns the meta object for the attribute '{@link context.Refinement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see context.Refinement#getType()
	 * @see #getRefinement()
	 * @generated
	 */
	EAttribute getRefinement_Type();

	/**
	 * Returns the meta object for the reference list '{@link context.Refinement#getRefiningcontexts <em>Refiningcontexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refiningcontexts</em>'.
	 * @see context.Refinement#getRefiningcontexts()
	 * @see #getRefinement()
	 * @generated
	 */
	EReference getRefinement_Refiningcontexts();

	/**
	 * Returns the meta object for the reference '{@link context.Refinement#getRefToRelationship <em>Ref To Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref To Relationship</em>'.
	 * @see context.Refinement#getRefToRelationship()
	 * @see #getRefinement()
	 * @generated
	 */
	EReference getRefinement_RefToRelationship();

	/**
	 * Returns the meta object for class '{@link context.Causal <em>Causal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Causal</em>'.
	 * @see context.Causal
	 * @generated
	 */
	EClass getCausal();

	/**
	 * Returns the meta object for class '{@link context.Support <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support</em>'.
	 * @see context.Support
	 * @generated
	 */
	EClass getSupport();

	/**
	 * Returns the meta object for class '{@link context.Acquisition <em>Acquisition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acquisition</em>'.
	 * @see context.Acquisition
	 * @generated
	 */
	EClass getAcquisition();

	/**
	 * Returns the meta object for the reference list '{@link context.Acquisition#getAquiredcontext <em>Aquiredcontext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aquiredcontext</em>'.
	 * @see context.Acquisition#getAquiredcontext()
	 * @see #getAcquisition()
	 * @generated
	 */
	EReference getAcquisition_Aquiredcontext();

	/**
	 * Returns the meta object for the reference list '{@link context.Acquisition#getContextsource <em>Contextsource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contextsource</em>'.
	 * @see context.Acquisition#getContextsource()
	 * @see #getAcquisition()
	 * @generated
	 */
	EReference getAcquisition_Contextsource();

	/**
	 * Returns the meta object for the attribute '{@link context.Acquisition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see context.Acquisition#getName()
	 * @see #getAcquisition()
	 * @generated
	 */
	EAttribute getAcquisition_Name();

	/**
	 * Returns the meta object for the attribute '{@link context.Acquisition#getUpdateFrequency <em>Update Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Frequency</em>'.
	 * @see context.Acquisition#getUpdateFrequency()
	 * @see #getAcquisition()
	 * @generated
	 */
	EAttribute getAcquisition_UpdateFrequency();

	/**
	 * Returns the meta object for class '{@link context.ContextSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see context.ContextSource
	 * @generated
	 */
	EClass getContextSource();

	/**
	 * Returns the meta object for the attribute '{@link context.ContextSource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see context.ContextSource#getName()
	 * @see #getContextSource()
	 * @generated
	 */
	EAttribute getContextSource_Name();

	/**
	 * Returns the meta object for the attribute '{@link context.ContextSource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see context.ContextSource#getType()
	 * @see #getContextSource()
	 * @generated
	 */
	EAttribute getContextSource_Type();

	/**
	 * Returns the meta object for class '{@link context.Static <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static</em>'.
	 * @see context.Static
	 * @generated
	 */
	EClass getStatic();

	/**
	 * Returns the meta object for class '{@link context.Profiled <em>Profiled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profiled</em>'.
	 * @see context.Profiled
	 * @generated
	 */
	EClass getProfiled();

	/**
	 * Returns the meta object for class '{@link context.Derived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived</em>'.
	 * @see context.Derived
	 * @generated
	 */
	EClass getDerived();

	/**
	 * Returns the meta object for the attribute '{@link context.Derived#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see context.Derived#getExpression()
	 * @see #getDerived()
	 * @generated
	 */
	EAttribute getDerived_Expression();

	/**
	 * Returns the meta object for class '{@link context.Sensed <em>Sensed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensed</em>'.
	 * @see context.Sensed
	 * @generated
	 */
	EClass getSensed();

	/**
	 * Returns the meta object for class '{@link context.Conflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflict</em>'.
	 * @see context.Conflict
	 * @generated
	 */
	EClass getConflict();

	/**
	 * Returns the meta object for class '{@link context.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel</em>'.
	 * @see context.Parallel
	 * @generated
	 */
	EClass getParallel();

	/**
	 * Returns the meta object for class '{@link context.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see context.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link context.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see context.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link context.Entity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see context.Entity#getType()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Type();

	/**
	 * Returns the meta object for class '{@link context.Characterization <em>Characterization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characterization</em>'.
	 * @see context.Characterization
	 * @generated
	 */
	EClass getCharacterization();

	/**
	 * Returns the meta object for the attribute '{@link context.Characterization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see context.Characterization#getName()
	 * @see #getCharacterization()
	 * @generated
	 */
	EAttribute getCharacterization_Name();

	/**
	 * Returns the meta object for the reference list '{@link context.Characterization#getCharEntity <em>Char Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Char Entity</em>'.
	 * @see context.Characterization#getCharEntity()
	 * @see #getCharacterization()
	 * @generated
	 */
	EReference getCharacterization_CharEntity();

	/**
	 * Returns the meta object for the reference list '{@link context.Characterization#getCharContext <em>Char Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Char Context</em>'.
	 * @see context.Characterization#getCharContext()
	 * @see #getCharacterization()
	 * @generated
	 */
	EReference getCharacterization_CharContext();

	/**
	 * Returns the meta object for class '{@link context.Atomic <em>Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic</em>'.
	 * @see context.Atomic
	 * @generated
	 */
	EClass getAtomic();

	/**
	 * Returns the meta object for class '{@link context.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see context.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the reference list '{@link context.Composite#getAtomicContext <em>Atomic Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Atomic Context</em>'.
	 * @see context.Composite#getAtomicContext()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_AtomicContext();

	/**
	 * Returns the meta object for class '{@link context.Congnitive <em>Congnitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Congnitive</em>'.
	 * @see context.Congnitive
	 * @generated
	 */
	EClass getCongnitive();

	/**
	 * Returns the meta object for class '{@link context.Social <em>Social</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social</em>'.
	 * @see context.Social
	 * @generated
	 */
	EClass getSocial();

	/**
	 * Returns the meta object for class '{@link context.Physical <em>Physical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical</em>'.
	 * @see context.Physical
	 * @generated
	 */
	EClass getPhysical();

	/**
	 * Returns the meta object for class '{@link context.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see context.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for class '{@link context.Temporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal</em>'.
	 * @see context.Temporal
	 * @generated
	 */
	EClass getTemporal();

	/**
	 * Returns the meta object for class '{@link context.Past <em>Past</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Past</em>'.
	 * @see context.Past
	 * @generated
	 */
	EClass getPast();

	/**
	 * Returns the meta object for class '{@link context.Current <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current</em>'.
	 * @see context.Current
	 * @generated
	 */
	EClass getCurrent();

	/**
	 * Returns the meta object for class '{@link context.Future <em>Future</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Future</em>'.
	 * @see context.Future
	 * @generated
	 */
	EClass getFuture();

	/**
	 * Returns the meta object for class '{@link context.Computing <em>Computing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing</em>'.
	 * @see context.Computing
	 * @generated
	 */
	EClass getComputing();

	/**
	 * Returns the meta object for class '{@link context.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see context.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for class '{@link context.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see context.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for class '{@link context.Identify <em>Identify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identify</em>'.
	 * @see context.Identify
	 * @generated
	 */
	EClass getIdentify();

	/**
	 * Returns the meta object for class '{@link context.Preference <em>Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preference</em>'.
	 * @see context.Preference
	 * @generated
	 */
	EClass getPreference();

	/**
	 * Returns the meta object for class '{@link context.TimeConstraint <em>Time Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Constraint</em>'.
	 * @see context.TimeConstraint
	 * @generated
	 */
	EClass getTimeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link context.TimeConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see context.TimeConstraint#getName()
	 * @see #getTimeConstraint()
	 * @generated
	 */
	EAttribute getTimeConstraint_Name();

	/**
	 * Returns the meta object for class '{@link context.Fixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed</em>'.
	 * @see context.Fixed
	 * @generated
	 */
	EClass getFixed();

	/**
	 * Returns the meta object for the attribute '{@link context.Fixed#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see context.Fixed#getStartTime()
	 * @see #getFixed()
	 * @generated
	 */
	EAttribute getFixed_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link context.Fixed#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see context.Fixed#getEndTime()
	 * @see #getFixed()
	 * @generated
	 */
	EAttribute getFixed_EndTime();

	/**
	 * Returns the meta object for class '{@link context.Relative <em>Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative</em>'.
	 * @see context.Relative
	 * @generated
	 */
	EClass getRelative();

	/**
	 * Returns the meta object for the attribute '{@link context.Relative#getExpireTime <em>Expire Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expire Time</em>'.
	 * @see context.Relative#getExpireTime()
	 * @see #getRelative()
	 * @generated
	 */
	EAttribute getRelative_ExpireTime();

	/**
	 * Returns the meta object for class '{@link context.Validity <em>Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validity</em>'.
	 * @see context.Validity
	 * @generated
	 */
	EClass getValidity();

	/**
	 * Returns the meta object for the attribute '{@link context.Validity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see context.Validity#getName()
	 * @see #getValidity()
	 * @generated
	 */
	EAttribute getValidity_Name();

	/**
	 * Returns the meta object for the reference list '{@link context.Validity#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraint</em>'.
	 * @see context.Validity#getConstraint()
	 * @see #getValidity()
	 * @generated
	 */
	EReference getValidity_Constraint();

	/**
	 * Returns the meta object for the reference list '{@link context.Validity#getValidContext <em>Valid Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Valid Context</em>'.
	 * @see context.Validity#getValidContext()
	 * @see #getValidity()
	 * @generated
	 */
	EReference getValidity_ValidContext();

	/**
	 * Returns the meta object for class '{@link context.Focus <em>Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Focus</em>'.
	 * @see context.Focus
	 * @generated
	 */
	EClass getFocus();

	/**
	 * Returns the meta object for the attribute '{@link context.Focus#getFocalElement <em>Focal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Focal Element</em>'.
	 * @see context.Focus#getFocalElement()
	 * @see #getFocus()
	 * @generated
	 */
	EAttribute getFocus_FocalElement();

	/**
	 * Returns the meta object for the attribute '{@link context.Focus#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agent</em>'.
	 * @see context.Focus#getAgent()
	 * @see #getFocus()
	 * @generated
	 */
	EAttribute getFocus_Agent();

	/**
	 * Returns the meta object for the attribute '{@link context.Focus#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see context.Focus#getRole()
	 * @see #getFocus()
	 * @generated
	 */
	EAttribute getFocus_Role();

	/**
	 * Returns the meta object for the attribute '{@link context.Focus#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity</em>'.
	 * @see context.Focus#getEntity()
	 * @see #getFocus()
	 * @generated
	 */
	EAttribute getFocus_Entity();

	/**
	 * Returns the meta object for the attribute '{@link context.Focus#isIsActivated <em>Is Activated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Activated</em>'.
	 * @see context.Focus#isIsActivated()
	 * @see #getFocus()
	 * @generated
	 */
	EAttribute getFocus_IsActivated();

	/**
	 * Returns the meta object for class '{@link context.Relevance <em>Relevance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relevance</em>'.
	 * @see context.Relevance
	 * @generated
	 */
	EClass getRelevance();

	/**
	 * Returns the meta object for the attribute '{@link context.Relevance#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see context.Relevance#getLevel()
	 * @see #getRelevance()
	 * @generated
	 */
	EAttribute getRelevance_Level();

	/**
	 * Returns the meta object for the attribute '{@link context.Relevance#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argument</em>'.
	 * @see context.Relevance#getArgument()
	 * @see #getRelevance()
	 * @generated
	 */
	EAttribute getRelevance_Argument();

	/**
	 * Returns the meta object for the reference list '{@link context.Relevance#getFocus <em>Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Focus</em>'.
	 * @see context.Relevance#getFocus()
	 * @see #getRelevance()
	 * @generated
	 */
	EReference getRelevance_Focus();

	/**
	 * Returns the meta object for the reference list '{@link context.Relevance#getRelevantContext <em>Relevant Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relevant Context</em>'.
	 * @see context.Relevance#getRelevantContext()
	 * @see #getRelevance()
	 * @generated
	 */
	EReference getRelevance_RelevantContext();

	/**
	 * Returns the meta object for enum '{@link context.RefinementType <em>Refinement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Refinement Type</em>'.
	 * @see context.RefinementType
	 * @generated
	 */
	EEnum getRefinementType();

	/**
	 * Returns the meta object for enum '{@link context.UpdateType <em>Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Update Type</em>'.
	 * @see context.UpdateType
	 * @generated
	 */
	EEnum getUpdateType();

	/**
	 * Returns the meta object for enum '{@link context.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source Type</em>'.
	 * @see context.SourceType
	 * @generated
	 */
	EEnum getSourceType();

	/**
	 * Returns the meta object for enum '{@link context.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Type</em>'.
	 * @see context.EntityType
	 * @generated
	 */
	EEnum getEntityType();

	/**
	 * Returns the meta object for enum '{@link context.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Date</em>'.
	 * @see context.Date
	 * @generated
	 */
	EEnum getDate();

	/**
	 * Returns the meta object for enum '{@link context.RelevanceLevel <em>Relevance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relevance Level</em>'.
	 * @see context.RelevanceLevel
	 * @generated
	 */
	EEnum getRelevanceLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContextFactory getContextFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link context.impl.ContextElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.ContextElementImpl
		 * @see context.impl.ContextPackageImpl#getContextElement()
		 * @generated
		 */
		EClass CONTEXT_ELEMENT = eINSTANCE.getContextElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_ELEMENT__NAME = eINSTANCE.getContextElement_Name();

		/**
		 * The meta object literal for the '<em><b>Fromrelation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ELEMENT__FROMRELATION = eINSTANCE.getContextElement_Fromrelation();

		/**
		 * The meta object literal for the '<em><b>Torelation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ELEMENT__TORELATION = eINSTANCE.getContextElement_Torelation();

		/**
		 * The meta object literal for the '<em><b>Refinement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ELEMENT__REFINEMENT = eINSTANCE.getContextElement_Refinement();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_ELEMENT__IS_ABSTRACT = eINSTANCE.getContextElement_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Is Monitorable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_ELEMENT__IS_MONITORABLE = eINSTANCE.getContextElement_IsMonitorable();

		/**
		 * The meta object literal for the '<em><b>Is Verifiable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_ELEMENT__IS_VERIFIABLE = eINSTANCE.getContextElement_IsVerifiable();

		/**
		 * The meta object literal for the '<em><b>Is Factual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_ELEMENT__IS_FACTUAL = eINSTANCE.getContextElement_IsFactual();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_ELEMENT__DESCRIPTION = eINSTANCE.getContextElement_Description();

		/**
		 * The meta object literal for the '<em><b>Formal Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_ELEMENT__FORMAL_SPECIFICATION = eINSTANCE.getContextElement_FormalSpecification();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_ELEMENT__PROPERTY = eINSTANCE.getContextElement_Property();

		/**
		 * The meta object literal for the '<em><b>Cont To Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ELEMENT__CONT_TO_RELATIONSHIP = eINSTANCE.getContextElement_ContToRelationship();

		/**
		 * The meta object literal for the '<em><b>Cont From Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_ELEMENT__CONT_FROM_RELATIONSHIP = eINSTANCE.getContextElement_ContFromRelationship();

		/**
		 * The meta object literal for the '{@link context.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.RelationshipImpl
		 * @see context.impl.ContextPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Tocontextelement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TOCONTEXTELEMENT = eINSTANCE.getRelationship_Tocontextelement();

		/**
		 * The meta object literal for the '<em><b>Fromcontextelement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__FROMCONTEXTELEMENT = eINSTANCE.getRelationship_Fromcontextelement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__NAME = eINSTANCE.getRelationship_Name();

		/**
		 * The meta object literal for the '<em><b>Relfrom Refinement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__RELFROM_REFINEMENT = eINSTANCE.getRelationship_RelfromRefinement();

		/**
		 * The meta object literal for the '<em><b>Rel To Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__REL_TO_CONTEXT = eINSTANCE.getRelationship_RelToContext();

		/**
		 * The meta object literal for the '<em><b>Rel From Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__REL_FROM_CONTEXT = eINSTANCE.getRelationship_RelFromContext();

		/**
		 * The meta object literal for the '{@link context.impl.ContextModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.ContextModelImpl
		 * @see context.impl.ContextPackageImpl#getContextModel()
		 * @generated
		 */
		EClass CONTEXT_MODEL = eINSTANCE.getContextModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MODEL__NAME = eINSTANCE.getContextModel_Name();

		/**
		 * The meta object literal for the '<em><b>Contextelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__CONTEXTELEMENTS = eINSTANCE.getContextModel_Contextelements();

		/**
		 * The meta object literal for the '<em><b>Refinements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__REFINEMENTS = eINSTANCE.getContextModel_Refinements();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__RELATIONSHIPS = eINSTANCE.getContextModel_Relationships();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__SOURCES = eINSTANCE.getContextModel_Sources();

		/**
		 * The meta object literal for the '<em><b>Acquisitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__ACQUISITIONS = eINSTANCE.getContextModel_Acquisitions();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__ENTITIES = eINSTANCE.getContextModel_Entities();

		/**
		 * The meta object literal for the '<em><b>Characterizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__CHARACTERIZATIONS = eINSTANCE.getContextModel_Characterizations();

		/**
		 * The meta object literal for the '<em><b>Validity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__VALIDITY = eINSTANCE.getContextModel_Validity();

		/**
		 * The meta object literal for the '<em><b>Timeconstraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__TIMECONSTRAINTS = eINSTANCE.getContextModel_Timeconstraints();

		/**
		 * The meta object literal for the '<em><b>Foci</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__FOCI = eINSTANCE.getContextModel_Foci();

		/**
		 * The meta object literal for the '<em><b>Relevance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__RELEVANCE = eINSTANCE.getContextModel_Relevance();

		/**
		 * The meta object literal for the '{@link context.impl.RefinementImpl <em>Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.RefinementImpl
		 * @see context.impl.ContextPackageImpl#getRefinement()
		 * @generated
		 */
		EClass REFINEMENT = eINSTANCE.getRefinement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFINEMENT__TYPE = eINSTANCE.getRefinement_Type();

		/**
		 * The meta object literal for the '<em><b>Refiningcontexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT__REFININGCONTEXTS = eINSTANCE.getRefinement_Refiningcontexts();

		/**
		 * The meta object literal for the '<em><b>Ref To Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT__REF_TO_RELATIONSHIP = eINSTANCE.getRefinement_RefToRelationship();

		/**
		 * The meta object literal for the '{@link context.impl.CausalImpl <em>Causal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.CausalImpl
		 * @see context.impl.ContextPackageImpl#getCausal()
		 * @generated
		 */
		EClass CAUSAL = eINSTANCE.getCausal();

		/**
		 * The meta object literal for the '{@link context.impl.SupportImpl <em>Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.SupportImpl
		 * @see context.impl.ContextPackageImpl#getSupport()
		 * @generated
		 */
		EClass SUPPORT = eINSTANCE.getSupport();

		/**
		 * The meta object literal for the '{@link context.impl.AcquisitionImpl <em>Acquisition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.AcquisitionImpl
		 * @see context.impl.ContextPackageImpl#getAcquisition()
		 * @generated
		 */
		EClass ACQUISITION = eINSTANCE.getAcquisition();

		/**
		 * The meta object literal for the '<em><b>Aquiredcontext</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACQUISITION__AQUIREDCONTEXT = eINSTANCE.getAcquisition_Aquiredcontext();

		/**
		 * The meta object literal for the '<em><b>Contextsource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACQUISITION__CONTEXTSOURCE = eINSTANCE.getAcquisition_Contextsource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACQUISITION__NAME = eINSTANCE.getAcquisition_Name();

		/**
		 * The meta object literal for the '<em><b>Update Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACQUISITION__UPDATE_FREQUENCY = eINSTANCE.getAcquisition_UpdateFrequency();

		/**
		 * The meta object literal for the '{@link context.impl.ContextSourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.ContextSourceImpl
		 * @see context.impl.ContextPackageImpl#getContextSource()
		 * @generated
		 */
		EClass CONTEXT_SOURCE = eINSTANCE.getContextSource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_SOURCE__NAME = eINSTANCE.getContextSource_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_SOURCE__TYPE = eINSTANCE.getContextSource_Type();

		/**
		 * The meta object literal for the '{@link context.impl.StaticImpl <em>Static</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.StaticImpl
		 * @see context.impl.ContextPackageImpl#getStatic()
		 * @generated
		 */
		EClass STATIC = eINSTANCE.getStatic();

		/**
		 * The meta object literal for the '{@link context.impl.ProfiledImpl <em>Profiled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.ProfiledImpl
		 * @see context.impl.ContextPackageImpl#getProfiled()
		 * @generated
		 */
		EClass PROFILED = eINSTANCE.getProfiled();

		/**
		 * The meta object literal for the '{@link context.impl.DerivedImpl <em>Derived</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.DerivedImpl
		 * @see context.impl.ContextPackageImpl#getDerived()
		 * @generated
		 */
		EClass DERIVED = eINSTANCE.getDerived();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED__EXPRESSION = eINSTANCE.getDerived_Expression();

		/**
		 * The meta object literal for the '{@link context.impl.SensedImpl <em>Sensed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.SensedImpl
		 * @see context.impl.ContextPackageImpl#getSensed()
		 * @generated
		 */
		EClass SENSED = eINSTANCE.getSensed();

		/**
		 * The meta object literal for the '{@link context.impl.ConflictImpl <em>Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.ConflictImpl
		 * @see context.impl.ContextPackageImpl#getConflict()
		 * @generated
		 */
		EClass CONFLICT = eINSTANCE.getConflict();

		/**
		 * The meta object literal for the '{@link context.impl.ParallelImpl <em>Parallel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.ParallelImpl
		 * @see context.impl.ContextPackageImpl#getParallel()
		 * @generated
		 */
		EClass PARALLEL = eINSTANCE.getParallel();

		/**
		 * The meta object literal for the '{@link context.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.EntityImpl
		 * @see context.impl.ContextPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__TYPE = eINSTANCE.getEntity_Type();

		/**
		 * The meta object literal for the '{@link context.impl.CharacterizationImpl <em>Characterization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.CharacterizationImpl
		 * @see context.impl.ContextPackageImpl#getCharacterization()
		 * @generated
		 */
		EClass CHARACTERIZATION = eINSTANCE.getCharacterization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERIZATION__NAME = eINSTANCE.getCharacterization_Name();

		/**
		 * The meta object literal for the '<em><b>Char Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERIZATION__CHAR_ENTITY = eINSTANCE.getCharacterization_CharEntity();

		/**
		 * The meta object literal for the '<em><b>Char Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERIZATION__CHAR_CONTEXT = eINSTANCE.getCharacterization_CharContext();

		/**
		 * The meta object literal for the '{@link context.impl.AtomicImpl <em>Atomic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.AtomicImpl
		 * @see context.impl.ContextPackageImpl#getAtomic()
		 * @generated
		 */
		EClass ATOMIC = eINSTANCE.getAtomic();

		/**
		 * The meta object literal for the '{@link context.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.CompositeImpl
		 * @see context.impl.ContextPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '<em><b>Atomic Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__ATOMIC_CONTEXT = eINSTANCE.getComposite_AtomicContext();

		/**
		 * The meta object literal for the '{@link context.impl.CongnitiveImpl <em>Congnitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.CongnitiveImpl
		 * @see context.impl.ContextPackageImpl#getCongnitive()
		 * @generated
		 */
		EClass CONGNITIVE = eINSTANCE.getCongnitive();

		/**
		 * The meta object literal for the '{@link context.impl.SocialImpl <em>Social</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.SocialImpl
		 * @see context.impl.ContextPackageImpl#getSocial()
		 * @generated
		 */
		EClass SOCIAL = eINSTANCE.getSocial();

		/**
		 * The meta object literal for the '{@link context.impl.PhysicalImpl <em>Physical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.PhysicalImpl
		 * @see context.impl.ContextPackageImpl#getPhysical()
		 * @generated
		 */
		EClass PHYSICAL = eINSTANCE.getPhysical();

		/**
		 * The meta object literal for the '{@link context.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.LocationImpl
		 * @see context.impl.ContextPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '{@link context.impl.TemporalImpl <em>Temporal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.TemporalImpl
		 * @see context.impl.ContextPackageImpl#getTemporal()
		 * @generated
		 */
		EClass TEMPORAL = eINSTANCE.getTemporal();

		/**
		 * The meta object literal for the '{@link context.impl.PastImpl <em>Past</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.PastImpl
		 * @see context.impl.ContextPackageImpl#getPast()
		 * @generated
		 */
		EClass PAST = eINSTANCE.getPast();

		/**
		 * The meta object literal for the '{@link context.impl.CurrentImpl <em>Current</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.CurrentImpl
		 * @see context.impl.ContextPackageImpl#getCurrent()
		 * @generated
		 */
		EClass CURRENT = eINSTANCE.getCurrent();

		/**
		 * The meta object literal for the '{@link context.impl.FutureImpl <em>Future</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.FutureImpl
		 * @see context.impl.ContextPackageImpl#getFuture()
		 * @generated
		 */
		EClass FUTURE = eINSTANCE.getFuture();

		/**
		 * The meta object literal for the '{@link context.impl.ComputingImpl <em>Computing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.ComputingImpl
		 * @see context.impl.ContextPackageImpl#getComputing()
		 * @generated
		 */
		EClass COMPUTING = eINSTANCE.getComputing();

		/**
		 * The meta object literal for the '{@link context.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.ActivityImpl
		 * @see context.impl.ContextPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '{@link context.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.UserImpl
		 * @see context.impl.ContextPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '{@link context.impl.IdentifyImpl <em>Identify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.IdentifyImpl
		 * @see context.impl.ContextPackageImpl#getIdentify()
		 * @generated
		 */
		EClass IDENTIFY = eINSTANCE.getIdentify();

		/**
		 * The meta object literal for the '{@link context.impl.PreferenceImpl <em>Preference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.PreferenceImpl
		 * @see context.impl.ContextPackageImpl#getPreference()
		 * @generated
		 */
		EClass PREFERENCE = eINSTANCE.getPreference();

		/**
		 * The meta object literal for the '{@link context.impl.TimeConstraintImpl <em>Time Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.TimeConstraintImpl
		 * @see context.impl.ContextPackageImpl#getTimeConstraint()
		 * @generated
		 */
		EClass TIME_CONSTRAINT = eINSTANCE.getTimeConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONSTRAINT__NAME = eINSTANCE.getTimeConstraint_Name();

		/**
		 * The meta object literal for the '{@link context.impl.FixedImpl <em>Fixed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.FixedImpl
		 * @see context.impl.ContextPackageImpl#getFixed()
		 * @generated
		 */
		EClass FIXED = eINSTANCE.getFixed();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED__START_TIME = eINSTANCE.getFixed_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED__END_TIME = eINSTANCE.getFixed_EndTime();

		/**
		 * The meta object literal for the '{@link context.impl.RelativeImpl <em>Relative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.RelativeImpl
		 * @see context.impl.ContextPackageImpl#getRelative()
		 * @generated
		 */
		EClass RELATIVE = eINSTANCE.getRelative();

		/**
		 * The meta object literal for the '<em><b>Expire Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE__EXPIRE_TIME = eINSTANCE.getRelative_ExpireTime();

		/**
		 * The meta object literal for the '{@link context.impl.ValidityImpl <em>Validity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.ValidityImpl
		 * @see context.impl.ContextPackageImpl#getValidity()
		 * @generated
		 */
		EClass VALIDITY = eINSTANCE.getValidity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDITY__NAME = eINSTANCE.getValidity_Name();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDITY__CONSTRAINT = eINSTANCE.getValidity_Constraint();

		/**
		 * The meta object literal for the '<em><b>Valid Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDITY__VALID_CONTEXT = eINSTANCE.getValidity_ValidContext();

		/**
		 * The meta object literal for the '{@link context.impl.FocusImpl <em>Focus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.FocusImpl
		 * @see context.impl.ContextPackageImpl#getFocus()
		 * @generated
		 */
		EClass FOCUS = eINSTANCE.getFocus();

		/**
		 * The meta object literal for the '<em><b>Focal Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOCUS__FOCAL_ELEMENT = eINSTANCE.getFocus_FocalElement();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOCUS__AGENT = eINSTANCE.getFocus_Agent();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOCUS__ROLE = eINSTANCE.getFocus_Role();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOCUS__ENTITY = eINSTANCE.getFocus_Entity();

		/**
		 * The meta object literal for the '<em><b>Is Activated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOCUS__IS_ACTIVATED = eINSTANCE.getFocus_IsActivated();

		/**
		 * The meta object literal for the '{@link context.impl.RelevanceImpl <em>Relevance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.impl.RelevanceImpl
		 * @see context.impl.ContextPackageImpl#getRelevance()
		 * @generated
		 */
		EClass RELEVANCE = eINSTANCE.getRelevance();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEVANCE__LEVEL = eINSTANCE.getRelevance_Level();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEVANCE__ARGUMENT = eINSTANCE.getRelevance_Argument();

		/**
		 * The meta object literal for the '<em><b>Focus</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEVANCE__FOCUS = eINSTANCE.getRelevance_Focus();

		/**
		 * The meta object literal for the '<em><b>Relevant Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEVANCE__RELEVANT_CONTEXT = eINSTANCE.getRelevance_RelevantContext();

		/**
		 * The meta object literal for the '{@link context.RefinementType <em>Refinement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.RefinementType
		 * @see context.impl.ContextPackageImpl#getRefinementType()
		 * @generated
		 */
		EEnum REFINEMENT_TYPE = eINSTANCE.getRefinementType();

		/**
		 * The meta object literal for the '{@link context.UpdateType <em>Update Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.UpdateType
		 * @see context.impl.ContextPackageImpl#getUpdateType()
		 * @generated
		 */
		EEnum UPDATE_TYPE = eINSTANCE.getUpdateType();

		/**
		 * The meta object literal for the '{@link context.SourceType <em>Source Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.SourceType
		 * @see context.impl.ContextPackageImpl#getSourceType()
		 * @generated
		 */
		EEnum SOURCE_TYPE = eINSTANCE.getSourceType();

		/**
		 * The meta object literal for the '{@link context.EntityType <em>Entity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.EntityType
		 * @see context.impl.ContextPackageImpl#getEntityType()
		 * @generated
		 */
		EEnum ENTITY_TYPE = eINSTANCE.getEntityType();

		/**
		 * The meta object literal for the '{@link context.Date <em>Date</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.Date
		 * @see context.impl.ContextPackageImpl#getDate()
		 * @generated
		 */
		EEnum DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '{@link context.RelevanceLevel <em>Relevance Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see context.RelevanceLevel
		 * @see context.impl.ContextPackageImpl#getRelevanceLevel()
		 * @generated
		 */
		EEnum RELEVANCE_LEVEL = eINSTANCE.getRelevanceLevel();

	}

} //ContextPackage
