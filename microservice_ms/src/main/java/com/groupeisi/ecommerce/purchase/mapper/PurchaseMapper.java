package com.groupeisi.ecommerce.purchase.mapper;

import com.groupeisi.ecommerce.purchase.dto.request.PurchaseDtoRequest;
import com.groupeisi.ecommerce.purchase.dto.response.PurchaseDtoResponse;
import com.groupeisi.ecommerce.purchase.entity.PurchaseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PurchaseMapper {

    @Mapping(source = "ref", target = "ref")
    @Mapping(source = "quantity", target = "quantity")
    @Mapping(source = "idUser", target = "idUser")
    public PurchaseDtoResponse toPurchaseDtoResponse(PurchaseEntity purchase);

    public PurchaseEntity toPurchaseEntity(PurchaseDtoRequest purchase);

    public List<PurchaseDtoResponse> toListPurchaseDtoResponse(List<PurchaseEntity> purchaseEntities);
}
