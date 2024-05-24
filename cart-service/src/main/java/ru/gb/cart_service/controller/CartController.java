package ru.gb.cart_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.gb.cart_service.model.Cart;
import ru.gb.cart_service.model.CartItem;

@RestController
@RequestMapping("/cart")
public class CartController {
    @PostMapping("/add")
    public void addToCart(@RequestBody CartItem cartItem) {
        // Add logic to add item to cart
    }

    @DeleteMapping("/remove/{productId}")
    public void removeFromCart(@PathVariable Long productId) {
        // Add logic to remove item from cart
    }

    @PostMapping("/checkout")
    public void checkout(@RequestBody Cart cart) {
        // Add logic to process checkout
    }
}
