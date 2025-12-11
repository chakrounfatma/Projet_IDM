/**
 */
package catalogue;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see catalogue.CatalogueFactory
 * @model kind="package"
 * @generated
 */
public interface CataloguePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "catalogue";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://catalogue";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "catalogue";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CataloguePackage eINSTANCE = catalogue.impl.CataloguePackageImpl.init();

	/**
	 * The meta object id for the '{@link catalogue.impl.CatalogueImpl <em>Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.CatalogueImpl
	 * @see catalogue.impl.CataloguePackageImpl#getCatalogue()
	 * @generated
	 */
	int CATALOGUE = 0;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__COMPOSANT = 0;

	/**
	 * The number of structural features of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link catalogue.impl.ComposantImpl <em>Composant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.ComposantImpl
	 * @see catalogue.impl.CataloguePackageImpl#getComposant()
	 * @generated
	 */
	int COMPOSANT = 1;

	/**
	 * The feature id for the '<em><b>Empreinte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__EMPREINTE = 0;

	/**
	 * The feature id for the '<em><b>Contrainte</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__CONTRAINTE = 1;

	/**
	 * The feature id for the '<em><b>Marque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__MARQUE = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__NOM = 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__PORT = 4;

	/**
	 * The feature id for the '<em><b>Catalogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__CATALOGUE = 5;

	/**
	 * The number of structural features of the '<em>Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link catalogue.impl.ContrainteImpl <em>Contrainte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.ContrainteImpl
	 * @see catalogue.impl.CataloguePackageImpl#getContrainte()
	 * @generated
	 */
	int CONTRAINTE = 2;

	/**
	 * The number of structural features of the '<em>Contrainte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Contrainte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link catalogue.impl.EmpreinteImpl <em>Empreinte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.EmpreinteImpl
	 * @see catalogue.impl.CataloguePackageImpl#getEmpreinte()
	 * @generated
	 */
	int EMPREINTE = 3;

	/**
	 * The feature id for the '<em><b>Longueur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPREINTE__LONGUEUR = 0;

	/**
	 * The feature id for the '<em><b>Largeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPREINTE__LARGEUR = 1;

	/**
	 * The feature id for the '<em><b>Taille Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPREINTE__TAILLE_PORT = 2;

	/**
	 * The number of structural features of the '<em>Empreinte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPREINTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Empreinte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPREINTE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link catalogue.Catalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogue</em>'.
	 * @see catalogue.Catalogue
	 * @generated
	 */
	EClass getCatalogue();

	/**
	 * Returns the meta object for the containment reference list '{@link catalogue.Catalogue#getComposant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composant</em>'.
	 * @see catalogue.Catalogue#getComposant()
	 * @see #getCatalogue()
	 * @generated
	 */
	EReference getCatalogue_Composant();

	/**
	 * Returns the meta object for class '{@link catalogue.Composant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composant</em>'.
	 * @see catalogue.Composant
	 * @generated
	 */
	EClass getComposant();

	/**
	 * Returns the meta object for the containment reference '{@link catalogue.Composant#getEmpreinte <em>Empreinte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Empreinte</em>'.
	 * @see catalogue.Composant#getEmpreinte()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Empreinte();

	/**
	 * Returns the meta object for the containment reference list '{@link catalogue.Composant#getContrainte <em>Contrainte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contrainte</em>'.
	 * @see catalogue.Composant#getContrainte()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Contrainte();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Composant#getMarque <em>Marque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marque</em>'.
	 * @see catalogue.Composant#getMarque()
	 * @see #getComposant()
	 * @generated
	 */
	EAttribute getComposant_Marque();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Composant#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see catalogue.Composant#getNom()
	 * @see #getComposant()
	 * @generated
	 */
	EAttribute getComposant_Nom();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Composant#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see catalogue.Composant#getPort()
	 * @see #getComposant()
	 * @generated
	 */
	EAttribute getComposant_Port();

	/**
	 * Returns the meta object for the reference '{@link catalogue.Composant#getCatalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Catalogue</em>'.
	 * @see catalogue.Composant#getCatalogue()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Catalogue();

	/**
	 * Returns the meta object for class '{@link catalogue.Contrainte <em>Contrainte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrainte</em>'.
	 * @see catalogue.Contrainte
	 * @generated
	 */
	EClass getContrainte();

	/**
	 * Returns the meta object for class '{@link catalogue.Empreinte <em>Empreinte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empreinte</em>'.
	 * @see catalogue.Empreinte
	 * @generated
	 */
	EClass getEmpreinte();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Empreinte#getLongueur <em>Longueur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longueur</em>'.
	 * @see catalogue.Empreinte#getLongueur()
	 * @see #getEmpreinte()
	 * @generated
	 */
	EAttribute getEmpreinte_Longueur();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Empreinte#getLargeur <em>Largeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Largeur</em>'.
	 * @see catalogue.Empreinte#getLargeur()
	 * @see #getEmpreinte()
	 * @generated
	 */
	EAttribute getEmpreinte_Largeur();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Empreinte#getTaillePort <em>Taille Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taille Port</em>'.
	 * @see catalogue.Empreinte#getTaillePort()
	 * @see #getEmpreinte()
	 * @generated
	 */
	EAttribute getEmpreinte_TaillePort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CatalogueFactory getCatalogueFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link catalogue.impl.CatalogueImpl <em>Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.CatalogueImpl
		 * @see catalogue.impl.CataloguePackageImpl#getCatalogue()
		 * @generated
		 */
		EClass CATALOGUE = eINSTANCE.getCatalogue();

		/**
		 * The meta object literal for the '<em><b>Composant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE__COMPOSANT = eINSTANCE.getCatalogue_Composant();

		/**
		 * The meta object literal for the '{@link catalogue.impl.ComposantImpl <em>Composant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.ComposantImpl
		 * @see catalogue.impl.CataloguePackageImpl#getComposant()
		 * @generated
		 */
		EClass COMPOSANT = eINSTANCE.getComposant();

		/**
		 * The meta object literal for the '<em><b>Empreinte</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__EMPREINTE = eINSTANCE.getComposant_Empreinte();

		/**
		 * The meta object literal for the '<em><b>Contrainte</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__CONTRAINTE = eINSTANCE.getComposant_Contrainte();

		/**
		 * The meta object literal for the '<em><b>Marque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSANT__MARQUE = eINSTANCE.getComposant_Marque();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSANT__NOM = eINSTANCE.getComposant_Nom();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSANT__PORT = eINSTANCE.getComposant_Port();

		/**
		 * The meta object literal for the '<em><b>Catalogue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__CATALOGUE = eINSTANCE.getComposant_Catalogue();

		/**
		 * The meta object literal for the '{@link catalogue.impl.ContrainteImpl <em>Contrainte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.ContrainteImpl
		 * @see catalogue.impl.CataloguePackageImpl#getContrainte()
		 * @generated
		 */
		EClass CONTRAINTE = eINSTANCE.getContrainte();

		/**
		 * The meta object literal for the '{@link catalogue.impl.EmpreinteImpl <em>Empreinte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.EmpreinteImpl
		 * @see catalogue.impl.CataloguePackageImpl#getEmpreinte()
		 * @generated
		 */
		EClass EMPREINTE = eINSTANCE.getEmpreinte();

		/**
		 * The meta object literal for the '<em><b>Longueur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPREINTE__LONGUEUR = eINSTANCE.getEmpreinte_Longueur();

		/**
		 * The meta object literal for the '<em><b>Largeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPREINTE__LARGEUR = eINSTANCE.getEmpreinte_Largeur();

		/**
		 * The meta object literal for the '<em><b>Taille Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPREINTE__TAILLE_PORT = eINSTANCE.getEmpreinte_TaillePort();

	}

} //CataloguePackage
