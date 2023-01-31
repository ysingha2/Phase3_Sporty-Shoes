package com.ecom.sporty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecom.sporty.model.ProductModel;
import com.ecom.sporty.service.ProductService;

import jakarta.servlet.ServletException;

import java.io.IOException;

@Controller
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping("productspage")
	public String productspage(@RequestParam String username, @RequestParam String password) {

		System.out.println(username);
		System.out.println(password);
		return "productspage";
	}

	// @RequestMapping(value = "addProduct", method = RequestMethod.PUT)
	@RequestMapping("addProducts")
	public String addProduct(@RequestParam String name, @RequestParam int qty, @RequestParam double price,
			ProductModel product) throws ServletException, IOException {

		service.saveProduct(product);
		return "Payment";
	}

	@RequestMapping("AdminLogin")
	public String adminLogin() {
		return "AdminLogin";

	}

	@RequestMapping("AdminUI")
	public String adminUI(@RequestParam String username, @RequestParam String password) {
		if (!((username.contentEquals("admin")) && password.contentEquals("admin"))) {
			return "AdminLogin";
		}
		return "AdminUI";
	}

	@RequestMapping("SearchProducts")
	public String SearchProducts() {
		return "SearchProducts";

	}

	@RequestMapping("SearchHistory")
	public String SearchHistory() {
		return "SearchHistory";

	}

}
