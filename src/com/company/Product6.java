package com.company;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Product6 {
    private String type;
    private int price;
    private boolean discount;
    private LocalDateTime date;

    public Product6(String type, int price, boolean discount, LocalDateTime date) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Map<String, List<Product6>> dictionary(List<Product6> products6) {

        Map<String, List<Product6>> list = products6.stream().collect(Collectors.groupingBy(Product6::getType));

        return list;
    }

    @Override
    public String toString() {
        return "Product5{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", date=" + date +
                '}';
    }
}
