package openClosed.after;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testRectangleArea() {
		assertThat(new Rectangle(5, 7).area(), is(35.0));
	}

}
