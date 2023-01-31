package com.ecom.sporty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.sporty.model.UsersDetailsModel;
import com.ecom.sporty.repository.UserCredentialsRepo;

@Service
public class UserDetailsService {
	@Autowired
	private UserCredentialsRepo repository;

	public UsersDetailsModel saveUser(UsersDetailsModel ud) {
		return repository.save(ud);
	}

	public UsersDetailsModel getUserByName(String username) {

		return repository.findByUsername(username);
	}

}
