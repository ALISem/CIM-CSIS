/**
 */
package context;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Focus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link context.Focus#getFocalElement <em>Focal Element</em>}</li>
 *   <li>{@link context.Focus#getAgent <em>Agent</em>}</li>
 *   <li>{@link context.Focus#getRole <em>Role</em>}</li>
 *   <li>{@link context.Focus#getEntity <em>Entity</em>}</li>
 *   <li>{@link context.Focus#isIsActivated <em>Is Activated</em>}</li>
 * </ul>
 *
 * @see context.ContextPackage#getFocus()
 * @model
 * @generated
 */
public interface Focus extends EObject {
	/**
	 * Returns the value of the '<em><b>Focal Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focal Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focal Element</em>' attribute.
	 * @see #setFocalElement(String)
	 * @see context.ContextPackage#getFocus_FocalElement()
	 * @model
	 * @generated
	 */
	String getFocalElement();

	/**
	 * Sets the value of the '{@link context.Focus#getFocalElement <em>Focal Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focal Element</em>' attribute.
	 * @see #getFocalElement()
	 * @generated
	 */
	void setFocalElement(String value);

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' attribute.
	 * @see #setAgent(String)
	 * @see context.ContextPackage#getFocus_Agent()
	 * @model
	 * @generated
	 */
	String getAgent();

	/**
	 * Sets the value of the '{@link context.Focus#getAgent <em>Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' attribute.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see context.ContextPackage#getFocus_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link context.Focus#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' attribute.
	 * @see #setEntity(String)
	 * @see context.ContextPackage#getFocus_Entity()
	 * @model
	 * @generated
	 */
	String getEntity();

	/**
	 * Sets the value of the '{@link context.Focus#getEntity <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' attribute.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(String value);

	/**
	 * Returns the value of the '<em><b>Is Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Activated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Activated</em>' attribute.
	 * @see #setIsActivated(boolean)
	 * @see context.ContextPackage#getFocus_IsActivated()
	 * @model
	 * @generated
	 */
	boolean isIsActivated();

	/**
	 * Sets the value of the '{@link context.Focus#isIsActivated <em>Is Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Activated</em>' attribute.
	 * @see #isIsActivated()
	 * @generated
	 */
	void setIsActivated(boolean value);

} // Focus
