package com.umg.ejemplomicroservicio.controlador;

import com.umg.ejemplomicroservicio.entity.ProductEntity;
import com.umg.ejemplomicroservicio.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductRepository> getAllProducts(){
        return productRepository.findAll();
    }
    @PostMapping
    @ResponseStatus (HttpStatus.OK)
    public void createProduct(@RequestBody ProductEntity productEntity){

        // productRepository.save(productEntity);
    }

}
