package com.example.rstech_pdv.sale;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.math.BigDecimal;
import java.time.Instant;

@Document("sales")
@Getter
@Setter
@NoArgsConstructor
public class Sale {

    @Id
    private String id;

    @Field("sale")
    private SaleDetails details;

    @Field(name = "seller", targetType = FieldType.OBJECT_ID)
    private String sellerId;

    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal sellerCommission;

    private String paymentMethod;

    private Instant createdAt = Instant.now();
}