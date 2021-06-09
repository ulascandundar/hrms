package kodlamaio.hrms.entities.concretes;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="candidates")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","images"})
public class Candidate {

	@Id
	@GeneratedValue
	@Column(name ="id")
	private int id;
	
	//@Id
	//@GeneratedValue
	//@Column(name ="user_id")
	//private int user_id;
	
	@Column(name ="first_name")
	private String first_name;
	
	@Column(name ="last_name")
	private String last_name;
	
	@Column(name ="identity_number")
	private int identity_number;
	
	@Column(name ="birth_date")
	private Date birth_date;
	
	@JsonIgnore
	@OneToOne()
	@JoinColumn(name = "user_id",referencedColumnName = "id")
	private User user;
	
	@Column(name = "nationality_id")
    private long nationalityId;

    @Column(name = "linkedin_account")
    private String linkedInAccount;

    @Column(name = "github_account")
    private String githubAccount;
    
    @JsonIgnore
    @OneToMany(targetEntity = KnownLanguage.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "candidate")
    private List<KnownLanguage> languages;
    
    @JsonIgnore
    @OneToMany(mappedBy = "candidate",targetEntity = AttendedSchool.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttendedSchool> attendedSchools;
    
    @JsonIgnore
    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Image> images;
    
    @JsonIgnore
    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<WorkExperience> workExperiences;
    
    @JsonIgnore
    @ManyToOne(targetEntity = JobPosition.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "job_position_id", referencedColumnName = "id")
    private JobPosition jobPosition;

}
