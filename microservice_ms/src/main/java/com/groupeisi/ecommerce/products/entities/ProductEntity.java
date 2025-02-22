package com.groupeisi.ecommerce.products.entities;

import com.groupeisi.ecommerce.purchase.entity.PurchaseEntity;
import com.groupeisi.ecommerce.sales.entity.SalesEntity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "products")
public class ProductEntity implements Serializable {

    @Id
    @Column(unique = true , nullable = false )
    private String ref;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double stock;

    @Column(nullable = false)
    private long idUser;

    @ManyToOne
    @JoinColumn(name = "purchase_id", nullable = false)
    private PurchaseEntity purchase;
    @ManyToOne
    @JoinColumn(name = "sale_id", nullable = false)
    private SalesEntity sale;
}
