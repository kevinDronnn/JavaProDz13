package com.company;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class Product5 {
    private String type;
    private int price;
    private boolean discount;
    private LocalDateTime date;

    public Product5(String type, int price, boolean discount, LocalDateTime date) {
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

    public int calculateProducts(List<Product5> products4) {
        LocalDateTime localDateTime =
                LocalDateTime.now();
        int result = products4.stream()
                .filter(type -> type.getType().equals("Book"))
                .filter(price -> price.getPrice() <= 75)
                .filter(x -> x.getDate().getYear() == localDateTime.getYear())
                .mapToInt(x -> x.getPrice()).sum();
        return result;
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
