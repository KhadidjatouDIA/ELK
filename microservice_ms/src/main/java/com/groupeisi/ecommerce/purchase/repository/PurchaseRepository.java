package com.groupeisi.ecommerce.purchase.repository;

import com.groupeisi.ecommerce.purchase.entity.PurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepository extends JpaRepository<PurchaseEntity, String> {
}
