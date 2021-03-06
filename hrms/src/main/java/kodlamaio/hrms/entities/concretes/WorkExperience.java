package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "work_experiences")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class WorkExperience {

	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private int id;

	    @ManyToOne()
	    @JoinColumn(name = "position_id", referencedColumnName = "id")
	    private JobPosition jobPosition;

	    @ManyToOne()
	    @JoinColumn(name = "candidate_id", referencedColumnName = "id")
	    private Candidate candidate;

	    @Column(name = "workplace_name")
	    private String workplaceName;

	    @Column(name = "starting_date")
	    private Date startingDate;

	    @Column(name = "quit_date")
	    private Date quitDate;
}
