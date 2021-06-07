package kodlamaio5.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import kodlamaio5.business.abstracts.ValidityService;

public class ValidityManager implements ValidityService {
	
	//Regex konusuna þuradan baktým.
	//https://mkyong.com/regular-expressions/how-to-validate-email-address-with-regular-expression/
	
	 private static final String EMAIL_PATTERN =
	            "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
	            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	 
	 private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

	@Override
	public boolean checkFirstName(String firstName) {
		if (firstName.length() < 2) {
			System.out.println("Ýsim en az 2 karakterden oluþmalýdýr.");
			return false;
		}
		else {
			return true;
		}
		
	}

	@Override
	public boolean checkLastName(String lastName) {
		if (lastName.length() < 2) {
			System.out.println("Soyisim en az 2 karakterden oluþmalýdýr.");
			return false;
		}
		else {
			return true;
		}
	
	}

	@Override
	public boolean checkEmail(String eMail) {
		Matcher matcher = pattern.matcher(eMail);
        if (!matcher.matches()) {
            System.out.println("Geçersiz e-mail!");
            return false;
        }
        else {
        	 return matcher.matches();
		}
       
	}

	@Override
	public boolean checkPassword(String password) {
		if (password.length() < 6) {
			System.out.println("Parola en az 6 karakterden oluþmalýdýr.");
			return false;
		}
		else {
			return true;
		}
		
	}

}
