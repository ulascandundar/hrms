package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerService {

	DataResult<List<Employer>> getAll();
	Result add(Employer employer);
	
	 DataResult<List<Employer>> getAllSorted();
     DataResult<List<Employer>> getAll(int pageNo, int pageSize);
	
	DataResult<Employer> getByEmployerName(String userName);
	  
	DataResult<Employer> getByEmployerNameAndUser_UserId(String employerName, int userId);
	  
	DataResult<List<Employer>> getByEmployerNameOrUser_UserId(String userName, int userId);
	
	DataResult<List<Employer>> getByUserIn(List<Integer> categories);
	  
	DataResult<List<Employer>> getByEmployerNameContains(String employerName);
	  
	DataResult<List<Employer>> getByEmployerNameStartsWith(String employerName);
	
	DataResult<List<Employer>> getByNameAndUser(String employerName, int userId);
}
