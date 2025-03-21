package com.junsoo.spharos6th.category.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class CategoryBottom {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private long id;
    private String categoryName;

    @ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
    private CategoryMiddle categoryMiddle;
}
