import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class simple_calc_test {

	@Test
	public void test() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		simple_calculator.main(null);
		
		assertEquals("Simple calculator" + System.getProperty("line.separator"), outContent.toString());
	}

}
