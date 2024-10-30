package com.practicelab.java8.oracle;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductDetails {
    public static void main(String[] args) {
        List<Product> products=new ArrayList<>();
        products.add(new Product("Laptop","Electronics",50));
        products.add(new Product("SmartPhone","Electronics",100));
        products.add(new Product("TV","Electronics",30));
        products.add(new Product("Shampoo","Personal care",200));
        products.add(new Product("Conditioner","Personal care",180));
        products.add(new Product("Bread","Groceries",500));
        products.add(new Product("Milk","Groceries",300));
        categoryAndCalculatateTotalStockCountOfEachCategory(products);
    }
    private static void categoryAndCalculatateTotalStockCountOfEachCategory(List<Product> products){
        Map<String, Integer> catTotalCount = products.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.summingInt(Product::getStockCount)));
        catTotalCount.forEach((category,stock)-> System.out.println("Category: "+category+" Total Stock: "+stock));
    }
}
