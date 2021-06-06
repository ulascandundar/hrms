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
@Table(name = "images")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Image {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne()
    @JoinColumn(name = "candidate_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Candidate candidate;
    
    @Column(name = "candidate_id")
    private int candidate_id;

    @Column(name = "image_title")
    private String imageTitle;

    @Column(name = "image")
    private String imagePath;
    

}
