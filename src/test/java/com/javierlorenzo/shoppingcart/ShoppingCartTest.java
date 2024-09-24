package com.javierlorenzo.shoppingcart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    private final ShoppingCart shoppingCart = new ShoppingCart();

    @Test
    public void should_retrieve_zero_when_is_empty() {
        //When
        Integer actual = shoppingCart.getTotalPrice();
        //Then
        Assertions.assertThat(actual).isEqualTo(0);
    }

    @Test
    public void should_retrieve_total_price_when_is_not_empty() {
        //Given
        shoppingCart.add(25);
        //When
        Integer actual = shoppingCart.getTotalPrice();
        // Then
        Assertions.assertThat(actual).isEqualTo(25);
    }

    @Test
    public void should_retrieve_total_price_when_multiple_prices_added() {
        //Given
        shoppingCart.add(25);
        shoppingCart.add(50);
        //When
        Integer actual = shoppingCart.getTotalPrice();
        //Then
        Assertions.assertThat(actual).isEqualTo(75);
    }

}
