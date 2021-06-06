package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employer","candidate"})
public class User {
	
	@Id
	@Column(name ="id")
	private int userId;
	
	@Column(name ="email")
	@Email
	@NotBlank
	@NotNull
	private String email;
	
	@Column(name ="password")
	@NotBlank
	@NotNull
	private String password;

	@OneToOne(mappedBy = "user")
	private Employer employer;
	
	@OneToOne(mappedBy = "user")
	private Candidate candidate;
}
