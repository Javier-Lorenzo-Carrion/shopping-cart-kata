package com.javierlorenzo.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Item> items = new ArrayList<>();

    public Integer getTotalPrice() {
        return items.stream().reduce(0, (accumulator, item) -> accumulator + item.getPrice(), Integer::sum);
    }

    public Integer getTotalItems() {
        return items.size();
    }

    public void add(Item item) {
        items.add(item);
    }
}
