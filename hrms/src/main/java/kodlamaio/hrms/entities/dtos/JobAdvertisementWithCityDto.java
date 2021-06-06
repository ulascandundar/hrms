package kodlamaio.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class JobAdvertisementWithCityDto {

	private int id;
	private String jobDescription;
	private String cityName;
	
}
