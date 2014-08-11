package liskovSubstitution.before;

import org.junit.Test;

public class MigrationTest {

	@Test
	public void testAllDucksFlySouth() {
		Migration migration = new Migration();
		migration.flySouth(new MallardDuck(), new RubberDucky());
	}

}
