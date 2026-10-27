package com.example.rstech_pdv.product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.math.BigDecimal;
import java.time.Instant;

@Document("products")
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    private String id;

    private String barcode;

    private String name;

    private Integer amount;

    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal salePrice;

    private Instant expirationDate;

    private Instant createdAt = Instant.now();
}