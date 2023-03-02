package com.BikkadIT.SpringBootDatajpaJPARepositary.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.BikkadIT.SpringBootDatajpaJPARepositary.model.User;

@Service
public interface UserServiceI {
	public String saveUser(User user);
	public List<User> saveAllUser(List<User> list);
	public List<User> sortingUser();
	public List<User> sortingUser2();
	public User getByUserFname(String fname);
	

}
