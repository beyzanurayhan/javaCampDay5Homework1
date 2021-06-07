package kodlamaio5.business.abstracts;

import java.util.List;

import kodlamaio5.entities.concretes.User;

public interface UserService {
	
	void register(User user);
	void login(List<User> users, String eMail, String password);

	
	
}

