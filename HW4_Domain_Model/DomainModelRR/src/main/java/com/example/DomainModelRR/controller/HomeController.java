package com.example.DomainModelRR.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.DomainModelRR.model.Contract;
import com.example.DomainModelRR.model.Product;
import com.example.DomainModelRR.repository.ContractJpaRepository;
import com.example.DomainModelRR.repository.ProductJpaRepository;
import com.example.DomainModelRR.service.RevenueRecognitionFacade;

@Controller
public class HomeController {

    @Autowired
    RevenueRecognitionFacade script;

    @Autowired
    ProductJpaRepository productRepo;

    @Autowired
    ContractJpaRepository contractRepo;

    @RequestMapping(path = "/")
    public ModelAndView home() {
        List<Product> products = productRepo.findAll();

        Map<String, Object> allObjectsMap = new HashMap<String, Object>();
        allObjectsMap.put("products", products);

        ModelAndView mv = new ModelAndView();
        mv.addAllObjects(allObjectsMap);

        mv.setViewName("home.jsp");
        return mv;
    }

    @RequestMapping(path = "/check")
    public ModelAndView calculateRevenueRecognition() {
        List<Contract> contracts = contractRepo.findAll();

        System.out.println(contracts.toString());

        Map<String, Object> allObjectsMap = new HashMap<String, Object>();
        allObjectsMap.put("contracts", contracts);

        ModelAndView mv = new ModelAndView();
        mv.addAllObjects(allObjectsMap);

        mv.setViewName("checkrr.jsp");
        return mv;
    }

}