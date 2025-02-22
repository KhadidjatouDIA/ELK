package com.groupeisi.ecommerce.purchase.entity;

import com.groupeisi.ecommerce.products.entities.ProductEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "purchase")
public class PurchaseEntity {
    @Id
 @GeneratedValue(strategy = GenerationType.UUID)
    @Column(unique = true, nullable = false)

    private String ref;
    private Date dateP;
    @Column(nullable = false)
    private double quantity;
    private long idUser;
    @OneToMany( mappedBy = "purchase", cascade = CascadeType.ALL, orphanRemoval = true)
    List<ProductEntity> products = new ArrayList<>();
}
