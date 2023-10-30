package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Product1 {
    private String type;
    private int price;

    public Product1(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public List<Product1> getProducts(List<Product1> products1) {
        List<Product1> resultList = products1.stream()
                .filter(x -> x.getType().equals("Book"))
                .filter(y -> y.getPrice() > 250)
                .collect(Collectors.toList());
        return resultList;
    }

    @Override
    public String toString() {
        return "Product1{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
