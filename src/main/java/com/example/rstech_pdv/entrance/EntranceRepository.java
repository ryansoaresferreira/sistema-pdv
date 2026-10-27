package com.example.rstech_pdv.entrance;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EntranceRepository extends MongoRepository<Entrance, String> {
}