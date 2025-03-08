package com.restproducts.products.spring.boot.project.Service;

import com.restproducts.products.spring.boot.project.Model.Product;

import java.util.List;

public interface ProductService {

    void addProducts(Product product);

    List<Product> getProducts();
}
