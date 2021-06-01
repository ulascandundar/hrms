package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employer"})
public class User {
	
	@Id
	@Column(name ="id")
	private int userId;
	
	@Column(name ="email")
	private String email;
	
	@Column(name ="password")
	private String password;

	@OneToOne(mappedBy = "user")
	private Employer employer;
}
