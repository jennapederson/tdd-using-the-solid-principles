package singleResponsibility.after;

public class PlainTextPrinter implements Printer {

	public void printPage(String page) {
		System.out.println(page);
	}

}
