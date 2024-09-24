package com.javierlorenzo.shoppingcart;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }
}
