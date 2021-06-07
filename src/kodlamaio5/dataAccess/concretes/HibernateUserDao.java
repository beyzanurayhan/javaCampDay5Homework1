package kodlamaio5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaio5.dataAccess.abstracts.UserDao;
import kodlamaio5.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	List<User> users = new ArrayList<User>();
	
	@Override
	public void register(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " kaydedildi.");
		
	}
	

	@Override
	public void login(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " giriþ yapýldý.");

		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " güncellendi.");

		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " silindi.");

	}

	@Override
	public User get(int id) {
		
			for(User user : users) {
				if (user.getId() == id) {
					return user;
				}
			}
		
		return null;
	}

	@Override
	public User geteMail(String eMail) {
		
		for(User user : users) {
			if (user.geteMail() == eMail) {
				return user;
			}
		}
		
		return null;
	}

	@Override
	public User geteMailandPassword(String eMail, String password) {
		
		for(User user : users) {
			if (user.geteMail() == eMail && user.getPassword() == password) {
				return user;
			}
		}
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}




}

