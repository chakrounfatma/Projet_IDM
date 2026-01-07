/**
 */
package netlist;

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
 * @see netlist.NetlistFactory
 * @model kind="package"
 * @generated
 */
public interface NetlistPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "netlist";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://netlist";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "netlist";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetlistPackage eINSTANCE = netlist.impl.NetlistPackageImpl.init();

	/**
	 * The meta object id for the '{@link netlist.impl.NetlistImpl <em>Netlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see netlist.impl.NetlistImpl
	 * @see netlist.impl.NetlistPackageImpl#getNetlist()
	 * @generated
	 */
	int NETLIST = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETLIST__ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Netlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETLIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Netlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETLIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link netlist.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see netlist.impl.ElementImpl
	 * @see netlist.impl.NetlistPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Netlist</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NETLIST = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link netlist.impl.ConnexionImpl <em>Connexion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see netlist.impl.ConnexionImpl
	 * @see netlist.impl.NetlistPackageImpl#getConnexion()
	 * @generated
	 */
	int CONNEXION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Netlist</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION__NETLIST = ELEMENT__NETLIST;

	/**
	 * The feature id for the '<em><b>Porta</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION__PORTA = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION__PORTB = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connexion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connexion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link netlist.impl.InstancecompImpl <em>Instancecomp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see netlist.impl.InstancecompImpl
	 * @see netlist.impl.NetlistPackageImpl#getInstancecomp()
	 * @generated
	 */
	int INSTANCECOMP = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCECOMP__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Netlist</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCECOMP__NETLIST = ELEMENT__NETLIST;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCECOMP__COMPOSANT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCECOMP__PORT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instancecomp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCECOMP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instancecomp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCECOMP_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link netlist.impl.CommentaireImpl <em>Commentaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see netlist.impl.CommentaireImpl
	 * @see netlist.impl.NetlistPackageImpl#getCommentaire()
	 * @generated
	 */
	int COMMENTAIRE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTAIRE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Netlist</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTAIRE__NETLIST = ELEMENT__NETLIST;

	/**
	 * The feature id for the '<em><b>Instancecomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTAIRE__INSTANCECOMP = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTAIRE__TEXTE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Commentaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTAIRE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Commentaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTAIRE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link netlist.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see netlist.impl.PortImpl
	 * @see netlist.impl.NetlistPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 4;

	/**
	 * The feature id for the '<em><b>Connexion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CONNEXION = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NOM = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link netlist.Netlist <em>Netlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Netlist</em>'.
	 * @see netlist.Netlist
	 * @generated
	 */
	EClass getNetlist();

	/**
	 * Returns the meta object for the containment reference list '{@link netlist.Netlist#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see netlist.Netlist#getElement()
	 * @see #getNetlist()
	 * @generated
	 */
	EReference getNetlist_Element();

	/**
	 * Returns the meta object for class '{@link netlist.Connexion <em>Connexion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connexion</em>'.
	 * @see netlist.Connexion
	 * @generated
	 */
	EClass getConnexion();

	/**
	 * Returns the meta object for the reference '{@link netlist.Connexion#getPorta <em>Porta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Porta</em>'.
	 * @see netlist.Connexion#getPorta()
	 * @see #getConnexion()
	 * @generated
	 */
	EReference getConnexion_Porta();

	/**
	 * Returns the meta object for the reference '{@link netlist.Connexion#getPortb <em>Portb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portb</em>'.
	 * @see netlist.Connexion#getPortb()
	 * @see #getConnexion()
	 * @generated
	 */
	EReference getConnexion_Portb();

	/**
	 * Returns the meta object for class '{@link netlist.Instancecomp <em>Instancecomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instancecomp</em>'.
	 * @see netlist.Instancecomp
	 * @generated
	 */
	EClass getInstancecomp();

	/**
	 * Returns the meta object for the reference '{@link netlist.Instancecomp#getComposant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composant</em>'.
	 * @see netlist.Instancecomp#getComposant()
	 * @see #getInstancecomp()
	 * @generated
	 */
	EReference getInstancecomp_Composant();

	/**
	 * Returns the meta object for the containment reference list '{@link netlist.Instancecomp#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see netlist.Instancecomp#getPort()
	 * @see #getInstancecomp()
	 * @generated
	 */
	EReference getInstancecomp_Port();

	/**
	 * Returns the meta object for class '{@link netlist.Commentaire <em>Commentaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commentaire</em>'.
	 * @see netlist.Commentaire
	 * @generated
	 */
	EClass getCommentaire();

	/**
	 * Returns the meta object for the reference '{@link netlist.Commentaire#getInstancecomp <em>Instancecomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instancecomp</em>'.
	 * @see netlist.Commentaire#getInstancecomp()
	 * @see #getCommentaire()
	 * @generated
	 */
	EReference getCommentaire_Instancecomp();

	/**
	 * Returns the meta object for the attribute '{@link netlist.Commentaire#getTexte <em>Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texte</em>'.
	 * @see netlist.Commentaire#getTexte()
	 * @see #getCommentaire()
	 * @generated
	 */
	EAttribute getCommentaire_Texte();

	/**
	 * Returns the meta object for class '{@link netlist.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see netlist.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link netlist.Port#getConnexion <em>Connexion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connexion</em>'.
	 * @see netlist.Port#getConnexion()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Connexion();

	/**
	 * Returns the meta object for the attribute '{@link netlist.Port#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see netlist.Port#getNom()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Nom();

	/**
	 * Returns the meta object for class '{@link netlist.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see netlist.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link netlist.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see netlist.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the container reference '{@link netlist.Element#getNetlist <em>Netlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Netlist</em>'.
	 * @see netlist.Element#getNetlist()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Netlist();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NetlistFactory getNetlistFactory();

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
		 * The meta object literal for the '{@link netlist.impl.NetlistImpl <em>Netlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see netlist.impl.NetlistImpl
		 * @see netlist.impl.NetlistPackageImpl#getNetlist()
		 * @generated
		 */
		EClass NETLIST = eINSTANCE.getNetlist();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETLIST__ELEMENT = eINSTANCE.getNetlist_Element();

		/**
		 * The meta object literal for the '{@link netlist.impl.ConnexionImpl <em>Connexion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see netlist.impl.ConnexionImpl
		 * @see netlist.impl.NetlistPackageImpl#getConnexion()
		 * @generated
		 */
		EClass CONNEXION = eINSTANCE.getConnexion();

		/**
		 * The meta object literal for the '<em><b>Porta</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNEXION__PORTA = eINSTANCE.getConnexion_Porta();

		/**
		 * The meta object literal for the '<em><b>Portb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNEXION__PORTB = eINSTANCE.getConnexion_Portb();

		/**
		 * The meta object literal for the '{@link netlist.impl.InstancecompImpl <em>Instancecomp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see netlist.impl.InstancecompImpl
		 * @see netlist.impl.NetlistPackageImpl#getInstancecomp()
		 * @generated
		 */
		EClass INSTANCECOMP = eINSTANCE.getInstancecomp();

		/**
		 * The meta object literal for the '<em><b>Composant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCECOMP__COMPOSANT = eINSTANCE.getInstancecomp_Composant();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCECOMP__PORT = eINSTANCE.getInstancecomp_Port();

		/**
		 * The meta object literal for the '{@link netlist.impl.CommentaireImpl <em>Commentaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see netlist.impl.CommentaireImpl
		 * @see netlist.impl.NetlistPackageImpl#getCommentaire()
		 * @generated
		 */
		EClass COMMENTAIRE = eINSTANCE.getCommentaire();

		/**
		 * The meta object literal for the '<em><b>Instancecomp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENTAIRE__INSTANCECOMP = eINSTANCE.getCommentaire_Instancecomp();

		/**
		 * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENTAIRE__TEXTE = eINSTANCE.getCommentaire_Texte();

		/**
		 * The meta object literal for the '{@link netlist.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see netlist.impl.PortImpl
		 * @see netlist.impl.NetlistPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Connexion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__CONNEXION = eINSTANCE.getPort_Connexion();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NOM = eINSTANCE.getPort_Nom();

		/**
		 * The meta object literal for the '{@link netlist.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see netlist.impl.ElementImpl
		 * @see netlist.impl.NetlistPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Netlist</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__NETLIST = eINSTANCE.getElement_Netlist();

	}

} //NetlistPackage
