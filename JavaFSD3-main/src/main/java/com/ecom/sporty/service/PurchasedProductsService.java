package com.ecom.sporty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.sporty.model.PurchasedProductsModel;
import com.ecom.sporty.repository.PurchasedRepo;

@Service
public class PurchasedProductsService {

	@Autowired
	private PurchasedRepo repository;

	public PurchasedProductsModel saveUser(PurchasedProductsModel pp) {
		return repository.save(pp);
	}

	public PurchasedProductsModel getProductByPid(int pid) {
		return repository.findByPid(pid);
	}

	public PurchasedProductsModel getProductByPname(String pname) {
		return repository.findByPname(pname);
	}

	public List<PurchasedProductsModel> findAll() {
		return repository.findAll();
	}
}
