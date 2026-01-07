/**
 */
package catalogue.impl;

import catalogue.CataloguePackage;
import catalogue.Empreinte;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empreinte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link catalogue.impl.EmpreinteImpl#getLongueur <em>Longueur</em>}</li>
 *   <li>{@link catalogue.impl.EmpreinteImpl#getLargeur <em>Largeur</em>}</li>
 *   <li>{@link catalogue.impl.EmpreinteImpl#getTaillePort <em>Taille Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmpreinteImpl extends MinimalEObjectImpl.Container implements Empreinte {
	/**
	 * The default value of the '{@link #getLongueur() <em>Longueur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueur()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGUEUR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongueur() <em>Longueur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueur()
	 * @generated
	 * @ordered
	 */
	protected double longueur = LONGUEUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLargeur() <em>Largeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeur()
	 * @generated
	 * @ordered
	 */
	protected static final double LARGEUR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLargeur() <em>Largeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeur()
	 * @generated
	 * @ordered
	 */
	protected double largeur = LARGEUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaillePort() <em>Taille Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaillePort()
	 * @generated
	 * @ordered
	 */
	protected static final double TAILLE_PORT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTaillePort() <em>Taille Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaillePort()
	 * @generated
	 * @ordered
	 */
	protected double taillePort = TAILLE_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmpreinteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CataloguePackage.Literals.EMPREINTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLongueur() {
		return longueur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongueur(double newLongueur) {
		double oldLongueur = longueur;
		longueur = newLongueur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.EMPREINTE__LONGUEUR, oldLongueur, longueur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLargeur() {
		return largeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLargeur(double newLargeur) {
		double oldLargeur = largeur;
		largeur = newLargeur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.EMPREINTE__LARGEUR, oldLargeur, largeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTaillePort() {
		return taillePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaillePort(double newTaillePort) {
		double oldTaillePort = taillePort;
		taillePort = newTaillePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.EMPREINTE__TAILLE_PORT, oldTaillePort, taillePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CataloguePackage.EMPREINTE__LONGUEUR:
				return getLongueur();
			case CataloguePackage.EMPREINTE__LARGEUR:
				return getLargeur();
			case CataloguePackage.EMPREINTE__TAILLE_PORT:
				return getTaillePort();
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
			case CataloguePackage.EMPREINTE__LONGUEUR:
				setLongueur((Double)newValue);
				return;
			case CataloguePackage.EMPREINTE__LARGEUR:
				setLargeur((Double)newValue);
				return;
			case CataloguePackage.EMPREINTE__TAILLE_PORT:
				setTaillePort((Double)newValue);
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
			case CataloguePackage.EMPREINTE__LONGUEUR:
				setLongueur(LONGUEUR_EDEFAULT);
				return;
			case CataloguePackage.EMPREINTE__LARGEUR:
				setLargeur(LARGEUR_EDEFAULT);
				return;
			case CataloguePackage.EMPREINTE__TAILLE_PORT:
				setTaillePort(TAILLE_PORT_EDEFAULT);
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
			case CataloguePackage.EMPREINTE__LONGUEUR:
				return longueur != LONGUEUR_EDEFAULT;
			case CataloguePackage.EMPREINTE__LARGEUR:
				return largeur != LARGEUR_EDEFAULT;
			case CataloguePackage.EMPREINTE__TAILLE_PORT:
				return taillePort != TAILLE_PORT_EDEFAULT;
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
		result.append(" (longueur: ");
		result.append(longueur);
		result.append(", largeur: ");
		result.append(largeur);
		result.append(", TaillePort: ");
		result.append(taillePort);
		result.append(')');
		return result.toString();
	}

} //EmpreinteImpl
