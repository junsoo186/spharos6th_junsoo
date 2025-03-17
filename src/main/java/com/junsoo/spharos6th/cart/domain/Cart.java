package com.junsoo.spharos6th.cart.domain;

import com.junsoo.spharos6th.member.domain.Member;
import com.junsoo.spharos6th.product.domain.Product;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor

public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @ManyToOne
    private Product product;
}
