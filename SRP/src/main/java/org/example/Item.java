package org.example;

public class Item {
    private String name;
    private Float value;

    public Item(String name, Float value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Float getValue() {
        return value;
    }
}
