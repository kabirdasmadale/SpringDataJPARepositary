package com.BikkadIT.SpringBootDatajpaJPARepositary.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.SpringBootDatajpaJPARepositary.model.User;
@Repository
public interface UserRepositary extends JpaRepository<User, Integer> {
	public User findByUserfname(String fname);

}
