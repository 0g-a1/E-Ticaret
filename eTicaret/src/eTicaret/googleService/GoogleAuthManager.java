package eTicaret.googleService;

import eTicaret.entities.concretes.User;

public class GoogleAuthManager {

	public void registerWithGoogle(User user) {
		System.out.println("Google ile kay�t olundu : " + user.getEmail());
	}
}
