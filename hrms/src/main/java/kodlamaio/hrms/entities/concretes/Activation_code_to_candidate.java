package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="activation_code_to_candidates")
public class Activation_code_to_candidate {

	
	@Id
	@GeneratedValue
	@Column(name ="id")
	private int id;
	
	@Column(name ="cadidate_id")
	private int cadidate_id;

	public Activation_code_to_candidate(int id, int cadidate_id) {
		super();
		this.id = id;
		this.cadidate_id = cadidate_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCadidate_id() {
		return cadidate_id;
	}

	public void setCadidate_id(int cadidate_id) {
		this.cadidate_id = cadidate_id;
	}
}
