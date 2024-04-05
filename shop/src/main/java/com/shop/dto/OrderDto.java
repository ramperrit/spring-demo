package com.shop.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OrderDto {
    @NotNull(message = "상품 아이디는 입력 필수")
    private Long itemId;

    @Min(value = 1, message = "최소 주문 수량은 1개")
    @Max(value = 999, message = "최대 주문 수량 999개")
    private int count;
}
