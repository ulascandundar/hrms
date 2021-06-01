package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

	Employer getByEmployerName(String userName);
	  
	Employer getByEmployerNameAndUser_UserId(String employerName, int userId);
	  
	List<Employer> getByEmployerNameOrUser_UserId(String userName, int userId);
	
	List<Employer> getByUserIn(List<Integer> categories);
	  
	List<Employer> getByEmployerNameContains(String employerName);
	  
	List<Employer> getByEmployerNameStartsWith(String employerName);
	
	@Query("From Employer where employerName=:employerName and user.id=:userId")
	  List<Employer> getByNameAndUser(String employerName, int userId);
}
