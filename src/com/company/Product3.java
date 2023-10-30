package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Product3 {
    private String type;
    private int price;
    private boolean discount;


    public Product3(String type, int price, boolean discount) {
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

    public boolean isDiscount() {
        return discount;
    }

    public List<Product3> getCheapProduct(List<Product3> products3, String type) {
        List<Product3> product3 = products3.stream()
                .filter(x -> x.getType().equals("Book") && type.equals("Book"))
                .sorted(Comparator.comparing(Product3::getPrice))
                .findFirst().stream().toList();
        if (product3.isEmpty()) {
            throw new NoSuchElementException("Продукт [категорія: " + type + "] не знайдено");
        }
        return product3;
    }

    @Override
    public String toString() {
        return "Product3{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }


}
