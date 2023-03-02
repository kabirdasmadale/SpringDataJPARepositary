package com.BikkadIT.SpringBootDatajpaJPARepositary.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;

import com.BikkadIT.SpringBootDatajpaJPARepositary.Service.UserServiceI;
import com.BikkadIT.SpringBootDatajpaJPARepositary.model.User;

@Controller
public class UserController {
	@Autowired
	private UserServiceI userservicei;
	
	
	public String saveUser(User user) {
		String saveUser = userservicei.saveUser(user);
		return saveUser;
	
		
	}
	public List<User> saveAllUser(List<User> list) {
	List<User> allUser = (List<User>)userservicei.saveAllUser(list);
			return allUser;
}
	public List<User> sortingUser() {
		List<User> sortingUser = userservicei.sortingUser();
		return sortingUser;
	}
	public List<User> sortingUser2() {
	List<User> user2 = userservicei.sortingUser2();
		return user2;
}
	public User getByUserFname(String fname) {
		User fname2 = userservicei.getByUserFname(fname);
		return fname2;
	}
}
