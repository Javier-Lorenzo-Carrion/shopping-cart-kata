package com.javierlorenzo.shoppingcart;

public class ShoppingCart {
    private Integer totalPrice = 0;

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void add(int price) {
        totalPrice += price;
    }
}
