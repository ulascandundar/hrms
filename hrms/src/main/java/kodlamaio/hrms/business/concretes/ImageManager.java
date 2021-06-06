package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.ImageService;
import kodlamaio.hrms.core.utilities.adapters.PhotoUploadHelper;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ImageDao;
import kodlamaio.hrms.entities.concretes.Image;


@Service
public class ImageManager implements ImageService{
	
	private PhotoUploadHelper photoUploadHelper;
	private ImageDao imageDao;
	
	
	@Autowired
	public ImageManager(PhotoUploadHelper photoUploadHelper, ImageDao imageDao) {
		super();
		this.photoUploadHelper = photoUploadHelper;
		this.imageDao = imageDao;
	}
	
	

	@Override
	public Result add(Image image) {
		if(this.imageDao.save(image) != null) {
			return new SuccessResult();
		}
		return new ErrorResult();
	}

	

	@Override
	public DataResult<Image> upload(MultipartFile image, int candidateId) {
		DataResult<Map<String, String>> result = this.photoUploadHelper.upload(image);

		if(result.isSuccess()) {

			Image imagee = new Image();
			imagee.setCandidate_id(candidateId);
			imagee.setImagePath(result.getData().get("url"));
			imagee.setImageTitle(result.getData().get("public_id"));
			Result addingResult = this.add(imagee);
			if (addingResult.isSuccess()) {
				return new SuccessDataResult<Image>(imagee);
			}
		}
		return new ErrorDataResult<Image>(null,"Dosya yüklenemedi");
	}

	@Override
	public DataResult<List<Image>> getByCandidateId(int candidateId) {
		var result =  this.imageDao.getByCandidateId(candidateId);
		if(result != null) {
			return new SuccessDataResult<List<Image>>(result);
		}
		return new ErrorDataResult<List<Image>>();
	}

	@Override
	public DataResult<Image> getById(int photoId) {
		// TODO Auto-generated method stub
		return null;
	}

}
