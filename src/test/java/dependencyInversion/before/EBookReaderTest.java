package dependencyInversion.before;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class EBookReaderTest {

	@Test
	public void testReadPdfBook() {
		EBookReader reader = new EBookReader(new PDFBook());
		assertThat(reader.read(), is("Reading a PDF Book..."));
	}

}
