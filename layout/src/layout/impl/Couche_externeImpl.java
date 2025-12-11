/**
 */
package layout.impl;

import java.util.Collection;

import layout.Couche_externe;
import layout.Instancecomp;
import layout.LayoutPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Couche externe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link layout.impl.Couche_externeImpl#getInstancecomp <em>Instancecomp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Couche_externeImpl extends CoucheImpl implements Couche_externe {
	/**
	 * The cached value of the '{@link #getInstancecomp() <em>Instancecomp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstancecomp()
	 * @generated
	 * @ordered
	 */
	protected EList<Instancecomp> instancecomp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Couche_externeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutPackage.Literals.COUCHE_EXTERNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Instancecomp> getInstancecomp() {
		if (instancecomp == null) {
			instancecomp = new EObjectContainmentEList<Instancecomp>(Instancecomp.class, this, LayoutPackage.COUCHE_EXTERNE__INSTANCECOMP);
		}
		return instancecomp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutPackage.COUCHE_EXTERNE__INSTANCECOMP:
				return ((InternalEList<?>)getInstancecomp()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LayoutPackage.COUCHE_EXTERNE__INSTANCECOMP:
				return getInstancecomp();
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
			case LayoutPackage.COUCHE_EXTERNE__INSTANCECOMP:
				getInstancecomp().clear();
				getInstancecomp().addAll((Collection<? extends Instancecomp>)newValue);
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
			case LayoutPackage.COUCHE_EXTERNE__INSTANCECOMP:
				getInstancecomp().clear();
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
			case LayoutPackage.COUCHE_EXTERNE__INSTANCECOMP:
				return instancecomp != null && !instancecomp.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Couche_externeImpl
