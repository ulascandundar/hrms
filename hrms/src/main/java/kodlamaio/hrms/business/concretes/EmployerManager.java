package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		 return new SuccessDataResult<List<Employer>>(employerDao.findAll(),"Başarıyla listelendi");
	}

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("Başarıyla eklendi");
	}

	@Override
	public DataResult<Employer> getByEmployerName(String userName) {
		return new SuccessDataResult<Employer>(employerDao.getByEmployerName(userName),"Başarıyla getirildi");
		
	}

	@Override
	public DataResult<Employer> getByEmployerNameAndUser_UserId(String employerName, int userId) {
		return new SuccessDataResult<Employer>(employerDao.getByEmployerNameAndUser_UserId(employerName, userId),"Başarıyla getirildi");
	}

	@Override
	public DataResult<List<Employer>> getByEmployerNameOrUser_UserId(String userName, int userId) {
		return new SuccessDataResult<List<Employer>>(employerDao.getByEmployerNameOrUser_UserId(userName, userId),"Başarıyla getirildi");
	}

	@Override
	public DataResult<List<Employer>> getByUserIn(List<Integer> categories) {
		return new SuccessDataResult<List<Employer>>(employerDao.getByUserIn(categories),"Başarıyla getirildi");
	}

	@Override
	public DataResult<List<Employer>> getByEmployerNameContains(String employerName) {
		return new SuccessDataResult<List<Employer>>(employerDao.getByEmployerNameContains(employerName),"Başarıyla getirildi");
	}

	@Override
	public DataResult<List<Employer>> getByEmployerNameStartsWith(String employerName) {
		return new SuccessDataResult<List<Employer>>(employerDao.getByEmployerNameStartsWith(employerName),"Başarıyla getirildi");
	}

	@Override
	public DataResult<List<Employer>> getByNameAndUser(String employerName, int userId) {
		return new SuccessDataResult<List<Employer>>(employerDao.getByNameAndUser(employerName, userId),"Başarıyla getirildi");
	}

	@Override
	public DataResult<List<Employer>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"employerName");
		return new SuccessDataResult<List<Employer>>
		(this.employerDao.findAll(sort),"Başarılı");
	}

	@Override
	public DataResult<List<Employer>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		return new SuccessDataResult<List<Employer>>
		(this.employerDao.findAll(pageable).getContent(),"Başarılı");
	}

}
