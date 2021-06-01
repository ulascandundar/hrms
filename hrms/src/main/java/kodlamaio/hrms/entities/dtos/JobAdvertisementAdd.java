package kodlamaio.hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvertisementAdd {

	private int id;
	private int employer_id;
	private int job_title_id;
	private int city_id;
	private String job_description;
	private double min_salary;
	private double max_salary;
	private int number_of_open_positions;
	private Date posted_date;
	private Date application_deadline;
	private boolean is_active;
	
}
