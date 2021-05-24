package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="activation_code_to_employers")
public class Activation_code_to_employer {

	@Id
	@GeneratedValue
	@Column(name ="id")
	private int id;
	
	@Column(name ="employer_id")
	private int employer_id;

	public Activation_code_to_employer(int id, int employer_id) {
		super();
		this.id = id;
		this.employer_id = employer_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployer_id() {
		return employer_id;
	}

	public void setEmployer_id(int employer_id) {
		this.employer_id = employer_id;
	}
}
