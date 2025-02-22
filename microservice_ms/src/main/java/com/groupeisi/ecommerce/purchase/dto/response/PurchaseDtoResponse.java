package com.groupeisi.ecommerce.purchase.dto.response;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PurchaseDtoResponse {
    private String ref;
    private double quantity;
    private long idUser;
}
