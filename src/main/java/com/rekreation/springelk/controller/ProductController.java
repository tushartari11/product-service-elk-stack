package com.rekreation.springelk.controller;

import com.rekreation.springelk.dto.ProductRequest;
import com.rekreation.springelk.dto.ProductResponse;
import com.rekreation.springelk.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
@Slf4j
public class ProductController {

  private final ProductService productService;

  @GetMapping("/health")
  public String healthCheck() {
    return "Running fine!";
  }

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<ProductResponse> getAllProducts() {
    log.info("Getting all products");
    List<ProductResponse> products =new ArrayList<>();
    try{
      products = productService.getAllProducts();
    }catch (Exception e){
      log.error("Error getting all products", e);
    }
    return products;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public ProductResponse createProduct(@RequestBody ProductRequest productRequest) {
    return productService.createProduct(productRequest);
  }
}
