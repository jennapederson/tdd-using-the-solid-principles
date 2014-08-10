package singleResponsibility.after;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HtmlPrinterTest {
	
	@Test
	public void testPrint() {
		Printer printer = new HtmlPrinter();
		assertThat(printer.printPage("A page to be printed in HTML"), is("<div class='page'>A page to be printed in HTML</div>"));
	}

}
