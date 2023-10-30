package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Product1 product1 = new Product1("Book",300);
//        Product1 product2 = new Product1("Apple",150);
//        Product1 product3 = new Product1("Book",350);
//        Product1 product4 = new Product1("Car",500);
//        List<Product1> list = new ArrayList<>();
//        list.add(product1);
//        list.add(product2);
//        list.add(product3);
//        list.add(product4);
//        list = product1.getProducts(list);
//        System.out.println(list);

//        Product2 product1 = new Product2("Book",100,true);
//        Product2 product2 = new Product2("Apple",25,true);
//        Product2 product3 = new Product2("Book",200,false);
//        Product2 product4 = new Product2("Sugar",150,true);
//        List<Product2> list = new ArrayList<>();
//        list.add(product1);
//        list.add(product2);
//        list.add(product3);
//        list.add(product4);
//        list = product1.getDiscountProducts(list);
//        System.out.println(list);

//        Product3 product1 = new Product3("Book",100,true);
//        Product3 product2 = new Product3("Apple",25,true);
//        Product3 product3 = new Product3("Book",200,false);
//        Product3 product4 = new Product3("Sugar",150,true);
//        List<Product3> list = new ArrayList<>();
//        list.add(product1);
//        list.add(product2);
//        list.add(product3);
//        list.add(product4);
//        list = product1.getCheapProduct(list, "Book");
//        System.out.println(list);

//        LocalDateTime localDateTime1 = LocalDateTime.of(2014, 9, 19, 14, 5);
//        LocalDateTime localDateTime2 = LocalDateTime.of(2016, 9, 19, 14, 5);
//        LocalDateTime localDateTime3 = LocalDateTime.of(2019, 9, 19, 14, 5);
//        LocalDateTime localDateTime4 = LocalDateTime.of(2023, 9, 19, 14, 5);
//        Product4 product1 = new Product4("apple",100,true,localDateTime1);
//        Product4 product2 = new Product4("banana",50,true,localDateTime2);
//        Product4 product3 = new Product4("cup",150,true,localDateTime3);
//        Product4 product4 = new Product4("orange",90,true,localDateTime4);
//        List<Product4> list = new ArrayList<>();
//        list.add(product1);
//        list.add(product2);
//        list.add(product3);
//        list.add(product4);
//        list = product1.getByDate(list);
//        System.out.println(list);

//        LocalDateTime localDateTime1 = LocalDateTime.of(2023, 9, 19, 14, 5);
//        LocalDateTime localDateTime2 = LocalDateTime.of(2016, 9, 19, 14, 5);
//        LocalDateTime localDateTime3 = LocalDateTime.of(2023, 9, 19, 14, 5);
//        LocalDateTime localDateTime4 = LocalDateTime.of(2023, 9, 19, 14, 5);
//
//        Product5 product1 = new Product5("Book",50,true,localDateTime1);
//        Product5 product2 = new Product5("banana",50,true,localDateTime2);
//        Product5 product3 = new Product5("cup",150,true,localDateTime3);
//        Product5 product4 = new Product5("Book",15,true,localDateTime4);
//        List<Product5> list = new ArrayList<>();
//        list.add(product1);
//        list.add(product2);
//        list.add(product3);
//        list.add(product4);
//        System.out.println(product1.calculateProducts(list));

        LocalDateTime localDateTime1 = LocalDateTime.of(2014, 9, 19, 14, 5);
        LocalDateTime localDateTime2 = LocalDateTime.of(2016, 9, 19, 14, 5);
        LocalDateTime localDateTime3 = LocalDateTime.of(2023, 9, 19, 14, 5);
        LocalDateTime localDateTime4 = LocalDateTime.of(2023, 9, 19, 14, 5);

        Product6 product1 = new Product6("Book",50,true,localDateTime1);
        Product6 product2 = new Product6("banana",50,true,localDateTime2);
        Product6 product3 = new Product6("cup",150,true,localDateTime3);
        Product6 product4 = new Product6("Book",15,true,localDateTime4);
        List<Product6> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        System.out.println(product1.dictionary(list));
    }

}

