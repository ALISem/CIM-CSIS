/**
 */
package context;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link context.Relative#getExpireTime <em>Expire Time</em>}</li>
 * </ul>
 *
 * @see context.ContextPackage#getRelative()
 * @model
 * @generated
 */
public interface Relative extends TimeConstraint {
	/**
	 * Returns the value of the '<em><b>Expire Time</b></em>' attribute.
	 * The literals are from the enumeration {@link context.Date}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expire Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expire Time</em>' attribute.
	 * @see context.Date
	 * @see #setExpireTime(Date)
	 * @see context.ContextPackage#getRelative_ExpireTime()
	 * @model
	 * @generated
	 */
	Date getExpireTime();

	/**
	 * Sets the value of the '{@link context.Relative#getExpireTime <em>Expire Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expire Time</em>' attribute.
	 * @see context.Date
	 * @see #getExpireTime()
	 * @generated
	 */
	void setExpireTime(Date value);

} // Relative
