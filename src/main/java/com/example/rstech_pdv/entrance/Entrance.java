package com.example.rstech_pdv.entrance;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.math.BigDecimal;
import java.time.Instant;

@Document("entrances")
@Getter
@Setter
@NoArgsConstructor
public class Entrance {

    @Id
    private String id;

    @Field(name = "sale", targetType = FieldType.OBJECT_ID)
    private String saleId;

    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal value;

    private Instant createdAt = Instant.now();
}