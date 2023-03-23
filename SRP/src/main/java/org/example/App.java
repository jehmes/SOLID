package org.example;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Item item1 = new Item("Bicycle", 750.10f);
        Item item2 = new Item("Refrigerator", 1950.15f);
        Item item3 = new Item("Carpet", 350.20f);

        Cart cart = new Cart(List.of(item1, item2, item3));

        Order order = new Order(cart);

        System.out.println(cart.getItens());
        System.out.println();
        System.out.println("Amount: " + order.getAmount());

        System.out.println();
        System.out.println("Status: " + order.getStatus());

        System.out.println();
        if (order.confirmOrder()) {
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Error confirming order. Cart is empty.");
        }
        System.out.println();
        System.out.println("Status: " + order.getStatus());
    }
}
