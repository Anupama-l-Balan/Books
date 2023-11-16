package BookData.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import BookData.demo.model.Book;

@Repository
public interface IBookRepo extends JpaRepository<Book, Integer> {
	List<Book> findByAuthor(String author);
}
