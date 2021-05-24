package kodlamaio.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="candidates")
public class Candidate {

	@Id
	@GeneratedValue
	@Column(name ="user_id")
	private int user_id;
	
	@Column(name ="first_name")
	private String first_name;
	
	@Column(name ="last_name")
	private String last_name;
	
	@Column(name ="identity_number")
	private int identity_number;
	
	@Column(name ="birth_date")
	private Date birth_date;
}
