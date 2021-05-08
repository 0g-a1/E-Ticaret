package eTicaret;

import eTicaret.business.abstracts.AuthService;
import eTicaret.business.concretes.AuthManager;
import eTicaret.business.concretes.UserManager;
import eTicaret.core.mail.GoogleAuthManagerAdapter;
import eTicaret.core.mail.MailManager;
import eTicaret.dataAccess.concretes.HibernateUserDao;
import eTicaret.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		System.out.println("Kendi sistemimiz ile kayýt\n");
		
		User user1 = new User(1,"KungFu","Panda","kungfupanda@gmail.com","123qwe");
		AuthService authManager = new AuthManager(new UserManager(new HibernateUserDao()),new MailManager());
		authManager.register(user1);
		
		System.out.println("\n");
		
		System.out.println("Google ile kayýt\n");
		
		User user2 = new User(2,"SiFU","Master","ichuzur@yahoo.com","001100");
		AuthService googleManager = new GoogleAuthManagerAdapter(new UserManager(new HibernateUserDao()),new MailManager());
		googleManager.register(user2);

	}

}
