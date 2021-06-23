package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.lang.System.*;

public class StreamApiExamples {

    public static void main(String[] args) {

        //List<Integer> list = List.of(1, 3, 5, 6, 7, 11, 15, 12, 18, 20);
        List<Integer> list2 = new ArrayList<Integer>();
        List<String> cities = Arrays.asList("London", "HongKong", "Paris", "NewYork");
        List<String> toUpperList=cities.stream().filter(i->i.startsWith("L")).collect(Collectors.toList());
        
        out.println("Original list : "+toUpperList);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
       // int sum = numbers.stream().filter(w -> w%2 == 0).mapToInt(w -> w+w).sum();
      //  System.out.println(sum);
        List<Integer> squares = numbers.stream().map(i -> i * i * i).collect(Collectors.toList());
        out.println(squares);

    }

}
