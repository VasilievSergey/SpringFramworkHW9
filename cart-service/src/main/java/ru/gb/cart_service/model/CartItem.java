package ru.gb.cart_service.model;

import lombok.Data;

@Data
public class CartItem {

    private Long productId;
    private int quantity;

}
