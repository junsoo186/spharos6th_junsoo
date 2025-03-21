package com.junsoo.spharos6th.product.domain;

import com.junsoo.spharos6th.color.domain.Color;
import com.junsoo.spharos6th.size.domain.Size;
import jakarta.persistence.*;

@Entity
public class ProductOptionList {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private long id;
    private Integer stock;
    private Boolean soldOut;
    private Integer dangerStock;


    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
    @ManyToOne(fetch = FetchType.LAZY)
    private Color color;
    @ManyToOne(fetch = FetchType.LAZY)
    private Size size;
}
