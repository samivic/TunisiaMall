package com.esprit.tunisiamall.service.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.esprit.tunisiamall.domain.User;

@Local
public interface UserService {

	String loginUser(User user);
	User updateUser(User user);
	List<User> findAllUser();
	User findUserByName(String name);
	User findUserByMail(String mail);
	Boolean disableUser(User user);
}
