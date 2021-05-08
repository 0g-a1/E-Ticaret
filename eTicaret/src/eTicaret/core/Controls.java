package eTicaret.core;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaret.entities.concretes.User;

public class Controls {

	public static boolean checkPassword(String password) {
		if(password.length()<6) {
			System.out.println("Parola en az 6 karakterden oluþmalýdýr.");
			return false;
		}else {
			return true;
		}
	}
	
	public static boolean checkEmail(String email) {
	
		String regex = "^[\\w!#$%&'+/=?`{|}~^-]+(?:\\.[\\w!#$%&'+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
	
		if(matcher.matches()) {
			
			return true;
		}else {
			System.out.println("Email yazý formatý uygun deðil.");
			return false;
		}
	}
	
	
	
	 
	public static boolean checkEmailExists(List<User> users, String email) {
		for(User user:users) {
			if(user.getEmail() == email) {
				System.out.println("Bu email ile kayýt oluþturulmuþ.");
				return false;
			}
		}
		return true;
	}
	
	
	
	public static boolean checkNameSurname(String name, String surname) {
		if(name.length() < 2 || surname.length() <= 2) {
			System.out.println("Ýsim ve Soyisim en az 2 karakterden oluþmalýdýr.");
			return false;
		}else {
			return true;
		}
	}
	
	
	public static boolean checkUserPassword(List<User> users, String password) {
		for(User user:users) {
			if(user.getPassword() == password) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
