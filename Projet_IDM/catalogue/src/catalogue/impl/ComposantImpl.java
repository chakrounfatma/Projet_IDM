/**
 */
package catalogue.impl;

import catalogue.Catalogue;
import catalogue.CataloguePackage;
import catalogue.Composant;
import catalogue.Contrainte;
import catalogue.Empreinte;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Composant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link catalogue.impl.ComposantImpl#getEmpreinte <em>Empreinte</em>}</li>
 *   <li>{@link catalogue.impl.ComposantImpl#getContrainte <em>Contrainte</em>}</li>
 *   <li>{@link catalogue.impl.ComposantImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link catalogue.impl.ComposantImpl#getMarque <em>Marque</em>}</li>
 *   <li>{@link catalogue.impl.ComposantImpl#getPort <em>Port</em>}</li>
 *   <li>{@link catalogue.impl.ComposantImpl#getCatalogue <em>Catalogue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComposantImpl extends MinimalEObjectImpl.Container implements Composant {
	/**
	 * The cached value of the '{@link #getEmpreinte() <em>Empreinte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpreinte()
	 * @generated
	 * @ordered
	 */
	protected Empreinte empreinte;

	/**
	 * The cached value of the '{@link #getContrainte() <em>Contrainte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrainte()
	 * @generated
	 * @ordered
	 */
	protected EList<Contrainte> contrainte;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarque() <em>Marque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarque()
	 * @generated
	 * @ordered
	 */
	protected static final String MARQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarque() <em>Marque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarque()
	 * @generated
	 * @ordered
	 */
	protected String marque = MARQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCatalogue() <em>Catalogue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogue()
	 * @generated
	 * @ordered
	 */
	protected Catalogue catalogue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CataloguePackage.Literals.COMPOSANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Empreinte getEmpreinte() {
		return empreinte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpreinte(Empreinte newEmpreinte, NotificationChain msgs) {
		Empreinte oldEmpreinte = empreinte;
		empreinte = newEmpreinte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CataloguePackage.COMPOSANT__EMPREINTE, oldEmpreinte, newEmpreinte);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmpreinte(Empreinte newEmpreinte) {
		if (newEmpreinte != empreinte) {
			NotificationChain msgs = null;
			if (empreinte != null)
				msgs = ((InternalEObject)empreinte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CataloguePackage.COMPOSANT__EMPREINTE, null, msgs);
			if (newEmpreinte != null)
				msgs = ((InternalEObject)newEmpreinte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CataloguePackage.COMPOSANT__EMPREINTE, null, msgs);
			msgs = basicSetEmpreinte(newEmpreinte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.COMPOSANT__EMPREINTE, newEmpreinte, newEmpreinte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Contrainte> getContrainte() {
		if (contrainte == null) {
			contrainte = new EObjectContainmentEList<Contrainte>(Contrainte.class, this, CataloguePackage.COMPOSANT__CONTRAINTE);
		}
		return contrainte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMarque() {
		return marque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarque(String newMarque) {
		String oldMarque = marque;
		marque = newMarque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.COMPOSANT__MARQUE, oldMarque, marque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.COMPOSANT__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.COMPOSANT__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catalogue getCatalogue() {
		if (catalogue != null && catalogue.eIsProxy()) {
			InternalEObject oldCatalogue = (InternalEObject)catalogue;
			catalogue = (Catalogue)eResolveProxy(oldCatalogue);
			if (catalogue != oldCatalogue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CataloguePackage.COMPOSANT__CATALOGUE, oldCatalogue, catalogue));
			}
		}
		return catalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalogue basicGetCatalogue() {
		return catalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCatalogue(Catalogue newCatalogue) {
		Catalogue oldCatalogue = catalogue;
		catalogue = newCatalogue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.COMPOSANT__CATALOGUE, oldCatalogue, catalogue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CataloguePackage.COMPOSANT__EMPREINTE:
				return basicSetEmpreinte(null, msgs);
			case CataloguePackage.COMPOSANT__CONTRAINTE:
				return ((InternalEList<?>)getContrainte()).basicRemove(otherEnd, msgs);
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
			case CataloguePackage.COMPOSANT__EMPREINTE:
				return getEmpreinte();
			case CataloguePackage.COMPOSANT__CONTRAINTE:
				return getContrainte();
			case CataloguePackage.COMPOSANT__NOM:
				return getNom();
			case CataloguePackage.COMPOSANT__MARQUE:
				return getMarque();
			case CataloguePackage.COMPOSANT__PORT:
				return getPort();
			case CataloguePackage.COMPOSANT__CATALOGUE:
				if (resolve) return getCatalogue();
				return basicGetCatalogue();
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
			case CataloguePackage.COMPOSANT__EMPREINTE:
				setEmpreinte((Empreinte)newValue);
				return;
			case CataloguePackage.COMPOSANT__CONTRAINTE:
				getContrainte().clear();
				getContrainte().addAll((Collection<? extends Contrainte>)newValue);
				return;
			case CataloguePackage.COMPOSANT__NOM:
				setNom((String)newValue);
				return;
			case CataloguePackage.COMPOSANT__MARQUE:
				setMarque((String)newValue);
				return;
			case CataloguePackage.COMPOSANT__PORT:
				setPort((Integer)newValue);
				return;
			case CataloguePackage.COMPOSANT__CATALOGUE:
				setCatalogue((Catalogue)newValue);
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
			case CataloguePackage.COMPOSANT__EMPREINTE:
				setEmpreinte((Empreinte)null);
				return;
			case CataloguePackage.COMPOSANT__CONTRAINTE:
				getContrainte().clear();
				return;
			case CataloguePackage.COMPOSANT__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case CataloguePackage.COMPOSANT__MARQUE:
				setMarque(MARQUE_EDEFAULT);
				return;
			case CataloguePackage.COMPOSANT__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case CataloguePackage.COMPOSANT__CATALOGUE:
				setCatalogue((Catalogue)null);
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
			case CataloguePackage.COMPOSANT__EMPREINTE:
				return empreinte != null;
			case CataloguePackage.COMPOSANT__CONTRAINTE:
				return contrainte != null && !contrainte.isEmpty();
			case CataloguePackage.COMPOSANT__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case CataloguePackage.COMPOSANT__MARQUE:
				return MARQUE_EDEFAULT == null ? marque != null : !MARQUE_EDEFAULT.equals(marque);
			case CataloguePackage.COMPOSANT__PORT:
				return port != PORT_EDEFAULT;
			case CataloguePackage.COMPOSANT__CATALOGUE:
				return catalogue != null;
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", marque: ");
		result.append(marque);
		result.append(", port: ");
		result.append(port);
		result.append(')');
		return result.toString();
	}

} //ComposantImpl
