package liskovSubstitution.after;

import org.junit.Test;

public class MigrationTest {

	@Test
	public void testFlySouth() {
		Migration migration = new Migration();
//		migration.flySouth(new MallardDuck(), new RubberDucky());
		migration.flySouth(new MallardDuck());
	}
}
