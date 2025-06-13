package com.mercearia.service;

import com.mercearia.model.Produto;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private static List<Produto> produto = new ArrayList<>();
    private static Long idCounter = 1L;

    static {
    	
        // Produtos de exemplo
    	
    	produto.add(new Produto(idCounter++, "Arroz", 5.50, "Arroz Branco", 100));
    	produto.add(new Produto(idCounter++, "Feijão", 7.80, "Feijão Preto", 50));
    }

    public List<Produto> getAllProducts() {
        return produto;
    }

    public Produto addProduct(String name, Double price, String description, Integer stock) {
    	Produto pro = new Produto(idCounter++, name, price, description, stock);
    	produto.add(pro);
        return pro;
    }
}

