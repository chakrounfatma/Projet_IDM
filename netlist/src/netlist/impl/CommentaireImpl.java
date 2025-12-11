/**
 */
package netlist.impl;

import netlist.Commentaire;
import netlist.Instancecomp;
import netlist.Netlist;
import netlist.NetlistPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commentaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link netlist.impl.CommentaireImpl#getNetlistcom <em>Netlistcom</em>}</li>
 *   <li>{@link netlist.impl.CommentaireImpl#getInstancecomp <em>Instancecomp</em>}</li>
 *   <li>{@link netlist.impl.CommentaireImpl#getTexte <em>Texte</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentaireImpl extends ElementImpl implements Commentaire {
	/**
	 * The cached value of the '{@link #getNetlistcom() <em>Netlistcom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetlistcom()
	 * @generated
	 * @ordered
	 */
	protected Netlist netlistcom;

	/**
	 * The cached value of the '{@link #getInstancecomp() <em>Instancecomp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstancecomp()
	 * @generated
	 * @ordered
	 */
	protected Instancecomp instancecomp;

	/**
	 * The default value of the '{@link #getTexte() <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexte()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTexte() <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexte()
	 * @generated
	 * @ordered
	 */
	protected String texte = TEXTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetlistPackage.Literals.COMMENTAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Netlist getNetlistcom() {
		if (netlistcom != null && netlistcom.eIsProxy()) {
			InternalEObject oldNetlistcom = (InternalEObject)netlistcom;
			netlistcom = (Netlist)eResolveProxy(oldNetlistcom);
			if (netlistcom != oldNetlistcom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetlistPackage.COMMENTAIRE__NETLISTCOM, oldNetlistcom, netlistcom));
			}
		}
		return netlistcom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Netlist basicGetNetlistcom() {
		return netlistcom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetlistcom(Netlist newNetlistcom) {
		Netlist oldNetlistcom = netlistcom;
		netlistcom = newNetlistcom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetlistPackage.COMMENTAIRE__NETLISTCOM, oldNetlistcom, netlistcom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instancecomp getInstancecomp() {
		if (instancecomp != null && instancecomp.eIsProxy()) {
			InternalEObject oldInstancecomp = (InternalEObject)instancecomp;
			instancecomp = (Instancecomp)eResolveProxy(oldInstancecomp);
			if (instancecomp != oldInstancecomp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetlistPackage.COMMENTAIRE__INSTANCECOMP, oldInstancecomp, instancecomp));
			}
		}
		return instancecomp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instancecomp basicGetInstancecomp() {
		return instancecomp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstancecomp(Instancecomp newInstancecomp) {
		Instancecomp oldInstancecomp = instancecomp;
		instancecomp = newInstancecomp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetlistPackage.COMMENTAIRE__INSTANCECOMP, oldInstancecomp, instancecomp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTexte() {
		return texte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTexte(String newTexte) {
		String oldTexte = texte;
		texte = newTexte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetlistPackage.COMMENTAIRE__TEXTE, oldTexte, texte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetlistPackage.COMMENTAIRE__NETLISTCOM:
				if (resolve) return getNetlistcom();
				return basicGetNetlistcom();
			case NetlistPackage.COMMENTAIRE__INSTANCECOMP:
				if (resolve) return getInstancecomp();
				return basicGetInstancecomp();
			case NetlistPackage.COMMENTAIRE__TEXTE:
				return getTexte();
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
			case NetlistPackage.COMMENTAIRE__NETLISTCOM:
				setNetlistcom((Netlist)newValue);
				return;
			case NetlistPackage.COMMENTAIRE__INSTANCECOMP:
				setInstancecomp((Instancecomp)newValue);
				return;
			case NetlistPackage.COMMENTAIRE__TEXTE:
				setTexte((String)newValue);
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
			case NetlistPackage.COMMENTAIRE__NETLISTCOM:
				setNetlistcom((Netlist)null);
				return;
			case NetlistPackage.COMMENTAIRE__INSTANCECOMP:
				setInstancecomp((Instancecomp)null);
				return;
			case NetlistPackage.COMMENTAIRE__TEXTE:
				setTexte(TEXTE_EDEFAULT);
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
			case NetlistPackage.COMMENTAIRE__NETLISTCOM:
				return netlistcom != null;
			case NetlistPackage.COMMENTAIRE__INSTANCECOMP:
				return instancecomp != null;
			case NetlistPackage.COMMENTAIRE__TEXTE:
				return TEXTE_EDEFAULT == null ? texte != null : !TEXTE_EDEFAULT.equals(texte);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (texte: ");
		result.append(texte);
		result.append(')');
		return result.toString();
	}

} //CommentaireImpl
