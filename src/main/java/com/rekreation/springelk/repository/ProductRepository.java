package com.rekreation.springelk.repository;


import com.rekreation.springelk.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {}
