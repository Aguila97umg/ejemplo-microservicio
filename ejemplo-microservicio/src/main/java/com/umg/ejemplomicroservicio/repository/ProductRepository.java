package com.umg.ejemplomicroservicio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository  extends MongoRepository <ProductRepository,String> {


}
