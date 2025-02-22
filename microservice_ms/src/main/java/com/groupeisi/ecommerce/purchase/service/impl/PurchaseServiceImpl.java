package com.groupeisi.ecommerce.purchase.service.impl;

import com.groupeisi.ecommerce.purchase.dto.request.PurchaseDtoRequest;
import com.groupeisi.ecommerce.purchase.dto.response.PurchaseDtoResponse;
import com.groupeisi.ecommerce.purchase.entity.PurchaseEntity;
import com.groupeisi.ecommerce.purchase.mapper.PurchaseMapper;
import com.groupeisi.ecommerce.purchase.repository.PurchaseRepository;
import com.groupeisi.ecommerce.purchase.service.PurchaseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PurchaseServiceImpl implements PurchaseService {
    private PurchaseRepository purchaseRepository;
    private PurchaseMapper purchaseMapper;

    @Override
    public PurchaseDtoResponse createPurchase(PurchaseDtoRequest purchase) {
        PurchaseEntity purchase1 = purchaseRepository.save(purchaseMapper.toPurchaseEntity(purchase));
        return purchaseMapper.toPurchaseDtoResponse(purchase1);
    }

    @Override
    public List<PurchaseDtoResponse> getAllPurchase() {
        List<PurchaseEntity> purchaseEntities = purchaseRepository.findAll();
        return purchaseMapper.toListPurchaseDtoResponse(purchaseEntities);
    }

    @Override
    public PurchaseDtoResponse updatePurchase(String ref, PurchaseDtoRequest purchase) {
        Optional<PurchaseEntity> optionalPurchase = purchaseRepository.findById(ref);
        if (optionalPurchase.isPresent()) {
            PurchaseEntity purchaseToUpdate = optionalPurchase.get();
            //purchaseToUpdate.setAmount(purchase.getAmount()); // Exemple de mise à jour
            //purchaseToUpdate.setDate(purchase.getDate());
            purchaseToUpdate = purchaseRepository.save(purchaseToUpdate);
            return purchaseMapper.toPurchaseDtoResponse(purchaseToUpdate);
        }
        return null;
    }

    @Override
    public Optional<?> deletePurchase(String ref) {
        Optional<PurchaseEntity> optionalPurchase = purchaseRepository.findById(ref);
        optionalPurchase.ifPresent(purchaseRepository::delete);
        return optionalPurchase;
    }
}
