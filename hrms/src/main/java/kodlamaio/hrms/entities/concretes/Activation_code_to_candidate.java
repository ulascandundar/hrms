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
@Table(name="activation_code_to_candidates")
public class Activation_code_to_candidate {

	
	@Id
	@GeneratedValue
	@Column(name ="id")
	private int id;
	
	@Column(name ="cadidate_id")
	private int cadidate_id;


}
