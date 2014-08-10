package singleResponsibility.after;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PlainTextPrinterTest {
	
	@Test
	public void testPrint() {
		Printer printer = new PlainTextPrinter();
		assertThat(printer.printPage("A page to be printed in plain text"), is("A page to be printed in plain text"));
	}

}
