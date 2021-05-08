package eTicaret.business.concretes;

import eTicaret.business.abstracts.AuthService;
import eTicaret.business.abstracts.UserService;
import eTicaret.core.Controls;
import eTicaret.core.mail.MailService;
import eTicaret.entities.concretes.User;

public class AuthManager implements AuthService{
	
	private UserService userService;
	private MailService mailService;
	

	public AuthManager(UserService userService,MailService mailService) {
		super();
		this.userService = userService;
		this.mailService = mailService;
	}

	@Override
	public void register(User user) {
		
		if(Controls.checkEmail(user.getEmail())) {
			if(Controls.checkEmailExists(userService.userServiceGetAll(), user.getEmail())) {
				if(Controls.checkNameSurname(user.getFirstName(),user.getLastName())) {
					if(Controls.checkPassword(user.getPassword())) {
						
						int code = mailService.createCode();
						mailService.sendMail(user);
						
						if(mailService.certifyCode(code)) {
							userService.userServiceAdd(user);
						}
												
					}
				}
			}
		}else {
			System.out.println("Kayýtlý kullanýcý...");
		}
		
	}
	
	 

	@Override
	public void login(String email, String password) {
		if(Controls.checkEmailExists(userService.userServiceGetAll(), email) == false) {
			if(Controls.checkUserPassword(userService.userServiceGetAll(), password)) {
				System.out.println("Giriþ Yapýldý.");
				return;
			}else {
				System.out.println("Parola yanlýþ girildi.");
			}
		}else {
			System.out.println("Email kayýtlý deðil.");
		}
		
	}

}
