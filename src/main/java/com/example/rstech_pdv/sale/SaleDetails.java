package com.example.rstech_pdv.sale;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class SaleDetails {

    private List<SaleItem> products = new ArrayList<>();

    // formato legado e inconsistente (ex.: {formattedValue: "R$ NaN"}); só leitura por enquanto
    private List<Map<String, Object>> productsVariedValues = new ArrayList<>();

    @Field(name = "descount", targetType = FieldType.DECIMAL128)
    private BigDecimal discount;

    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal total;
}