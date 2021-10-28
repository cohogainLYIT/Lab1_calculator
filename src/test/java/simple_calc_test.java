import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class simple_calc_test {

	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void test_add() {
		simple_calculator.add(3,6);
		equals(9);
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void test_subtract() {
		simple_calculator.add(9,6);
		equals(3);
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void test_multiply() {
		simple_calculator.add(3,6);
		equals(18);
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void test_divide() {
		simple_calculator.add(9,3);
		equals(3);
	}
	
	
	public void test_main() {
		simple_calculator.main(null);
		equals(10);
		
	}

}
