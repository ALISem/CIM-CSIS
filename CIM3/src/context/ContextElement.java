/**
 */
package context;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link context.ContextElement#getName <em>Name</em>}</li>
 *   <li>{@link context.ContextElement#getFromrelation <em>Fromrelation</em>}</li>
 *   <li>{@link context.ContextElement#getTorelation <em>Torelation</em>}</li>
 *   <li>{@link context.ContextElement#getRefinement <em>Refinement</em>}</li>
 *   <li>{@link context.ContextElement#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link context.ContextElement#isIsMonitorable <em>Is Monitorable</em>}</li>
 *   <li>{@link context.ContextElement#isIsVerifiable <em>Is Verifiable</em>}</li>
 *   <li>{@link context.ContextElement#isIsFactual <em>Is Factual</em>}</li>
 *   <li>{@link context.ContextElement#getDescription <em>Description</em>}</li>
 *   <li>{@link context.ContextElement#getFormalSpecification <em>Formal Specification</em>}</li>
 *   <li>{@link context.ContextElement#getProperty <em>Property</em>}</li>
 *   <li>{@link context.ContextElement#getContToRelationship <em>Cont To Relationship</em>}</li>
 *   <li>{@link context.ContextElement#getContFromRelationship <em>Cont From Relationship</em>}</li>
 * </ul>
 *
 * @see context.ContextPackage#getContextElement()
 * @model
 * @generated
 */
public interface ContextElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see context.ContextPackage#getContextElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link context.ContextElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fromrelation</b></em>' reference list.
	 * The list contents are of type {@link context.Relationship}.
	 * It is bidirectional and its opposite is '{@link context.Relationship#getTocontextelement <em>Tocontextelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fromrelation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fromrelation</em>' reference list.
	 * @see context.ContextPackage#getContextElement_Fromrelation()
	 * @see context.Relationship#getTocontextelement
	 * @model opposite="Tocontextelement"
	 * @generated
	 */
	EList<Relationship> getFromrelation();

	/**
	 * Returns the value of the '<em><b>Torelation</b></em>' reference list.
	 * The list contents are of type {@link context.Relationship}.
	 * It is bidirectional and its opposite is '{@link context.Relationship#getFromcontextelement <em>Fromcontextelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Torelation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Torelation</em>' reference list.
	 * @see context.ContextPackage#getContextElement_Torelation()
	 * @see context.Relationship#getFromcontextelement
	 * @model opposite="Fromcontextelement"
	 * @generated
	 */
	EList<Relationship> getTorelation();

	/**
	 * Returns the value of the '<em><b>Refinement</b></em>' reference list.
	 * The list contents are of type {@link context.Refinement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement</em>' reference list.
	 * @see context.ContextPackage#getContextElement_Refinement()
	 * @model
	 * @generated
	 */
	EList<Refinement> getRefinement();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see context.ContextPackage#getContextElement_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link context.ContextElement#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Monitorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Monitorable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Monitorable</em>' attribute.
	 * @see #setIsMonitorable(boolean)
	 * @see context.ContextPackage#getContextElement_IsMonitorable()
	 * @model
	 * @generated
	 */
	boolean isIsMonitorable();

	/**
	 * Sets the value of the '{@link context.ContextElement#isIsMonitorable <em>Is Monitorable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Monitorable</em>' attribute.
	 * @see #isIsMonitorable()
	 * @generated
	 */
	void setIsMonitorable(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Verifiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Verifiable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Verifiable</em>' attribute.
	 * @see #setIsVerifiable(boolean)
	 * @see context.ContextPackage#getContextElement_IsVerifiable()
	 * @model
	 * @generated
	 */
	boolean isIsVerifiable();

	/**
	 * Sets the value of the '{@link context.ContextElement#isIsVerifiable <em>Is Verifiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Verifiable</em>' attribute.
	 * @see #isIsVerifiable()
	 * @generated
	 */
	void setIsVerifiable(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Factual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Factual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Factual</em>' attribute.
	 * @see #setIsFactual(boolean)
	 * @see context.ContextPackage#getContextElement_IsFactual()
	 * @model
	 * @generated
	 */
	boolean isIsFactual();

	/**
	 * Sets the value of the '{@link context.ContextElement#isIsFactual <em>Is Factual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Factual</em>' attribute.
	 * @see #isIsFactual()
	 * @generated
	 */
	void setIsFactual(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see context.ContextPackage#getContextElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link context.ContextElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Formal Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Specification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Specification</em>' attribute.
	 * @see #setFormalSpecification(String)
	 * @see context.ContextPackage#getContextElement_FormalSpecification()
	 * @model
	 * @generated
	 */
	String getFormalSpecification();

	/**
	 * Sets the value of the '{@link context.ContextElement#getFormalSpecification <em>Formal Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal Specification</em>' attribute.
	 * @see #getFormalSpecification()
	 * @generated
	 */
	void setFormalSpecification(String value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see context.ContextPackage#getContextElement_Property()
	 * @model
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link context.ContextElement#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

	/**
	 * Returns the value of the '<em><b>Cont To Relationship</b></em>' reference list.
	 * The list contents are of type {@link context.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cont To Relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cont To Relationship</em>' reference list.
	 * @see context.ContextPackage#getContextElement_ContToRelationship()
	 * @model
	 * @generated
	 */
	EList<Relationship> getContToRelationship();

	/**
	 * Returns the value of the '<em><b>Cont From Relationship</b></em>' reference list.
	 * The list contents are of type {@link context.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cont From Relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cont From Relationship</em>' reference list.
	 * @see context.ContextPackage#getContextElement_ContFromRelationship()
	 * @model
	 * @generated
	 */
	EList<Relationship> getContFromRelationship();

} // ContextElement
