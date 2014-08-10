package openClosed.after;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeCalculatorTest {
	
	@Test
	public void testAreaOfCircle() {
		ShapeCalculator calculator = new ShapeCalculator();
		assertThat(calculator.calculateArea(new Circle(5)), is(78.53981633974483));
	}
	
	@Test
	public void testAreaOfRectangle() {
		ShapeCalculator calculator = new ShapeCalculator();
		assertThat(calculator.calculateArea(new Rectangle(5, 7)), is(35.0));
	}

	@Test
	public void testAreaOfTriangle() {
		ShapeCalculator calculator = new ShapeCalculator();
		assertThat(calculator.calculateArea(new Triangle(5, 7)), is(17.5));
	}
	
	@Test
	public void testAreaOfSomeNewThing() {
		ShapeCalculator calculator = new ShapeCalculator();
		assertThat(calculator.calculateArea(new Shape() {
			public double area() {
				return 10;
			}
		}), is(10.0));
	}

}
