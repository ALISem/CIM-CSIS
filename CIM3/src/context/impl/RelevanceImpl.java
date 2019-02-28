/**
 */
package context.impl;

import context.ContextElement;
import context.ContextPackage;
import context.Focus;
import context.Relevance;
import context.RelevanceLevel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relevance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link context.impl.RelevanceImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link context.impl.RelevanceImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link context.impl.RelevanceImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link context.impl.RelevanceImpl#getRelevantContext <em>Relevant Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelevanceImpl extends MinimalEObjectImpl.Container implements Relevance {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final RelevanceLevel LEVEL_EDEFAULT = RelevanceLevel.HIGH;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected RelevanceLevel level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getArgument() <em>Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected static final String ARGUMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected String argument = ARGUMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected EList<Focus> focus;

	/**
	 * The cached value of the '{@link #getRelevantContext() <em>Relevant Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevantContext()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextElement> relevantContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelevanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.RELEVANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelevanceLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(RelevanceLevel newLevel) {
		RelevanceLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.RELEVANCE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArgument() {
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgument(String newArgument) {
		String oldArgument = argument;
		argument = newArgument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.RELEVANCE__ARGUMENT, oldArgument, argument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Focus> getFocus() {
		if (focus == null) {
			focus = new EObjectResolvingEList<Focus>(Focus.class, this, ContextPackage.RELEVANCE__FOCUS);
		}
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextElement> getRelevantContext() {
		if (relevantContext == null) {
			relevantContext = new EObjectResolvingEList<ContextElement>(ContextElement.class, this, ContextPackage.RELEVANCE__RELEVANT_CONTEXT);
		}
		return relevantContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.RELEVANCE__LEVEL:
				return getLevel();
			case ContextPackage.RELEVANCE__ARGUMENT:
				return getArgument();
			case ContextPackage.RELEVANCE__FOCUS:
				return getFocus();
			case ContextPackage.RELEVANCE__RELEVANT_CONTEXT:
				return getRelevantContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContextPackage.RELEVANCE__LEVEL:
				setLevel((RelevanceLevel)newValue);
				return;
			case ContextPackage.RELEVANCE__ARGUMENT:
				setArgument((String)newValue);
				return;
			case ContextPackage.RELEVANCE__FOCUS:
				getFocus().clear();
				getFocus().addAll((Collection<? extends Focus>)newValue);
				return;
			case ContextPackage.RELEVANCE__RELEVANT_CONTEXT:
				getRelevantContext().clear();
				getRelevantContext().addAll((Collection<? extends ContextElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ContextPackage.RELEVANCE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case ContextPackage.RELEVANCE__ARGUMENT:
				setArgument(ARGUMENT_EDEFAULT);
				return;
			case ContextPackage.RELEVANCE__FOCUS:
				getFocus().clear();
				return;
			case ContextPackage.RELEVANCE__RELEVANT_CONTEXT:
				getRelevantContext().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ContextPackage.RELEVANCE__LEVEL:
				return level != LEVEL_EDEFAULT;
			case ContextPackage.RELEVANCE__ARGUMENT:
				return ARGUMENT_EDEFAULT == null ? argument != null : !ARGUMENT_EDEFAULT.equals(argument);
			case ContextPackage.RELEVANCE__FOCUS:
				return focus != null && !focus.isEmpty();
			case ContextPackage.RELEVANCE__RELEVANT_CONTEXT:
				return relevantContext != null && !relevantContext.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (level: ");
		result.append(level);
		result.append(", argument: ");
		result.append(argument);
		result.append(')');
		return result.toString();
	}

} //RelevanceImpl
