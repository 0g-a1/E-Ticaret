package eTicaret.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		 
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String email, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	
	

}
