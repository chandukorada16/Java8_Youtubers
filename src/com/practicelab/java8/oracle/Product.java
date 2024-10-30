package com.practicelab.java8.oracle;

public class Product {

    private String name;
    private String category;
    private int stockCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public Product(String name, String category, int stockCount) {
        this.name = name;
        this.category = category;
        this.stockCount = stockCount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", stockCount=" + stockCount +
                '}';
    }
}
