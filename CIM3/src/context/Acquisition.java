/**
 */
package context;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acquisition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link context.Acquisition#getAquiredcontext <em>Aquiredcontext</em>}</li>
 *   <li>{@link context.Acquisition#getContextsource <em>Contextsource</em>}</li>
 *   <li>{@link context.Acquisition#getName <em>Name</em>}</li>
 *   <li>{@link context.Acquisition#getUpdateFrequency <em>Update Frequency</em>}</li>
 * </ul>
 *
 * @see context.ContextPackage#getAcquisition()
 * @model
 * @generated
 */
public interface Acquisition extends EObject {
	/**
	 * Returns the value of the '<em><b>Aquiredcontext</b></em>' reference list.
	 * The list contents are of type {@link context.ContextElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aquiredcontext</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aquiredcontext</em>' reference list.
	 * @see context.ContextPackage#getAcquisition_Aquiredcontext()
	 * @model
	 * @generated
	 */
	EList<ContextElement> getAquiredcontext();

	/**
	 * Returns the value of the '<em><b>Contextsource</b></em>' reference list.
	 * The list contents are of type {@link context.ContextSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contextsource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contextsource</em>' reference list.
	 * @see context.ContextPackage#getAcquisition_Contextsource()
	 * @model
	 * @generated
	 */
	EList<ContextSource> getContextsource();

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
	 * @see context.ContextPackage#getAcquisition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link context.Acquisition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Update Frequency</b></em>' attribute.
	 * The literals are from the enumeration {@link context.UpdateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Frequency</em>' attribute.
	 * @see context.UpdateType
	 * @see #setUpdateFrequency(UpdateType)
	 * @see context.ContextPackage#getAcquisition_UpdateFrequency()
	 * @model
	 * @generated
	 */
	UpdateType getUpdateFrequency();

	/**
	 * Sets the value of the '{@link context.Acquisition#getUpdateFrequency <em>Update Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Frequency</em>' attribute.
	 * @see context.UpdateType
	 * @see #getUpdateFrequency()
	 * @generated
	 */
	void setUpdateFrequency(UpdateType value);

} // Acquisition
