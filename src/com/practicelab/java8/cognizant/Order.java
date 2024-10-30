package com.practicelab.java8.cognizant;

public class Order {
    private String productId;
    private int quantity;
    private double price;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Order(String productId, int quantity, double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productId='" + productId + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
