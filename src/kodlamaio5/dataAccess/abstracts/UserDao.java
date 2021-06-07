package kodlamaio5.dataAccess.abstracts;

import java.util.List;

import kodlamaio5.entities.concretes.User;

public interface UserDao {
	
	void register(User user);
	void login(User user);
	void update(User user);
	void delete(User user);
	
	User get(int id);
	User geteMail(String eMail);
	User geteMailandPassword(String eMail, String password);
	
	List<User> getAll();

	
}


