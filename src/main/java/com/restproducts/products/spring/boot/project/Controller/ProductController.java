package com.restproducts.products.spring.boot.project.Controller;

import com.restproducts.products.spring.boot.project.Model.Product;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {


    public String addProduct(@RequestBody Product product){

    }
}
