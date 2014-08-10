package singleResponsibility.after;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;

public abstract class PrinterTest {

	protected final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	protected Printer printer;
	private PrintStream oldOut;

	@Before
	public void before() {
		oldOut = System.out;
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void after() {
		System.setOut(oldOut);
	}

}
