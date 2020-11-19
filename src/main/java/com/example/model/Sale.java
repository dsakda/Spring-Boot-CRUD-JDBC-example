package com.example.model;

public class Sale {

    private int Id;
    private String item;
    private int quantity;
    private float amount;

    public Sale() {
    }

    public Sale(int id, String item, int quantity, float amount) {
        Id = id;
        this.item = item;
        this.quantity = quantity;
        this.amount = amount;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
