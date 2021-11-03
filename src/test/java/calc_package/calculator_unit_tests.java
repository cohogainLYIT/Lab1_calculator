/**
 * 
 */
package calc_package;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author ciara
 *
 */
public class calculator_unit_tests {

	/**
	 * Test method for {@link simple_calculator#add(int, int)}.
	 */
	@Test
	public void testAdd() {
		assertEquals(9,simple_calc_lab1.add(3,6));
	}


	/**
	 * Test method for {@link simple_calculator#subtract(int, int)}.
	 */
	@Test
	public void testSubtract() {
		assertEquals(4,simple_calc_lab1.subtract(10,6));
	}

	/**
	 * Test method for {@link simple_calculator#multiply(int, int)}.
	 */
	@Test
	public void testMultiply() {
		assertEquals(18,simple_calc_lab1.multiply(3,6));
	}

	/**
	 * Test method for {@link simple_calculator#divide(int, int)}.
	 */
	@Test
	public void testDivide() {
		assertEquals(8,simple_calc_lab1.divide(12,6));
	}

	/**
	 * Test method for {@link simple_calculator#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		equals("Testing");
	}


}
