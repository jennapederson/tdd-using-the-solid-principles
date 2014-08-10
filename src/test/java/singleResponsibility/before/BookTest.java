package single_responsibility.before;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Test;

public class BookTest {

	@Test
	public void testBook() {
		ArrayList<String> pages = new ArrayList<String>();
		pages.add("Page 1 content");
		pages.add("Page 2 content");
		pages.add("Page 3 content");
		pages.add("Page 4 content");
		Book book = new Book("Where the Red Fern Grows", "Wilson Rawls", pages);
		
		assertThat(book.getTitle(), is("Where the Red Fern Grows"));
		assertThat(book.getAuthor(), is("Wilson Rawls"));
		assertThat(book.getCurrentPage(), is(1));
		book.turnPage();
		assertThat(book.getCurrentPage(), is(2));
		book.turnPage();
		assertThat(book.getCurrentPage(), is(3));
		book.turnPage();
		assertThat(book.getCurrentPage(), is(4));
		book.turnPage();
		assertThat(book.getCurrentPage(), is(4));
	}

}
