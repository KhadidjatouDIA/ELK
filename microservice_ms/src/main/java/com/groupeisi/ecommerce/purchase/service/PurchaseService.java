package com.groupeisi.ecommerce.purchase.service;

import com.groupeisi.ecommerce.purchase.dto.request.PurchaseDtoRequest;
import com.groupeisi.ecommerce.purchase.dto.response.PurchaseDtoResponse;

import java.util.List;
import java.util.Optional;

public interface PurchaseService {
    public PurchaseDtoResponse createPurchase(PurchaseDtoRequest purchase);
    public List<PurchaseDtoResponse> getAllPurchase();
    public PurchaseDtoResponse updatePurchase(String ref, PurchaseDtoRequest purchase);
    public Optional<?> deletePurchase(String ref);
}
