package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
    private List<Item> itens;

    public Cart(List<Item> items) {
        this.itens = items;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void addItens(Item item) {
        itens.add(item);
    }

    public boolean validateCart() {
        return itens.size() > 0;
    }
}
