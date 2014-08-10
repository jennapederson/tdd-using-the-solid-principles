package dependencyInversion.before;

public class EBookReader {

	private PDFBook book;
	
	public EBookReader(PDFBook pdfBook) {
		this.book = pdfBook;
	}

	public String read() {
		return book.read();
	}
	
}
