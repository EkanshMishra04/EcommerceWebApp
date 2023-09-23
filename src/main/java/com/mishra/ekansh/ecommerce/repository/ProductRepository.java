package com.mishra.ekansh.ecommerce.repository;

import com.mishra.ekansh.ecommerce.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {

}
