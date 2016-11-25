package com.lakala.work.MockDemo;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

public class BookDALTest{

	private static BookDAL mockedBookDAL;
	private static Book book1;
	private static Book book2;

	@BeforeClass
	public static void setUp() throws Exception {
		
		mockedBookDAL = Mockito.mock(BookDAL.class);

		book1 = new Book("8131721019", "Compilers Principles", Arrays.asList(
				"D. Jeffrey Ulman", "Ravi Sethi", "Alfred V. Aho",
				"Monica S. Lam"), "Pearson Education Singapore Pte Ltd", 2008,
				1009, "BOOK_IMAGE");

		book2 = new Book("9788183331630", "Let Us C 13th Edition",
				Arrays.asList("Yashavant Kanetkar"), "BPB PUBLICATIONS", 2012,
				675, "BOOK_IMAGE");

		Mockito.when(mockedBookDAL.getAllBooks()).thenReturn(Arrays.asList(book1, book2));
		Mockito.when(mockedBookDAL.getBook("8131721019")).thenReturn(book1);
		Mockito.when(mockedBookDAL.addBook(book1)).thenReturn(book1.getIsbn());
		Mockito.when(mockedBookDAL.updateBook(book1)).thenReturn(book1.getIsbn());
	}

	@Test
	public void testGetAllBooks() throws Exception {
		List<Book> allBooks = mockedBookDAL.getAllBooks();
		Assert.assertEquals(2, allBooks.size());
		Book myBook = allBooks.get(0);
		Assert.assertEquals("8131721019", myBook.getIsbn());
		Assert.assertEquals("Compilers Principles", myBook.getTitle());
		Assert.assertEquals(4, myBook.getAuthors().size());
		Assert.assertEquals((Integer)2008, myBook.getYearOfPublication());
		Assert.assertEquals((Integer) 1009, myBook.getNumberOfPages());
		Assert.assertEquals("Pearson Education Singapore Pte Ltd", myBook.getPublication());
		Assert.assertEquals("BOOK_IMAGE", myBook.getImage());
	}

	@Test
	public void testGetBook() throws Exception {
		Book book = mockedBookDAL.getBook("8131721019");
		Assert.assertEquals("Compilers Principles", book.getTitle());
	}

	@Test
	public void testAddBook() throws Exception {
		String id = mockedBookDAL.addBook(book1);
		System.out.println(id);
	}

	@Test
	public void testUpdateBook() throws Exception {
		String id = mockedBookDAL.updateBook(book1);
		System.out.println(id);
	}

}
