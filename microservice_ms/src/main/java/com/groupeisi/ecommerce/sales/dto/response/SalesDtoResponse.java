package com.groupeisi.ecommerce.sales.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class SalesDtoResponse {
    private String ref;
    private double quantity;
    private long idUser;
}
