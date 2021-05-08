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
		System.out.println("Sayýn " + user.getFirstName() + "\n" + "Mail adresinize doðrulama kodu gönderildi.");
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
			System.out.println("Kayýtý onaylamak için maile gönderilen codu týklayýnýz.");
			return false;
		}
		
		
	}

	@Override
	public boolean clickCodeControl() {
		
		return true;
	}

}
