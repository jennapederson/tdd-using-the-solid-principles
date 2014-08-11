package openClosed.after;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ShapeCalculatorTest {
	
	@Mock
	Shape shape;
	
	@Before
	public void before() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testAreaOfSomeMock() {
		ShapeCalculator calculator = new ShapeCalculator();
		when(shape.area()).thenReturn(10.0);
		assertThat(calculator.calculateArea(shape), is(10.0));
		verify(shape).area();
	}
	
	@Test
	public void testAreaOfSomeDerivedShape() {
		ShapeCalculator calculator = new ShapeCalculator();
		assertThat(calculator.calculateArea(new Shape() {
			public double area() {
				return 10;
			}
		}), is(10.0));
	}

}
