package com.junsoo.spharos6th.cart.application;

import com.junsoo.spharos6th.cart.dto.in.RequestCartDto;

public interface CartService {
    void addCaer(RequestCartDto requestCartDto);
    void deleteCart(String cartUuid);
    Boolean checkCart(String cartUuid);
    void changeProductCount();
    void changeProductOption();
//    ReponseCartDto getCart(String cartUuid);
//    List<ReponseCartDto> getCartList(String userUuid);

}
