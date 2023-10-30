package com.company;

import java.time.LocalDateTime;
import java.util.List;

public class Product4 {
    private String type;
    private int price;
    private boolean discount;
    private LocalDateTime date;

    public Product4(String type, int price, boolean discount, LocalDateTime date) {
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

    public List<Product4> getByDate(List<Product4> products4) {
        List<Product4> product3 = products4.stream().skip(products4.size() - 3).toList();
        return product3;
    }

    @Override
    public String toString() {
        return "Product4{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", date=" + date +
                '}';
    }
}
