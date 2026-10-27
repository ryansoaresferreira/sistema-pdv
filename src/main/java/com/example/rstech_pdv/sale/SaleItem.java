package com.example.rstech_pdv.sale;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class SaleItem {

    @Field(name = "product", targetType = FieldType.OBJECT_ID)
    private String productId;

    private Integer quantity;

    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal price;
}