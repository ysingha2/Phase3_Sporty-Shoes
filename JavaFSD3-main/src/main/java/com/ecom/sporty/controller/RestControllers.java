package com.ecom.sporty.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.ecom.sporty.model.ProductModel;
import com.ecom.sporty.service.ProductService;

@RestController
public class RestControllers {

	@Autowired
	private ProductService service;

	@PostMapping("/addProducts/{name}/{qty}/{price}")
	public ModelAndView addProducts(@PathVariable("name") String name, @PathVariable("qty") Integer qty,
			@PathVariable("price") Double price) {
		ProductModel pr = new ProductModel();
		pr.setName(name);
		pr.setQty(qty);
		pr.setPrice(price);
		service.saveProduct(pr);
		return new ModelAndView("Payment", "Payment", "Welcome!");
	}

	@PostMapping("/addProducts")
	public List<ProductModel> addProducts(@RequestBody List<ProductModel> products) {
		return service.saveProducts(products);
	}

	@GetMapping("/products")
	public List<ProductModel> findAllProducts() {
		return service.getProducts();
	}

	@PutMapping("/update")
	public ProductModel updateProduct(@RequestBody ProductModel product) {
		return service.updateProduct(product);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}

}
