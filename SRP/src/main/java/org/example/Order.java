package org.example;

public class Order {
    private Cart cart;
    private Float amount;
    private String status;

    public Order(Cart cart) {
        this.cart = cart;
        this.amount = 0F;
        this.status = "open";
    }

    public boolean confirmOrder() {
        if (cart.validateCart()) {
            status = "confirmed";
            Email.sendEmailConfirmation();
            return true;
        }
        return false;
    }

    public Cart getCart() {
        return cart;
    }

    public Float getAmount() {
        cart.getItens().forEach(i -> amount += i.getValue());
        return amount;
    }

    public String getStatus() {
        return status;
    }
}
