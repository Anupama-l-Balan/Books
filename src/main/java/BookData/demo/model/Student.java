package BookData.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_student_data")
public class Student {

	@Id
	private int id;

	private String Name;

	private int age;

}
