package com.groupeisi.ecommerce.sales.controller;

import com.groupeisi.ecommerce.sales.dto.request.SalesDtoRequest;
import com.groupeisi.ecommerce.sales.dto.response.SalesDtoResponse;
import com.groupeisi.ecommerce.sales.service.SalesService;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/sales")
public class SalesController {
    private SalesService salesService;

    @GetMapping
    public ResponseEntity<List<SalesDtoResponse>> findAllSales() {
        return ResponseEntity.ok(salesService.findAllSales());
    }

    @PostMapping
    public ResponseEntity<SalesDtoResponse> createSales(@RequestBody SalesDtoRequest sales) {
        return ResponseEntity.ok(salesService.createSales(sales));
    }

    @PutMapping("/{ref}")
    public ResponseEntity<SalesDtoResponse> updateSales(@PathVariable String ref, @RequestBody SalesDtoRequest request) {
        SalesDtoResponse updatedSales = salesService.updateSales(ref, request);
        return updatedSales != null ? ResponseEntity.ok(updatedSales) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{ref}")
    public ResponseEntity<Void> deleteSales(@PathVariable String ref) {
        Optional<?> deletedSales = salesService.deleteSales(ref);
        return deletedSales.isPresent() ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
