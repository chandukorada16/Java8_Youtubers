package com.practicelab.java8.cognizant;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderDetails {
    public static void main(String[] args) {
        List<Order> orders=new ArrayList<>();
        orders.add(new Order("p1",10,15.50));
        orders.add(new Order("p2",5,20.00));
        orders.add(new Order("p1",7,15.50));
        orders.add(new Order("p3",3,10.00));
        orders.add(new Order("p1",4,15.50));
        totalrevenueAverageQuantityOrdered(orders);
    }
    private static void totalrevenueAverageQuantityOrdered(List<Order> orders){
        String targetedProduct="p1";
        double sum = orders.stream()
                .filter(product -> product.getProductId().equals("p1"))
                .mapToDouble(order -> order.getQuantity() * order.getPrice())
                .sum();
        Double avgQuantitySpecific = orders.stream()
                .filter(product -> product.getProductId().equals("p1"))
                .collect(Collectors.averagingDouble(Order::getQuantity));
        System.out.println("Total revenue generate for "+targetedProduct+": "+sum);
        System.out.println("Average Quantity Ordered for product p1: "+avgQuantitySpecific);
    }
}
