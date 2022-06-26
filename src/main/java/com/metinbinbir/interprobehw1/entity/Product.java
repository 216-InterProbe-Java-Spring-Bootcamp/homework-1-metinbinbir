package com.metinbinbir.interprobehw1.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(generator = "Product")
    @SequenceGenerator(name = "Product", sequenceName = "PRODUCT_ID_SEQ")
    private Long id;

    @Column(name = "NAME", length = 50, nullable = false)
    private String name;

    @Column(name = "PRICE", nullable = false)
    private double price;

    @Column(name="EXPIRATION_DATE")
    @Temporal(TemporalType.DATE)
    private Date expirationDate;
}
