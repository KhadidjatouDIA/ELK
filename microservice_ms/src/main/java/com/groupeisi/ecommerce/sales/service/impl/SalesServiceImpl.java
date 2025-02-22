package com.groupeisi.ecommerce.sales.service.impl;

import com.groupeisi.ecommerce.sales.dto.request.SalesDtoRequest;
import com.groupeisi.ecommerce.sales.dto.response.SalesDtoResponse;
import com.groupeisi.ecommerce.sales.entity.SalesEntity;
import com.groupeisi.ecommerce.sales.mapper.SalesMapper;
import com.groupeisi.ecommerce.sales.repository.SalesRepository;
import com.groupeisi.ecommerce.sales.service.SalesService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SalesServiceImpl implements SalesService {
    private SalesMapper salesMapper;
    private SalesRepository salesRepository;
    @Override
    public SalesDtoResponse createSales(SalesDtoRequest sales) {
        SalesEntity sales1 = salesMapper.toSalesEntity(sales);
        sales1 = salesRepository.save(sales1);
        return salesMapper.toSalesDtoResponse(sales1);
    }
    @Override
    public SalesDtoResponse updateSales(String ref, SalesDtoRequest request) {
        Optional<SalesEntity> optionalSales = salesRepository.findById(ref);
        if (optionalSales.isPresent()) {
            SalesEntity salesToUpdate = optionalSales.get();
           // salesToUpdate.setAmount(request.getAmount()); // Exemple de mise à jour
            //salesToUpdate.setDate(request.getDate());
            salesToUpdate = salesRepository.save(salesToUpdate);
            return salesMapper.toSalesDtoResponse(salesToUpdate);
        }
        return null; // Ou lever une exception
    }

    @Override
    public List<SalesDtoResponse> findAllSales() {
        return salesMapper.toListSalesDtoResponse(salesRepository.findAll());
    }

    @Override
    public Optional<?> deleteSales(String ref) {
        Optional<SalesEntity> optionalSales = salesRepository.findById(ref);
        optionalSales.ifPresent(salesRepository::delete);
        return optionalSales;
    }
}