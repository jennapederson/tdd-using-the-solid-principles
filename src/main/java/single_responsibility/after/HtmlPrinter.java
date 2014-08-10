package single_responsibility.after;

public class HtmlPrinter implements Printer {

	public void printPage(String page) {
		System.out.println("<div class='page'>" + page + "</div>");
	}

}
