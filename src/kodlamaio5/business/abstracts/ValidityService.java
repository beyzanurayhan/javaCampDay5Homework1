package kodlamaio5.business.abstracts;

public interface ValidityService {
	
	boolean checkFirstName(String firstName);
	boolean checkLastName(String lastName);
	boolean checkEmail(String eMail);
	boolean checkPassword(String password);

}
