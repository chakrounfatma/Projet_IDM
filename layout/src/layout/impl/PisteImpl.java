/**
 */
package layout.impl;

import layout.Couche;
import layout.LayoutPackage;
import layout.Piste;

import netlist.Connexion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Piste</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link layout.impl.PisteImpl#getCouche <em>Couche</em>}</li>
 *   <li>{@link layout.impl.PisteImpl#getConnexion <em>Connexion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PisteImpl extends MinimalEObjectImpl.Container implements Piste {
	/**
	 * The cached value of the '{@link #getConnexion() <em>Connexion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnexion()
	 * @generated
	 * @ordered
	 */
	protected Connexion connexion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PisteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutPackage.Literals.PISTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Couche getCouche() {
		if (eContainerFeatureID() != LayoutPackage.PISTE__COUCHE) return null;
		return (Couche)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCouche(Couche newCouche, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCouche, LayoutPackage.PISTE__COUCHE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCouche(Couche newCouche) {
		if (newCouche != eInternalContainer() || (eContainerFeatureID() != LayoutPackage.PISTE__COUCHE && newCouche != null)) {
			if (EcoreUtil.isAncestor(this, newCouche))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCouche != null)
				msgs = ((InternalEObject)newCouche).eInverseAdd(this, LayoutPackage.COUCHE__PISTE, Couche.class, msgs);
			msgs = basicSetCouche(newCouche, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.PISTE__COUCHE, newCouche, newCouche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connexion getConnexion() {
		if (connexion != null && connexion.eIsProxy()) {
			InternalEObject oldConnexion = (InternalEObject)connexion;
			connexion = (Connexion)eResolveProxy(oldConnexion);
			if (connexion != oldConnexion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LayoutPackage.PISTE__CONNEXION, oldConnexion, connexion));
			}
		}
		return connexion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connexion basicGetConnexion() {
		return connexion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnexion(Connexion newConnexion) {
		Connexion oldConnexion = connexion;
		connexion = newConnexion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.PISTE__CONNEXION, oldConnexion, connexion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutPackage.PISTE__COUCHE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCouche((Couche)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutPackage.PISTE__COUCHE:
				return basicSetCouche(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case LayoutPackage.PISTE__COUCHE:
				return eInternalContainer().eInverseRemove(this, LayoutPackage.COUCHE__PISTE, Couche.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LayoutPackage.PISTE__COUCHE:
				return getCouche();
			case LayoutPackage.PISTE__CONNEXION:
				if (resolve) return getConnexion();
				return basicGetConnexion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LayoutPackage.PISTE__COUCHE:
				setCouche((Couche)newValue);
				return;
			case LayoutPackage.PISTE__CONNEXION:
				setConnexion((Connexion)newValue);
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
			case LayoutPackage.PISTE__COUCHE:
				setCouche((Couche)null);
				return;
			case LayoutPackage.PISTE__CONNEXION:
				setConnexion((Connexion)null);
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
			case LayoutPackage.PISTE__COUCHE:
				return getCouche() != null;
			case LayoutPackage.PISTE__CONNEXION:
				return connexion != null;
		}
		return super.eIsSet(featureID);
	}

} //PisteImpl
