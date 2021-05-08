package eTicaret.business.concretes;

import java.util.List;

import eTicaret.business.abstracts.UserService;
import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void userServiceAdd(User user) {
		userDao.add(user);
		System.out.println("Kayýt Baþarýlý.");
		
	}

	@Override
	public void userServiceDelete(String email, String password) {
		userDao.delete(email,password);
		
	}

	@Override
	public List<User> userServiceGetAll() {
		
		return userDao.getAll();
	}

}
