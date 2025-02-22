package com.groupeisi.ecommerce.purchase.controller;

import com.groupeisi.ecommerce.purchase.dto.request.PurchaseDtoRequest;
import com.groupeisi.ecommerce.purchase.dto.response.PurchaseDtoResponse;
import com.groupeisi.ecommerce.purchase.service.PurchaseService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/purchase")
@AllArgsConstructor
public class PurchaseController {
    private PurchaseService purchaseService;

    @PostMapping
    public ResponseEntity<PurchaseDtoResponse> createPurchase(@RequestBody PurchaseDtoRequest purchaseDtoRequest) {
        return ResponseEntity.ok(purchaseService.createPurchase(purchaseDtoRequest));
    }

    @GetMapping
    public ResponseEntity<List<PurchaseDtoResponse>> getAllPurchases() {
        return ResponseEntity.ok(purchaseService.getAllPurchase());
    }

    @PutMapping("/{ref}")
    public ResponseEntity<PurchaseDtoResponse> updatePurchase(@PathVariable String ref, @RequestBody PurchaseDtoRequest purchaseDtoRequest) {
        PurchaseDtoResponse updatedPurchase = purchaseService.updatePurchase(ref, purchaseDtoRequest);
        return updatedPurchase != null ? ResponseEntity.ok(updatedPurchase) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{ref}")
    public ResponseEntity<Void> deletePurchase(@PathVariable String ref) {
        Optional<?> deletedPurchase = purchaseService.deletePurchase(ref);
        return deletedPurchase.isPresent() ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}