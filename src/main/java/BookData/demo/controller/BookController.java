package BookData.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import BookData.demo.model.Book;
import BookData.demo.serviceImpl.BookServiceImpl;

@RestController
@RequestMapping("api")
public class BookController {
	@Autowired
	private BookServiceImpl bookService;

	@PostMapping("/save-book")
	public Book saveBook(@RequestBody Book source) {
		return bookService.save(source);

	}

	@GetMapping("get-book-by-author")
	public List<Book> getBookByAuthor(@RequestParam String author) {
		return bookService.getBookByAuthor(author);
	}

	@GetMapping("get-book-by-author-linear-search")
	public List<Book> getBookByAuthorLinearSearch(@RequestParam String author) {
		return bookService.getBookByAuthorLinearSearch(author);
	}

	@GetMapping("get-book-by-author-binary-search")
	public List<Book> getBookByAuthorBinarySearch(@RequestParam String author) {
		return bookService.getBookByAuthorBinarySearch(author);
	}

}
