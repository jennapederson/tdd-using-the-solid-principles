package openClosed.after;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testCircleArea() {
		assertThat(new Circle(5).area(), is(78.53981633974483));
	}

}
