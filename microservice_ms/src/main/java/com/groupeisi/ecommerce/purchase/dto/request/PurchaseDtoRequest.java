package com.groupeisi.ecommerce.purchase.dto.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
 @Getter
@Setter
public class PurchaseDtoRequest {
   // @NotBlank(message = "Le ref ne dois pas êtrer null")
    private String ref;
    @NotBlank(message = "Le stock ne dois pas êtrer null")
    private double quantity;
    @NotBlank(message = "L'idUser ne dois pas êtrer null")
    private Long idUser;
}
