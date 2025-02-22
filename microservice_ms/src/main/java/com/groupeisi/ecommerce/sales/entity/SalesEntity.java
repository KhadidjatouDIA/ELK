package com.groupeisi.ecommerce.sales.entity;

import com.groupeisi.ecommerce.products.entities.ProductEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "sale")
public class SalesEntity {
    @Id
@Column(unique = true , nullable = false )
private String ref;
    private Date dateP;
    @Column(nullable = false)
    private double quantity;
    private long idUser;
    @OneToMany( mappedBy = "sale", cascade = CascadeType.ALL, orphanRemoval = true)
    List<ProductEntity> products = new ArrayList<>();
}
