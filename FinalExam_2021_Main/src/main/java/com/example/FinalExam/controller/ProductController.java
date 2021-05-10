package com.example.FinalExam.controller;

import java.util.List;

import com.example.FinalExam.dao.ProductDao;
import com.example.FinalExam.models.Product;
import com.example.FinalExam.services.PurchaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
    @Autowired
    private ProductDao pDao;

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping(path = "/Buy")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("buy.jsp");

        List<Product> products = pDao.findAll();

        mv.addObject("products", products);
        return mv;
    }

    @PostMapping(path = "product/{id}/buy")
    public String buyProduct(@PathVariable("id") int id, @RequestParam(name = "amount") String amount) {
        purchaseService.purchaseProduct(id, amount);

        return "redirect:/";
    }
}
