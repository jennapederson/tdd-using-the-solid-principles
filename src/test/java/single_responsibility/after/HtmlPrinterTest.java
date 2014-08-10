package single_responsibility.after;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HtmlPrinterTest extends PrinterTest {
	
	@Test
	public void testPrint() {
		printer = new HtmlPrinter();
		printer.printPage("A page to be printed in HTML");
		assertThat(outContent.toString(), is("<div class='page'>A page to be printed in HTML</div>\n"));
	}

}
