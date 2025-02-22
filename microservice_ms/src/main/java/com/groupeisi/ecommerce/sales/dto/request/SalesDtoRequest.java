package com.groupeisi.ecommerce.sales.dto.request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
 @Getter
@Setter
public class SalesDtoRequest {
    private String ref;
    private double quantity;
    private long idUser;
}
