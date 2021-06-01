package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employer")
public class EmployerController {
	
	private EmployerService employerService;

	@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return employerService.getAll();
	}
	
	@GetMapping("/add")
	public Result add(Employer employer) {
		return this.employerService.add(employer);
		
	}
	
	@GetMapping("/getByEmployerName")
	public DataResult<Employer> getByEmployerName(String userName) {
		return this.employerService.getByEmployerName(userName);
		
	}
	
	@GetMapping("/getByEmployerNameAndUser_UserId")
	public DataResult<Employer> getByEmployerNameAndUser_UserId(String employerName, int userId) {
		return this.employerService.getByEmployerNameAndUser_UserId(employerName, userId);
		
	}
	
	@GetMapping("/getByEmployerNameOrUser_UserId")
	public DataResult<List<Employer>> getByEmployerNameOrUser_UserId(String userName, int userId){
		return this.employerService.getByEmployerNameOrUser_UserId(userName, userId);
	}
	
	@GetMapping("/getByUserIn")
	public DataResult<List<Employer>> getByUserIn(List<Integer> categories){
		return this.employerService.getByUserIn(categories);
	}
	
	@GetMapping("/getByEmployerNameContains")
	public DataResult<List<Employer>> getByEmployerNameContains(String employerName){
		return this.employerService.getByEmployerNameContains(employerName);
	}
	
	@GetMapping("/getByEmployerNameStartsWith")
	public DataResult<List<Employer>> getByEmployerNameStartsWith(String employerName){
		return this.employerService.getByEmployerNameStartsWith(employerName);
	}
	
	@GetMapping("/getByNameAndCategory")
	public DataResult<List<Employer>> getByNameAndCategory(String employerName, int userId){
		return this.employerService.getByNameAndUser(employerName, userId);
	}

}
