/**
 */
package netlist.tests;

import junit.textui.TestRunner;

import netlist.Commentaire;
import netlist.NetlistFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Commentaire</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommentaireTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CommentaireTest.class);
	}

	/**
	 * Constructs a new Commentaire test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentaireTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Commentaire test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Commentaire getFixture() {
		return (Commentaire)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NetlistFactory.eINSTANCE.createCommentaire());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CommentaireTest
