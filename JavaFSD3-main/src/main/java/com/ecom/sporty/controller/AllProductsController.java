package com.ecom.sporty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.sporty.model.AllProducts;
import com.ecom.sporty.service.AllProductsService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
public class AllProductsController {

    @Autowired
    private AllProductsService service;

    @GetMapping("SearchResults")
    public String SearchResults(@RequestParam String search, @RequestParam String searchoption, AllProducts pp) {
        if (searchoption.equalsIgnoreCase("id")) {
            System.out.println(searchoption);
            return "productById";
        }
        return "productByname";
    }

    @RequestMapping("productById")
    public String findProductById(HttpServletRequest request, @RequestParam int search,
            @RequestParam String searchoption) {
        HttpSession session = request.getSession();
        String pname = service.getProductByPid(search).getPname();
        session.setAttribute("pname", pname);
        int price = service.getProductByPid(search).getPrice();
        session.setAttribute("price", price);
        return "productById";
    }

    @GetMapping("productByname")
    public String findProductByName(HttpServletRequest request, @RequestParam String search,
            @RequestParam String searchoption) {
        HttpSession session = request.getSession();
        System.out.println(search);
        int pid = service.getProductByPname(search).getPid();
        System.out.println("pid" + pid);
        session.setAttribute("pid", pid);
        int price = service.getProductByPname(search).getPrice();
        session.setAttribute("price", price);
        return "productBynames";
    }

    @GetMapping("SearchPurchases")
    public String SearchPurchases(@RequestParam String search, @RequestParam String searchoption, AllProducts pp) {
        if (searchoption.equalsIgnoreCase("pid")) {
            System.out.println(searchoption);
            return "productByPids";
        }
        return "productByPnames";
    }

    @RequestMapping("productByPid")
    public String findProductByPid(HttpServletRequest request, @RequestParam int search,
            @RequestParam String searchoption) {
        HttpSession session = request.getSession();
        String pname = service.getProductByPid(search).getPname();
        session.setAttribute("pname", pname);
        int price = service.getProductByPid(search).getPrice();
        session.setAttribute("price", price);
        return "productById";
    }

    @GetMapping("productByPname")
    public String findProductBypname(HttpServletRequest request, @RequestParam String search,
            @RequestParam String searchoption) {
        HttpSession session = request.getSession();
        System.out.println(search);
        int pid = service.getProductByPname(search).getPid();
        System.out.println("pid" + pid);
        session.setAttribute("pid", pid);
        int price = service.getProductByPname(search).getPrice();
        session.setAttribute("price", price);
        return "productByname";
    }
}
