package com.ecom.sporty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.sporty.model.AllProducts;

public interface AllProductsRepo extends JpaRepository<AllProducts, Integer> {

	AllProducts findByPid(int pid);

	AllProducts findByPname(String pname);

	List<AllProducts> findAllByPname(String pname);

}