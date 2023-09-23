package com.mishra.ekansh.ecommerce.controller;

import com.mishra.ekansh.ecommerce.dto.ProductRequest;
import com.mishra.ekansh.ecommerce.dto.ProductResponse;
import com.mishra.ekansh.ecommerce.model.Product;
import com.mishra.ekansh.ecommerce.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
         productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        return productService.getAllProducts();
    }
}
