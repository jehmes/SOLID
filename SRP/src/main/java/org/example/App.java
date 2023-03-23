package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Cart carrinho1 = new Cart();

        carrinho1.addItens("Bicycle", 750.10f);
        carrinho1.addItens("Refrigerator", 1950.15f);
        carrinho1.addItens("Carpet", 350.20f);

        System.out.println(carrinho1.showItens());
        System.out.println();
        System.out.println("Amount: " + carrinho1.showAmount());

        System.out.println();
        System.out.println("Status: " + carrinho1.showStatus());

//        carrinho1.addItens("Television 65", 3570.25f);

        System.out.println();
        if (carrinho1.confirmOrder()) {
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Error confirming order. Cart is empty.");
        }
        System.out.println();
        System.out.println("Status: " + carrinho1.showStatus());
    }
}
