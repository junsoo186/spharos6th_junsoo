package com.junsoo.spharos6th.product.domain;

import com.junsoo.spharos6th.member.domain.Member;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  String productCode;
    private  String productName;
    private  String productDescription;

    @Lob
    @Column(nullable = false, columnDefinition = "TEXT")
    private  String productDetailContent;

}
