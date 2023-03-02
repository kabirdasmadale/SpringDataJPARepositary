package com.BikkadIT.SpringBootDatajpaJPARepositary;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.SpringBootDatajpaJPARepositary.Controller.UserController;
import com.BikkadIT.SpringBootDatajpaJPARepositary.model.User;

@SpringBootApplication
public class SpringBootDatajpaJpaRepositaryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDatajpaJpaRepositaryApplication.class, args);
	UserController userController = context.getBean(UserController.class);
	
//	User user1=new User();
//	user1.setFname("mahadev");
//	user1.setLname("yevale");
//	user1.setAddress("nagar");
//	user1.setPan("abc");
//	user1.setAge(22);
//	
//	String saveUser = userController.saveUser(user1);
//	System.out.println(saveUser);
	
//	User user1=new User();
//	user1.setFname("mahadev");
//	user1.setLname("yevale");
//	user1.setAddress("nagar");
//	user1.setPan("abc");
//	user1.setAge(22);
//	
//	User user2=new User();
//	user2.setFname("bharat");
//	user2.setLname("kambale");
//	user2.setAddress("pune");
//	user2.setPan("xyc");
//	user2.setAge(64);
//	
//	User user3=new User();
//	user3.setFname("baburao");
//	user3.setLname("ladekar");
//	user3.setAddress("nanded");
//	user3.setPan("mno");
//	user3.setAge(28);
//	
//	User user4=new User();
//	user4.setFname("pandurang");
//	user4.setLname("suryavanshi");
//	user4.setAddress("satara");
//	user4.setPan("hgyt");
//	user4.setAge(25);
//	
//	List<User> li=new ArrayList();
//	li.add(user1);
//	li.add(user2);
//	li.add(user3);
//	li.add(user4);
//	
//	List<User> user = userController.saveAllUser(li);
//	System.out.println(user);
	
//	List<User> sortingUser = userController.sortingUser();
//	System.out.println(sortingUser);
//	for(User s:sortingUser) {
//		System.out.println(s);
//		
		
//	}
	
//	List<User> sortingUser2 = userController.sortingUser2();
//	System.out.println(sortingUser2);
//	for(User u:sortingUser2) {
//		System.out.println(u);
//	}
	
	
	User byUserFname = userController.getByUserFname("baburao");
	System.out.println(byUserFname);
	
	}

}
