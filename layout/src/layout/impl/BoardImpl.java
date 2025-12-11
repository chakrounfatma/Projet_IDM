/**
 */
package layout.impl;

import java.util.Collection;

import layout.Board;
import layout.Couche_externe;
import layout.Couche_interne;
import layout.Layout;
import layout.LayoutPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link layout.impl.BoardImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link layout.impl.BoardImpl#getCouche_interne <em>Couche interne</em>}</li>
 *   <li>{@link layout.impl.BoardImpl#getCouche_externe <em>Couche externe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardImpl extends MinimalEObjectImpl.Container implements Board {
	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected Layout layout;

	/**
	 * The cached value of the '{@link #getCouche_interne() <em>Couche interne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouche_interne()
	 * @generated
	 * @ordered
	 */
	protected EList<Couche_interne> couche_interne;

	/**
	 * The cached value of the '{@link #getCouche_externe() <em>Couche externe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouche_externe()
	 * @generated
	 * @ordered
	 */
	protected EList<Couche_externe> couche_externe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutPackage.Literals.BOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Layout getLayout() {
		if (layout != null && layout.eIsProxy()) {
			InternalEObject oldLayout = (InternalEObject)layout;
			layout = (Layout)eResolveProxy(oldLayout);
			if (layout != oldLayout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LayoutPackage.BOARD__LAYOUT, oldLayout, layout));
			}
		}
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout basicGetLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayout(Layout newLayout) {
		Layout oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.BOARD__LAYOUT, oldLayout, layout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Couche_interne> getCouche_interne() {
		if (couche_interne == null) {
			couche_interne = new EObjectContainmentEList<Couche_interne>(Couche_interne.class, this, LayoutPackage.BOARD__COUCHE_INTERNE);
		}
		return couche_interne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Couche_externe> getCouche_externe() {
		if (couche_externe == null) {
			couche_externe = new EObjectContainmentEList<Couche_externe>(Couche_externe.class, this, LayoutPackage.BOARD__COUCHE_EXTERNE);
		}
		return couche_externe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutPackage.BOARD__COUCHE_INTERNE:
				return ((InternalEList<?>)getCouche_interne()).basicRemove(otherEnd, msgs);
			case LayoutPackage.BOARD__COUCHE_EXTERNE:
				return ((InternalEList<?>)getCouche_externe()).basicRemove(otherEnd, msgs);
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
			case LayoutPackage.BOARD__LAYOUT:
				if (resolve) return getLayout();
				return basicGetLayout();
			case LayoutPackage.BOARD__COUCHE_INTERNE:
				return getCouche_interne();
			case LayoutPackage.BOARD__COUCHE_EXTERNE:
				return getCouche_externe();
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
			case LayoutPackage.BOARD__LAYOUT:
				setLayout((Layout)newValue);
				return;
			case LayoutPackage.BOARD__COUCHE_INTERNE:
				getCouche_interne().clear();
				getCouche_interne().addAll((Collection<? extends Couche_interne>)newValue);
				return;
			case LayoutPackage.BOARD__COUCHE_EXTERNE:
				getCouche_externe().clear();
				getCouche_externe().addAll((Collection<? extends Couche_externe>)newValue);
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
			case LayoutPackage.BOARD__LAYOUT:
				setLayout((Layout)null);
				return;
			case LayoutPackage.BOARD__COUCHE_INTERNE:
				getCouche_interne().clear();
				return;
			case LayoutPackage.BOARD__COUCHE_EXTERNE:
				getCouche_externe().clear();
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
			case LayoutPackage.BOARD__LAYOUT:
				return layout != null;
			case LayoutPackage.BOARD__COUCHE_INTERNE:
				return couche_interne != null && !couche_interne.isEmpty();
			case LayoutPackage.BOARD__COUCHE_EXTERNE:
				return couche_externe != null && !couche_externe.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BoardImpl
