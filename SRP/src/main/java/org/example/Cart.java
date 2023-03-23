package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
    private List<Map<String, Object>> itens;
    private String status;
    private Float amount;


    public Cart() {
        this.itens = new ArrayList<>();
        this.status = "open";
        this.amount = 0F;
    }

    public void addItens(String item, Float value) {
        Map<String, Object> itemMap = new HashMap<>();
        itemMap.put(item, value);
        amount += value;
        itens.add(itemMap);
    }

    public Float showAmount() {
        return amount;
    }

    public String showStatus() {
        return status;
    }

    public List<Map<String, Object>> showItens() {
        return itens;
    }

    public boolean confirmOrder() {
        if (validateCart()) {
            status = "confirmed";
            sendEmailConfirmation();
            return true;
        }
        return false;
    }

    public String sendEmailConfirmation() {
        return "Sending email confirmation . . .";
    }

    public boolean validateCart() {
        return itens.size() > 0;
    }
}
