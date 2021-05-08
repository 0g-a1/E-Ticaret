package eTicaret.core.mail;

import java.util.Random;

import eTicaret.entities.concretes.User;

public class MailManager implements MailService{

	private int checkCode;
	
	
	
	@Override
	public int createCode() {
		Random randomCode = new Random();
		checkCode = randomCode.nextInt(1234567890);
		
		return checkCode;
	}

	@Override
	public void sendMail(User user) {
		System.out.println("Say�n " + user.getFirstName() + "\n" + "Mail adresinize do�rulama kodu g�nderildi.");
		System.out.println(checkCode);
		
	}

	@Override
	public boolean certifyCode(int code) {

		if(clickCodeControl()) {
			if(this.checkCode == code) {
				return true;
			}else {
				return false;
			}
		}else {
			System.out.println("Kay�t� onaylamak i�in maile g�nderilen codu t�klay�n�z.");
			return false;
		}
		
		
	}

	@Override
	public boolean clickCodeControl() {
		
		return true;
	}

}
