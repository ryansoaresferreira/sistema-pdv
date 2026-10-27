package com.example.rstech_pdv.sale;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SaleRepository extends MongoRepository<Sale, String> {
}