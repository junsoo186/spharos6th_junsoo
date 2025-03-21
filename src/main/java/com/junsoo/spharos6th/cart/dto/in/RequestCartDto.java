package com.junsoo.spharos6th.cart.dto.in;

import com.junsoo.spharos6th.cart.domain.Cart;
import lombok.*;

import java.util.UUID;

@Getter
@ToString
@NoArgsConstructor
public class RequestCartDto {

    private String cartUuid;
    private String productCode;
    private String productOptionId;
    private Integer productCount;
    private Boolean checked;

    @Builder
    public RequestCartDto(String cartUuid, String productCode, String productOptionId, Integer productCount, Boolean checked) {
        this.cartUuid = cartUuid;
        this.productCode = productCode;
        this.productOptionId = productOptionId;
        this.productCount = productCount;
        this.checked = checked;
    }

    public Cart updateEntity(Cart cart){
        return Cart.builder()
                .id(cart.getId())
                .cartUuid(cart.getCartUuid())
                .cartUuid(cartUuid)
                .productCode(productCode)
                .productOptionId(productOptionId)
                .productCount(productCount)
                .checked(checked)
                .build();
    }

//    public static  RequestCartDto from(RequestCartVo requestCartVo) {
//        return RequestCartDto.builder()
//                .userUuid(requestCartVo.getUserUuid())
//                .productCode(requestCartVo.getProductCode())
//                .productOptionId(requestCartVo.getProductOptionId())
//                .productCount(requestCartVo.getProductCount())
//                .checked(requestCartVo.getChecked())
//                .build();
//    }
}
