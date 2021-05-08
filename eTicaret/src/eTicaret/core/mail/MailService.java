package eTicaret.core.mail;

import eTicaret.entities.concretes.User;

public interface MailService {

	int createCode();
	void sendMail(User user);
	boolean certifyCode(int code);
	boolean clickCodeControl();
}
