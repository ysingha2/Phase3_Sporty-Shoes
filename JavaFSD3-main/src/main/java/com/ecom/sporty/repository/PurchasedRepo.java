package com.ecom.sporty.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.sporty.model.PurchasedProductsModel;

public interface PurchasedRepo extends JpaRepository<PurchasedProductsModel, Integer> {

	PurchasedProductsModel findByPid(int pid);

	PurchasedProductsModel findByPname(String pname);

}
