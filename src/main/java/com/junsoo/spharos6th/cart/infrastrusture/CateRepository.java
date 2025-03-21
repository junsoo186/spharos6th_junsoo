package com.junsoo.spharos6th.cart.infrastrusture;

import com.junsoo.spharos6th.cart.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CateRepository  extends JpaRepository<Cart, Long> {

    Optional<Cart> findByCartUuid(String cartUuid);
    List<Cart> findByUserUuid(String userUuid);

}
