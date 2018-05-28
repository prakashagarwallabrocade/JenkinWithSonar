package math.operation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticOperationsTest {

	@Test
	public void testSubstract() {

		ArithmeticOperations operations = new ArithmeticOperations();
		
		Integer actual = operations.substract(10, 6);
		Integer expected = 4;
		assertEquals(expected, actual);

	}

	@Test
	public void testAdd() {

		ArithmeticOperations operations = new ArithmeticOperations();
		Integer actual = operations.add(2, 6);
		Integer expected = 8;
		assertEquals(expected, actual);

	}

}
