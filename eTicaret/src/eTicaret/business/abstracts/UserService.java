package eTicaret.business.abstracts;

import java.util.List;

import eTicaret.entities.concretes.User;

public interface UserService {

	
	void userServiceAdd(User user);
	void userServiceDelete(String email,String password);
	List<User> userServiceGetAll();
	
}
