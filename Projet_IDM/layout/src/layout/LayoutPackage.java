/**
 */
package layout;

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
 * @see layout.LayoutFactory
 * @model kind="package"
 * @generated
 */
public interface LayoutPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "layout";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://layout";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "layout";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LayoutPackage eINSTANCE = layout.impl.LayoutPackageImpl.init();

	/**
	 * The meta object id for the '{@link layout.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.LayoutImpl
	 * @see layout.impl.LayoutPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Board</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__BOARD = 0;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link layout.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.BoardImpl
	 * @see layout.impl.LayoutPackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 1;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__LAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Couche interne</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__COUCHE_INTERNE = 1;

	/**
	 * The feature id for the '<em><b>Couche externe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__COUCHE_EXTERNE = 2;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link layout.impl.CoucheImpl <em>Couche</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.CoucheImpl
	 * @see layout.impl.LayoutPackageImpl#getCouche()
	 * @generated
	 */
	int COUCHE = 3;

	/**
	 * The feature id for the '<em><b>Piste</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUCHE__PISTE = 0;

	/**
	 * The number of structural features of the '<em>Couche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUCHE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Couche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUCHE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link layout.impl.Couche_externeImpl <em>Couche externe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.Couche_externeImpl
	 * @see layout.impl.LayoutPackageImpl#getCouche_externe()
	 * @generated
	 */
	int COUCHE_EXTERNE = 2;

	/**
	 * The feature id for the '<em><b>Piste</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUCHE_EXTERNE__PISTE = COUCHE__PISTE;

	/**
	 * The feature id for the '<em><b>Instancecomp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUCHE_EXTERNE__INSTANCECOMP = COUCHE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Couche externe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUCHE_EXTERNE_FEATURE_COUNT = COUCHE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Couche externe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUCHE_EXTERNE_OPERATION_COUNT = COUCHE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link layout.impl.Couche_interneImpl <em>Couche interne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.Couche_interneImpl
	 * @see layout.impl.LayoutPackageImpl#getCouche_interne()
	 * @generated
	 */
	int COUCHE_INTERNE = 4;

	/**
	 * The feature id for the '<em><b>Piste</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUCHE_INTERNE__PISTE = COUCHE__PISTE;

	/**
	 * The number of structural features of the '<em>Couche interne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUCHE_INTERNE_FEATURE_COUNT = COUCHE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Couche interne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUCHE_INTERNE_OPERATION_COUNT = COUCHE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link layout.impl.PisteImpl <em>Piste</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.PisteImpl
	 * @see layout.impl.LayoutPackageImpl#getPiste()
	 * @generated
	 */
	int PISTE = 5;

	/**
	 * The feature id for the '<em><b>Couche</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PISTE__COUCHE = 0;

	/**
	 * The feature id for the '<em><b>Connexion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PISTE__CONNEXION = 1;

	/**
	 * The number of structural features of the '<em>Piste</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PISTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Piste</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PISTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link layout.impl.InstancecompImpl <em>Instancecomp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see layout.impl.InstancecompImpl
	 * @see layout.impl.LayoutPackageImpl#getInstancecomp()
	 * @generated
	 */
	int INSTANCECOMP = 6;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCECOMP__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCECOMP__Y = 1;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCECOMP__COMPOSANT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCECOMP__NAME = 3;

	/**
	 * The number of structural features of the '<em>Instancecomp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCECOMP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Instancecomp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCECOMP_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link layout.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see layout.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link layout.Layout#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Board</em>'.
	 * @see layout.Layout#getBoard()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Board();

	/**
	 * Returns the meta object for class '{@link layout.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see layout.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the reference '{@link layout.Board#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout</em>'.
	 * @see layout.Board#getLayout()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Layout();

	/**
	 * Returns the meta object for the containment reference list '{@link layout.Board#getCouche_interne <em>Couche interne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Couche interne</em>'.
	 * @see layout.Board#getCouche_interne()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Couche_interne();

	/**
	 * Returns the meta object for the containment reference list '{@link layout.Board#getCouche_externe <em>Couche externe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Couche externe</em>'.
	 * @see layout.Board#getCouche_externe()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Couche_externe();

	/**
	 * Returns the meta object for class '{@link layout.Couche_externe <em>Couche externe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Couche externe</em>'.
	 * @see layout.Couche_externe
	 * @generated
	 */
	EClass getCouche_externe();

	/**
	 * Returns the meta object for the containment reference list '{@link layout.Couche_externe#getInstancecomp <em>Instancecomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instancecomp</em>'.
	 * @see layout.Couche_externe#getInstancecomp()
	 * @see #getCouche_externe()
	 * @generated
	 */
	EReference getCouche_externe_Instancecomp();

	/**
	 * Returns the meta object for class '{@link layout.Couche <em>Couche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Couche</em>'.
	 * @see layout.Couche
	 * @generated
	 */
	EClass getCouche();

	/**
	 * Returns the meta object for the containment reference list '{@link layout.Couche#getPiste <em>Piste</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Piste</em>'.
	 * @see layout.Couche#getPiste()
	 * @see #getCouche()
	 * @generated
	 */
	EReference getCouche_Piste();

	/**
	 * Returns the meta object for class '{@link layout.Couche_interne <em>Couche interne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Couche interne</em>'.
	 * @see layout.Couche_interne
	 * @generated
	 */
	EClass getCouche_interne();

	/**
	 * Returns the meta object for class '{@link layout.Piste <em>Piste</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Piste</em>'.
	 * @see layout.Piste
	 * @generated
	 */
	EClass getPiste();

	/**
	 * Returns the meta object for the container reference '{@link layout.Piste#getCouche <em>Couche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Couche</em>'.
	 * @see layout.Piste#getCouche()
	 * @see #getPiste()
	 * @generated
	 */
	EReference getPiste_Couche();

	/**
	 * Returns the meta object for the reference '{@link layout.Piste#getConnexion <em>Connexion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connexion</em>'.
	 * @see layout.Piste#getConnexion()
	 * @see #getPiste()
	 * @generated
	 */
	EReference getPiste_Connexion();

	/**
	 * Returns the meta object for class '{@link layout.Instancecomp <em>Instancecomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instancecomp</em>'.
	 * @see layout.Instancecomp
	 * @generated
	 */
	EClass getInstancecomp();

	/**
	 * Returns the meta object for the attribute '{@link layout.Instancecomp#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see layout.Instancecomp#getX()
	 * @see #getInstancecomp()
	 * @generated
	 */
	EAttribute getInstancecomp_X();

	/**
	 * Returns the meta object for the attribute '{@link layout.Instancecomp#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see layout.Instancecomp#getY()
	 * @see #getInstancecomp()
	 * @generated
	 */
	EAttribute getInstancecomp_Y();

	/**
	 * Returns the meta object for the reference '{@link layout.Instancecomp#getComposant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composant</em>'.
	 * @see layout.Instancecomp#getComposant()
	 * @see #getInstancecomp()
	 * @generated
	 */
	EReference getInstancecomp_Composant();

	/**
	 * Returns the meta object for the attribute '{@link layout.Instancecomp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see layout.Instancecomp#getName()
	 * @see #getInstancecomp()
	 * @generated
	 */
	EAttribute getInstancecomp_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LayoutFactory getLayoutFactory();

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
		 * The meta object literal for the '{@link layout.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.LayoutImpl
		 * @see layout.impl.LayoutPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__BOARD = eINSTANCE.getLayout_Board();

		/**
		 * The meta object literal for the '{@link layout.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.BoardImpl
		 * @see layout.impl.LayoutPackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__LAYOUT = eINSTANCE.getBoard_Layout();

		/**
		 * The meta object literal for the '<em><b>Couche interne</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__COUCHE_INTERNE = eINSTANCE.getBoard_Couche_interne();

		/**
		 * The meta object literal for the '<em><b>Couche externe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__COUCHE_EXTERNE = eINSTANCE.getBoard_Couche_externe();

		/**
		 * The meta object literal for the '{@link layout.impl.Couche_externeImpl <em>Couche externe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.Couche_externeImpl
		 * @see layout.impl.LayoutPackageImpl#getCouche_externe()
		 * @generated
		 */
		EClass COUCHE_EXTERNE = eINSTANCE.getCouche_externe();

		/**
		 * The meta object literal for the '<em><b>Instancecomp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUCHE_EXTERNE__INSTANCECOMP = eINSTANCE.getCouche_externe_Instancecomp();

		/**
		 * The meta object literal for the '{@link layout.impl.CoucheImpl <em>Couche</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.CoucheImpl
		 * @see layout.impl.LayoutPackageImpl#getCouche()
		 * @generated
		 */
		EClass COUCHE = eINSTANCE.getCouche();

		/**
		 * The meta object literal for the '<em><b>Piste</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUCHE__PISTE = eINSTANCE.getCouche_Piste();

		/**
		 * The meta object literal for the '{@link layout.impl.Couche_interneImpl <em>Couche interne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.Couche_interneImpl
		 * @see layout.impl.LayoutPackageImpl#getCouche_interne()
		 * @generated
		 */
		EClass COUCHE_INTERNE = eINSTANCE.getCouche_interne();

		/**
		 * The meta object literal for the '{@link layout.impl.PisteImpl <em>Piste</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.PisteImpl
		 * @see layout.impl.LayoutPackageImpl#getPiste()
		 * @generated
		 */
		EClass PISTE = eINSTANCE.getPiste();

		/**
		 * The meta object literal for the '<em><b>Couche</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PISTE__COUCHE = eINSTANCE.getPiste_Couche();

		/**
		 * The meta object literal for the '<em><b>Connexion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PISTE__CONNEXION = eINSTANCE.getPiste_Connexion();

		/**
		 * The meta object literal for the '{@link layout.impl.InstancecompImpl <em>Instancecomp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see layout.impl.InstancecompImpl
		 * @see layout.impl.LayoutPackageImpl#getInstancecomp()
		 * @generated
		 */
		EClass INSTANCECOMP = eINSTANCE.getInstancecomp();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCECOMP__X = eINSTANCE.getInstancecomp_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCECOMP__Y = eINSTANCE.getInstancecomp_Y();

		/**
		 * The meta object literal for the '<em><b>Composant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCECOMP__COMPOSANT = eINSTANCE.getInstancecomp_Composant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCECOMP__NAME = eINSTANCE.getInstancecomp_Name();

	}

} //LayoutPackage
