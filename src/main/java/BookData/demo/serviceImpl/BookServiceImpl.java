package BookData.demo.serviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BookData.demo.model.Book;
import BookData.demo.repo.IBookRepo;
import BookData.demo.service.IBookService;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	private IBookRepo bookRepo;

	@Override
	public Book save(Book source) {
		Book book = new Book();
		book.setAuthor(source.getAuthor());
		book.setBookName(source.getBookName());
		book.setPrice(source.getPrice());
		book.setId(source.getId());
		return bookRepo.save(book);
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
		List<Book> bookList = bookRepo.findByAuthor(author);
		return bookList;
	}

	@Override
	public List<Book> getBookByAuthorLinearSearch(String author) {
		List<Book> returnList = new ArrayList<>();
		Book bookArray[] = bookRepo.findAll().toArray(new Book[bookRepo.findAll().size()]);
		for (int i = 0; i < bookRepo.findAll().size(); i++) {
			if (author.equals(bookArray[i].getAuthor())) {
				returnList.add(bookArray[i]);

			} else {
				
				
				
				returnList.add(null);
			}

		}
		return returnList;
	}

	@Override
	public List<Book> getBookByAuthorBinarySearch(String author) {
		List<Book> bookList = bookRepo.findAll();
		Collections.sort(bookList, Comparator.comparing(Book::getAuthor));
		return bookList;
	}

}
