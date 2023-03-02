package com.BikkadIT.SpringBootDatajpaJPARepositary.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.BikkadIT.SpringBootDatajpaJPARepositary.Repositary.UserRepositary;
import com.BikkadIT.SpringBootDatajpaJPARepositary.model.User;

@Service
public class UserIMPL implements UserServiceI {
@Autowired
	private UserRepositary userrepositary;



@Override
public String saveUser(User user) {
	User save = userrepositary.save(user);
	return "data save succesfully";
}
@Override
public List<User> saveAllUser(List<User> list) {
	List<User> saveAll = (List<User>)userrepositary.saveAll(list);
	return saveAll;
}
@Override
public List<User> sortingUser() {
	List<User> findAll = userrepositary.findAll(Sort.by("fname"));
	return findAll;
}
@Override
public List<User> sortingUser2() {
	List<User> list = userrepositary.findAll(Sort.by("id"));
	return list;
}
@Override
public User getByUserFname(String fname) {
	User findByUserfname = userrepositary.findByUserfname(fname);
	return findByUserfname;
}

}
