package com.groupeisi.ecommerce.sales.service;

import com.groupeisi.ecommerce.sales.dto.request.SalesDtoRequest;
import com.groupeisi.ecommerce.sales.dto.response.SalesDtoResponse;

import java.util.List;
import java.util.Optional;

public interface SalesService {
    public SalesDtoResponse createSales(SalesDtoRequest sales);
    public SalesDtoResponse updateSales(String ref, SalesDtoRequest request);
    public List<SalesDtoResponse> findAllSales();
    public Optional<?> deleteSales(String ref);
}
