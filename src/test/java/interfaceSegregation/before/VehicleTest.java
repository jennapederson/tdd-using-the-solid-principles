package interfaceSegregation.before;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTest {

	@Test
	public void testPorscheCanChangeGears() {
		Vehicle porsche = new Porsche();
		porsche.changeGear(4);
		assertThat(porsche.getGear(), is(4));
	}

	@Test
	public void testOldBeaterCanChangeGears() {
		Vehicle oldBeater = new OldBeaterAutomaticTransmission();
		oldBeater.changeGear(4);
		assertThat(oldBeater.getGear(), is(4));
	}
}
