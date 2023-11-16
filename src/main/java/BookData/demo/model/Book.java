package BookData.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_book_data")
public class Book {

	@Id
	private int id;

	private String bookName;

	private String author;

	private int price;

}
