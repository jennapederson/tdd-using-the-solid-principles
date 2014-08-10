package single_responsibility.after;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class BookTest {

	private Book book;

	@Before
	public void before() {
		ArrayList<String> pages = new ArrayList<String>();
		pages.add("Page 1 content");
		pages.add("Page 2 content");
		pages.add("Page 3 content");
		pages.add("Page 4 content");
		book = new Book("Where the Red Fern Grows", "Wilson Rawls", pages);	
	}
	
	@Test
	public void testGetTitle() {
		assertThat(book.getTitle(), is("Where the Red Fern Grows"));
	}
	
	@Test
	public void testGetAuthor() {
		assertThat(book.getAuthor(), is("Wilson Rawls"));
	}
	
	@Test
	public void testGetCurrentPageDoesNotGoPastLastPage() {
		book.turnPage(); // now on page 2
		book.turnPage(); // now on page 3
		book.turnPage(); // now on page 4
		book.turnPage(); // still on page 4
		assertThat(book.getCurrentPage(), is(4));
	}

}
