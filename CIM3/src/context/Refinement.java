/**
 */
package context;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link context.Refinement#getType <em>Type</em>}</li>
 *   <li>{@link context.Refinement#getRefiningcontexts <em>Refiningcontexts</em>}</li>
 *   <li>{@link context.Refinement#getRefToRelationship <em>Ref To Relationship</em>}</li>
 * </ul>
 *
 * @see context.ContextPackage#getRefinement()
 * @model
 * @generated
 */
public interface Refinement extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link context.RefinementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see context.RefinementType
	 * @see #setType(RefinementType)
	 * @see context.ContextPackage#getRefinement_Type()
	 * @model
	 * @generated
	 */
	RefinementType getType();

	/**
	 * Sets the value of the '{@link context.Refinement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see context.RefinementType
	 * @see #getType()
	 * @generated
	 */
	void setType(RefinementType value);

	/**
	 * Returns the value of the '<em><b>Refiningcontexts</b></em>' reference list.
	 * The list contents are of type {@link context.ContextElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refiningcontexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refiningcontexts</em>' reference list.
	 * @see context.ContextPackage#getRefinement_Refiningcontexts()
	 * @model
	 * @generated
	 */
	EList<ContextElement> getRefiningcontexts();

	/**
	 * Returns the value of the '<em><b>Ref To Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref To Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref To Relationship</em>' reference.
	 * @see #setRefToRelationship(Relationship)
	 * @see context.ContextPackage#getRefinement_RefToRelationship()
	 * @model
	 * @generated
	 */
	Relationship getRefToRelationship();

	/**
	 * Sets the value of the '{@link context.Refinement#getRefToRelationship <em>Ref To Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref To Relationship</em>' reference.
	 * @see #getRefToRelationship()
	 * @generated
	 */
	void setRefToRelationship(Relationship value);

} // Refinement
