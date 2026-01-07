/**
 */
package netlist.impl;

import catalogue.Composant;

import java.util.Collection;

import netlist.Instancecomp;
import netlist.NetlistPackage;
import netlist.Port;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instancecomp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link netlist.impl.InstancecompImpl#getComposant <em>Composant</em>}</li>
 *   <li>{@link netlist.impl.InstancecompImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstancecompImpl extends ElementImpl implements Instancecomp {
	/**
	 * The cached value of the '{@link #getComposant() <em>Composant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposant()
	 * @generated
	 * @ordered
	 */
	protected Composant composant;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstancecompImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetlistPackage.Literals.INSTANCECOMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composant getComposant() {
		if (composant != null && composant.eIsProxy()) {
			InternalEObject oldComposant = (InternalEObject)composant;
			composant = (Composant)eResolveProxy(oldComposant);
			if (composant != oldComposant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetlistPackage.INSTANCECOMP__COMPOSANT, oldComposant, composant));
			}
		}
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composant basicGetComposant() {
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComposant(Composant newComposant) {
		Composant oldComposant = composant;
		composant = newComposant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetlistPackage.INSTANCECOMP__COMPOSANT, oldComposant, composant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<Port>(Port.class, this, NetlistPackage.INSTANCECOMP__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetlistPackage.INSTANCECOMP__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
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
			case NetlistPackage.INSTANCECOMP__COMPOSANT:
				if (resolve) return getComposant();
				return basicGetComposant();
			case NetlistPackage.INSTANCECOMP__PORT:
				return getPort();
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
			case NetlistPackage.INSTANCECOMP__COMPOSANT:
				setComposant((Composant)newValue);
				return;
			case NetlistPackage.INSTANCECOMP__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends Port>)newValue);
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
			case NetlistPackage.INSTANCECOMP__COMPOSANT:
				setComposant((Composant)null);
				return;
			case NetlistPackage.INSTANCECOMP__PORT:
				getPort().clear();
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
			case NetlistPackage.INSTANCECOMP__COMPOSANT:
				return composant != null;
			case NetlistPackage.INSTANCECOMP__PORT:
				return port != null && !port.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstancecompImpl
