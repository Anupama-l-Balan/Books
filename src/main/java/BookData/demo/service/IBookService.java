package BookData.demo.service;

import java.util.List;

import BookData.demo.model.Book;

public interface IBookService {

	public Book save(Book source);

	public List<Book> getBookByAuthor(String author);

	public List<Book> getBookByAuthorLinearSearch(String author);

	public List<Book> getBookByAuthorBinarySearch(String author);

}
