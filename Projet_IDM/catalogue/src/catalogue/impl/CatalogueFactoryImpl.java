/**
 */
package catalogue.impl;

import catalogue.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CatalogueFactoryImpl extends EFactoryImpl implements CatalogueFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CatalogueFactory init() {
		try {
			CatalogueFactory theCatalogueFactory = (CatalogueFactory)EPackage.Registry.INSTANCE.getEFactory(CataloguePackage.eNS_URI);
			if (theCatalogueFactory != null) {
				return theCatalogueFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CatalogueFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogueFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CataloguePackage.CATALOGUE: return createCatalogue();
			case CataloguePackage.COMPOSANT: return createComposant();
			case CataloguePackage.CONTRAINTE: return createContrainte();
			case CataloguePackage.EMPREINTE: return createEmpreinte();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catalogue createCatalogue() {
		CatalogueImpl catalogue = new CatalogueImpl();
		return catalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composant createComposant() {
		ComposantImpl composant = new ComposantImpl();
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contrainte createContrainte() {
		ContrainteImpl contrainte = new ContrainteImpl();
		return contrainte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Empreinte createEmpreinte() {
		EmpreinteImpl empreinte = new EmpreinteImpl();
		return empreinte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CataloguePackage getCataloguePackage() {
		return (CataloguePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CataloguePackage getPackage() {
		return CataloguePackage.eINSTANCE;
	}

} //CatalogueFactoryImpl
