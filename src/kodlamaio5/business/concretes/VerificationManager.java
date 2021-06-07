package kodlamaio5.business.concretes;

import kodlamaio5.business.abstracts.VerificationService;
import kodlamaio5.dataAccess.abstracts.UserDao;

public class VerificationManager implements VerificationService{
	
	UserDao userDao;

	public VerificationManager(UserDao userDao) {
		//super();
		this.userDao = userDao;
	}

	@Override
	public boolean send(String eMail) {
		
		return true;
	}



}
