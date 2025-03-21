package com.junsoo.spharos6th.product.domain;

import com.junsoo.spharos6th.category.domain.CategoryBottom;
import com.junsoo.spharos6th.category.domain.CategoryMiddle;
import com.junsoo.spharos6th.category.domain.CategoryTop;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class ProductCategoryList {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private long id;
//    @ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
//    private CategoryTop categoryTop;
//    @ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
//    private CategoryMiddle categoryMiddle;
//    @ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
//    private CategoryBottom categoryBottom;

    private long CategoryTopId;
    private long CategoryMiddleId;
    private long CategoryBottomId;



}
