package com.company;

import java.time.Clock;
import java.util.*;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        List<Laptop> lap = new ArrayList<Laptop>();
        lap.add(new Laptop(1, "hp15", 5, "hp"));
        lap.add(new Laptop(2, "ln15", 10, "lenovo"));
        lap.add(new Laptop(3, "ln", 16, "Apple"));
        lap.add(new Laptop(4, "access", 32, "Dell"));/*
        Consumer<String> consumer1 = new Consumer<String>() {

            @Override
            public void accept(String country) {
                System.out.println(country);
            }
        };*/
        Consumer<String> consumer2 = country -> System.out.println(country);
        //Comparator<Laptop> com = (p1,p2)

       /* Comparator<Laptop> com = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop m1, Laptop m2) {
                return m1.getBrand().compareTo(m2.getBrand());
            }
        };*/
        Collections.sort(lap, (p1, p2) -> {
            return p1.getBrand().compareTo(p2.getBrand());
        });
        lap.sort(Comparator.comparing(Laptop::getBrand));
        System.out.println("Print using Lambda Expression: ");
        lap.forEach(element -> { System.out.println(element);});

    }
}
