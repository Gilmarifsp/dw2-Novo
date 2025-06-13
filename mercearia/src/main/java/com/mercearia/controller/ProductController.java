package com.mercearia.controller;

import com.mercearia.model.Produto;
import com.mercearia.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Listar todos os produtos
    @GetMapping
    public List<Produto> getAllProducts() {
        return productService.getAllProducts();
    }

    // Adicionar um novo produto
    @PostMapping
    public ResponseEntity<Produto> addProduct(@RequestParam String name, @RequestParam Double price,
                                              @RequestParam String description, @RequestParam Integer stock) {
    	Produto pro = productService.addProduct(name, price, description, stock);
        return ResponseEntity.ok(pro);
    }
}
