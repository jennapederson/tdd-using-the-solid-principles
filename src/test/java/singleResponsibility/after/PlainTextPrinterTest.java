package single_responsibility.after;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PlainTextPrinterTest extends PrinterTest {
	
	@Test
	public void testPrint() {
		printer = new PlainTextPrinter();
		printer.printPage("A page to be printed in plain text");
		assertThat(outContent.toString(), is("A page to be printed in plain text\n"));
	}

}
