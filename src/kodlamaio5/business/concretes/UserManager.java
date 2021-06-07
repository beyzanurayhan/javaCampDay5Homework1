package kodlamaio5.business.concretes;

import kodlamaio5.business.abstracts.ValidityService;

import java.util.List;

import kodlamaio5.business.abstracts.UserService;
import kodlamaio5.business.abstracts.VerificationService;
import kodlamaio5.dataAccess.abstracts.UserDao;
import kodlamaio5.entities.concretes.User;

public class UserManager implements UserService{
	
	UserDao userDao;
	ValidityService validityService;
	VerificationService verificationService;


	public UserManager(UserDao userDao, ValidityService validityService, VerificationService verificationService) {
		//super();
		this.userDao = userDao;
		this.validityService = validityService;
		this.verificationService = verificationService;
	}

	@Override
	public void register(User user) {
		if (validityService.checkFirstName(user.getFirstName()) && validityService.checkLastName(user.getLastName()) && 
				validityService.checkEmail(user.geteMail()) && validityService.checkPassword(user.getPassword()) && verificationService.send(user.geteMail())) {
			System.out.println(user.geteMail() + " mail adresine doðrulama e-postasý gönderildi. Lütfen onay veriniz.");
			System.out.println(user.getFirstName() + " " + user.getLastName() + " baþarýlý bir þekilde kayýt oldunuz.");
			System.out.println("*************************************************************************************");
		}
		
	}

	@Override
	public void login(List<User> users, String eMail, String password) {
		for (User user : users) {
			if (validityService.checkEmail(user.geteMail()) && validityService.checkPassword(user.getPassword())) {
				System.out.println(user.getFirstName() + " " + user.getLastName() + "baþarýlý bir þekilde giriþ yaptýnýz.");
				System.out.println("******************************************************************************");
			}
			else {
				System.out.println("Lütfen bilgilerinizi kontrol edip tekrar deneyin.");
				System.out.println("******************************************************************************");

			}
			
	}
		
	}


}
  

