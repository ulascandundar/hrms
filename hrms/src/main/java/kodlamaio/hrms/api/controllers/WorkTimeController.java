package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.WorkTimeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.WorkTime;

@RestController
@RequestMapping("/api/worktime")
@CrossOrigin
public class WorkTimeController {

	private WorkTimeService workTimeService;

	@Autowired
	public WorkTimeController(WorkTimeService workTimeService) {
		super();
		this.workTimeService = workTimeService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<WorkTime>> getAll(){
		return workTimeService.getAll();
	}
}
//deneme