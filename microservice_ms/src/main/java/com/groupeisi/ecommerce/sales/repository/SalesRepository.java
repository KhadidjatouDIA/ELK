package com.groupeisi.ecommerce.sales.repository;

import com.groupeisi.ecommerce.purchase.entity.PurchaseEntity;
import com.groupeisi.ecommerce.sales.entity.SalesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository extends JpaRepository<SalesEntity,String> {
}
