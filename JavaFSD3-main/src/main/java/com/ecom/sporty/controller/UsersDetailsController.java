package com.ecom.sporty.controller;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecom.sporty.model.UsersDetailsModel;
import com.ecom.sporty.service.UserDetailsService;

import jakarta.servlet.ServletException;

@Controller
public class UsersDetailsController {

	@Autowired
	private UserDetailsService service;

	@RequestMapping("/")
	public String Login() {
		return "Login";
	}

	@RequestMapping("signUp")
	public String signUp() {
		return "Signup";
	}

	@GetMapping("signedUp")
	public String signedUp(@RequestParam String username, @RequestParam String password, UsersDetailsModel ud)
			throws ServletException, IOException {
		service.saveUser(ud);
		return "Login";
	}

	// @RequestMapping(value = "LoggedIn", method = RequestMethod.POST)
	@RequestMapping("LoggedIn")
	public String LoggedIn(@RequestParam String username, @RequestParam String password) {
		System.out.println(service.getUserByName(username).getUsername());

		if (!(username.contentEquals(service.getUserByName(username).getUsername()))) {

			return "Login";
		}

		System.out.println(username);

		return "productspage";
	}

}
