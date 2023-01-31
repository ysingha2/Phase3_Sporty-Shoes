package com.ecom.sporty.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.sporty.model.ProductModel;

public interface ProductsRepo extends JpaRepository<ProductModel, Integer> {
	ProductModel findByName(String name);

	ProductModel findAllByName(String name);
}
