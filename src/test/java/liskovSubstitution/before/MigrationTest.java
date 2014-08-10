package liskovSubstitution.before;

import org.junit.Test;

public class MigrationTest {

	@Test
	public void testAllDucksFlySouth() {
		Migration migration = new Migration();
		Duck mallardDuck = new MallardDuck();
		Duck rubberDucky = new RubberDucky();
		migration.flySouth(mallardDuck, rubberDucky);
	}

}
