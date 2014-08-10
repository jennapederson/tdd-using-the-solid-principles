package dependencyInversion.after;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class EBookReaderTest {

	@Test
	public void testReadPdfBook() {
		EBookReader reader = new EBookReader(new PDFBook());
		assertThat(reader.read(), is("Reading a PDF Book..."));
	}
	
	@Test
	public void testReadMobiBook() {
		EBookReader reader = new EBookReader(new MobiBook());
		assertThat(reader.read(), is("Reading a Mobi Book..."));
	}

}
