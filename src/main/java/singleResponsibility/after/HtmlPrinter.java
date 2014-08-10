package singleResponsibility.after;

public class HtmlPrinter implements Printer {

	public String printPage(String page) {
		return "<div class='page'>" + page + "</div>";
	}

}
