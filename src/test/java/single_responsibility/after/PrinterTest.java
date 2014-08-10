package single_responsibility.after;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;

public abstract class PrinterTest {

	protected final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	protected Printer printer;

	@Before
	public void before() {
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void after() {
		System.setOut(null);
	}

}
