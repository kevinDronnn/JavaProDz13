package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Product2 {
    private String type;
    private int price;
    private boolean discount;

    public Product2() {
    }

    public Product2(String type, int price, boolean discount) {
        this.type = type;
        this.price = price;
        this.discount = discount;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public boolean getDiscount() {
        return discount;
    }

    public List<Product2> getDiscountProducts(List<Product2> products2) {
        List<Product2> resultList = products2.stream().filter(x -> x.getType().equals("Book"))
                .filter(s -> s.getDiscount() != false)
                .map(product -> new Product2(product.getType(),
                        product.getPrice() - (product.getPrice() * 10 / 100), product.getDiscount()))
                .collect(Collectors.toList());
        return resultList;
    }

    @Override
    public String toString() {
        return "Product2{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
