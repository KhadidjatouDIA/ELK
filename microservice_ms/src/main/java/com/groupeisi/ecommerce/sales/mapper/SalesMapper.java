package com.groupeisi.ecommerce.sales.mapper;

import com.groupeisi.ecommerce.sales.dto.request.SalesDtoRequest;
import com.groupeisi.ecommerce.sales.dto.response.SalesDtoResponse;
import com.groupeisi.ecommerce.sales.entity.SalesEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface SalesMapper {
    @Mapping(source = "ref", target = "ref")
    @Mapping(source = "quantity", target = "quantity")
    @Mapping(source = "idUser", target = "idUser")

    public SalesDtoResponse toSalesDtoResponse(SalesEntity sales);
    public SalesEntity toSalesEntity(SalesDtoRequest sales);
    public List<SalesDtoResponse> toListSalesDtoResponse(List<SalesEntity> salesEntityList);

}
