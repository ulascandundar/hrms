package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementAdd;
import kodlamaio.hrms.entities.dtos.JobAdvertisementDto;
import kodlamaio.hrms.entities.dtos.JobAdvertisementWithCityDto;

@RestController
@RequestMapping("/api/jobAdvertisements")
@CrossOrigin
public class JobAdvertisementsController  {

	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@GetMapping("/getByIsActive")
	public DataResult<List<JobAdvertisementDto>> findByIsActive(){
		return this.jobAdvertisementService.findByIsActive();
	}
	
	@GetMapping("/getByApplicationDeadline")
	public DataResult<List<JobAdvertisementDto>> findByIsActiveAndApplicationDeadline(){
		return this.jobAdvertisementService.findByIsActiveAndApplicationDeadline();
	}
	
	@GetMapping("/getByCompanyName")
	public DataResult<List<JobAdvertisementDto>> findByIsActiveAndCompanyName(@RequestParam String companyName){
		return this.jobAdvertisementService.findByIsActiveAndCompanyName(companyName);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisementAdd jobAdvertisementAdd) {
		return this.jobAdvertisementService.add(jobAdvertisementAdd);
	}
	
	@DeleteMapping("/delete")
	public Result delete(@RequestParam int id) {
		return this.jobAdvertisementService.delete(id);
	}
	
	@GetMapping("/JobAdvertisementWithCityDto")
	public DataResult<List<JobAdvertisementWithCityDto>> JobAdvertisementWithCityDto(){
		return this.jobAdvertisementService.JobAdvertisementWithCityDto();
	}
}
