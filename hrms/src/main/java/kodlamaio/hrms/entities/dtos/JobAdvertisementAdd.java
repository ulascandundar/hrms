package kodlamaio.hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvertisementAdd {


	private int employerId;
	private int jobPositionId;
	private int cityId;
	private String jobDescription;
	private double minSalary;
	private double maxSalary;
	private int openPositionCount;
	private Date posted_date;
	private Date applicationDeadline;
	private boolean is_active;
	private int typeOfWorkingId;
	
}
