/**
 */
package netlist.tests;

import junit.textui.TestRunner;

import netlist.Instancecomp;
import netlist.NetlistFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Instancecomp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstancecompTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InstancecompTest.class);
	}

	/**
	 * Constructs a new Instancecomp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancecompTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Instancecomp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Instancecomp getFixture() {
		return (Instancecomp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NetlistFactory.eINSTANCE.createInstancecomp());
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

} //InstancecompTest
