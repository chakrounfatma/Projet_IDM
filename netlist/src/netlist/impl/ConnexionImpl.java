/**
 */
package netlist.impl;

import netlist.Connexion;
import netlist.NetlistPackage;
import netlist.Port;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connexion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link netlist.impl.ConnexionImpl#getPorta <em>Porta</em>}</li>
 *   <li>{@link netlist.impl.ConnexionImpl#getPortb <em>Portb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnexionImpl extends ElementImpl implements Connexion {
	/**
	 * The cached value of the '{@link #getPorta() <em>Porta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorta()
	 * @generated
	 * @ordered
	 */
	protected Port porta;

	/**
	 * The cached value of the '{@link #getPortb() <em>Portb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortb()
	 * @generated
	 * @ordered
	 */
	protected Port portb;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnexionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetlistPackage.Literals.CONNEXION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getPorta() {
		if (porta != null && porta.eIsProxy()) {
			InternalEObject oldPorta = (InternalEObject)porta;
			porta = (Port)eResolveProxy(oldPorta);
			if (porta != oldPorta) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetlistPackage.CONNEXION__PORTA, oldPorta, porta));
			}
		}
		return porta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPorta() {
		return porta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPorta(Port newPorta) {
		Port oldPorta = porta;
		porta = newPorta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetlistPackage.CONNEXION__PORTA, oldPorta, porta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getPortb() {
		if (portb != null && portb.eIsProxy()) {
			InternalEObject oldPortb = (InternalEObject)portb;
			portb = (Port)eResolveProxy(oldPortb);
			if (portb != oldPortb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetlistPackage.CONNEXION__PORTB, oldPortb, portb));
			}
		}
		return portb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPortb() {
		return portb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortb(Port newPortb) {
		Port oldPortb = portb;
		portb = newPortb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetlistPackage.CONNEXION__PORTB, oldPortb, portb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetlistPackage.CONNEXION__PORTA:
				if (resolve) return getPorta();
				return basicGetPorta();
			case NetlistPackage.CONNEXION__PORTB:
				if (resolve) return getPortb();
				return basicGetPortb();
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
			case NetlistPackage.CONNEXION__PORTA:
				setPorta((Port)newValue);
				return;
			case NetlistPackage.CONNEXION__PORTB:
				setPortb((Port)newValue);
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
			case NetlistPackage.CONNEXION__PORTA:
				setPorta((Port)null);
				return;
			case NetlistPackage.CONNEXION__PORTB:
				setPortb((Port)null);
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
			case NetlistPackage.CONNEXION__PORTA:
				return porta != null;
			case NetlistPackage.CONNEXION__PORTB:
				return portb != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnexionImpl
