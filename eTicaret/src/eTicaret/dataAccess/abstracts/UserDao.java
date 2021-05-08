package eTicaret.dataAccess.abstracts;

import java.util.List;

import eTicaret.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void update(User user);
	void delete(String email,String password);
	User get(int id);
	User getByEmail(String email);
	List<User> getAll();
	
	
}
