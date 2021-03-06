package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementAdd;
import kodlamaio.hrms.entities.dtos.JobAdvertisementDto;
import kodlamaio.hrms.entities.dtos.JobAdvertisementWithCityDto;
	
public interface JobAdvertisementService {

	Result add(JobAdvertisementAdd jobAdvertisementAdd);
	Result delete(int id);
	
	DataResult<JobAdvertisement> findById(int id);
	DataResult<List<JobAdvertisementDto>> findByIsActive();
	DataResult<List<JobAdvertisementDto>> findByIsActiveAndApplicationDeadline();
	DataResult<List<JobAdvertisementDto>> findByIsActiveAndCompanyName(String companyName);
	DataResult<List<JobAdvertisementWithCityDto>> JobAdvertisementWithCityDto();
	DataResult<List<JobAdvertisement>> getAll();
}
