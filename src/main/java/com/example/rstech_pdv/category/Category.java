package com.example.rstech_pdv.category;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document("categories")
@Getter
@Setter
@NoArgsConstructor
public class Category {

    @Id
    private String id;

    private String name;

    private Instant createdAt = Instant.now();
}