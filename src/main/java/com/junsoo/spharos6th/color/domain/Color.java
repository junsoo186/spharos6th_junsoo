package com.junsoo.spharos6th.color.domain;

import com.junsoo.spharos6th.product.domain.Product;
import jakarta.persistence.*;

@Entity
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String colorName;
    private String colorCode;
    private String colorDescription;

/*    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;*/
    //private long productId;

}
