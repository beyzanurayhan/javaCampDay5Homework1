package kodlamaio5;

import kodlamaio5.business.abstracts.UserService;
import kodlamaio5.business.concretes.UserManager;
import kodlamaio5.business.concretes.ValidityManager;
import kodlamaio5.business.concretes.VerificationManager;
import kodlamaio5.dataAccess.abstracts.UserDao;
import kodlamaio5.dataAccess.concretes.HibernateUserDao;
import kodlamaio5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserDao userDao = new HibernateUserDao();
		
		User user1 = new User(1,"Beyza Nur", "Ayhan", "byzanurayhan@gmail.com", "123456");
		User user2 = new User(1,"Taha", "Ayhan", ".taha13@gmail.com", "6789552");
		User user3 = new User(1,"Ömer", "Ayhan", "omer_29@gmail.com", "789");
		
        UserService userService = new UserManager(new HibernateUserDao(), new ValidityManager(), new VerificationManager(userDao));
        userService.register(user1);
        userService.register(user2);
        userService.register(user3);
        
        userService.login(userDao.getAll(), "byzanuayhan@gmail.com", "123456");
        userService.login(userDao.getAll(), ".taha13@gmail.com", "6789552");
        

	}

}
