package com.ecom.sporty.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.sporty.model.UsersDetailsModel;

public interface UserCredentialsRepo extends JpaRepository<UsersDetailsModel, Integer> {

	UsersDetailsModel findByUsername(String username);

}
