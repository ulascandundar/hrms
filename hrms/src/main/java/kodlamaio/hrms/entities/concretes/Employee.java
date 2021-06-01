package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employees")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name ="user_id")
	private int user_id;
	
	@Column(name ="first_name")
	private String first_name;
	
	@Column(name ="last_name")
	private String last_name;
	

	
}
