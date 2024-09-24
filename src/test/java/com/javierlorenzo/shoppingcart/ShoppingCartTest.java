package com.javierlorenzo.shoppingcart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    @Test
    public void should_retrieve_zero_when_is_empty() {
        //Given
        ShoppingCart shoppingCart = new ShoppingCart();
        //When
        Integer actual = shoppingCart.getTotalPrice();
        //Then
        Assertions.assertThat(actual).isEqualTo(0);
    }

    @Test
    public void should_retrieve_total_price_when_is_not_empty() {
        //Given
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(new Item("Unknown", 25));
        //When
        Integer actual = shoppingCart.getTotalPrice();
        // Then
        Assertions.assertThat(actual).isEqualTo(25);
    }

    @Test
    public void should_retrieve_total_price_when_multiple_prices_added() {
        //Given
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(new Item("Unknown", 25));
        shoppingCart.add(new Item("Unknown", 50));
        //When
        Integer actual = shoppingCart.getTotalPrice();
        //Then
        Assertions.assertThat(actual).isEqualTo(75);
    }

    @Test
    public void should_retrieve_item_numbers() {
        //Given
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(new Item("Unknown", 25));
        shoppingCart.add(new Item("Unknown", 50));
        //When
        Integer actual = shoppingCart.getTotalItems();
        //Then
        Assertions.assertThat(actual).isEqualTo(2);
    }

    @Test
    public void should_add_an_item_with_name_and_price() {
        //Given
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(new Item("Plato", 50));
        //When
        Integer actualTotalItems = shoppingCart.getTotalItems();
        Integer actualTotalPrice = shoppingCart.getTotalPrice();
        //Then
        Assertions.assertThat(actualTotalItems).isEqualTo(1);
        Assertions.assertThat(actualTotalPrice).isEqualTo(50);
    }
}
