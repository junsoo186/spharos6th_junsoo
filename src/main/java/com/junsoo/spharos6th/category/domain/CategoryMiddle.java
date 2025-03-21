package com.junsoo.spharos6th.category.domain;

import jakarta.persistence.*;

@Entity
public class CategoryMiddle {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private  long   id;
    private String categoryName;

    @ManyToOne(fetch = FetchType.LAZY)
    private CategoryTop categoryTop;
}
