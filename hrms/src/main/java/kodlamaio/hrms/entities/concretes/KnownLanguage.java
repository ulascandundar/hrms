package kodlamaio.hrms.entities.concretes;

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
@Table(name = "known_languages")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class KnownLanguage {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
	
	@ManyToOne()
    @JoinColumn(name = "candidate_id", referencedColumnName = "id")
    private Candidate candidate;
	
	 	@ManyToOne()
	    @JoinColumn(name = "language_level_id")
	    private LanguageLevel languageLevel;

	    @Column(name = "language_name")
	    private String languageName;
}
