package openClosed.after;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testTriangleArea() {
		assertThat(new Triangle(5, 7).area(), is(17.5));
	}

}
