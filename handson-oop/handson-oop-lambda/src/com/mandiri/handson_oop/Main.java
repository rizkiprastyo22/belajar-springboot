package com.mandiri.handson_oop;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        HashMap<String, String> trraineeDDP = new HashMap<>();
//        trraineeDDP.put("nama", "Ikhsan");
//        trraineeDDP.put("address", "bandung");
//        trraineeDDP.put("phone", "0821");

//        System.out.println(trraineeDDP);
//        System.out.println(trraineeDDP.get("phone"));
//        System.out.println(trraineeDDP.keySet());
//        System.out.println(trraineeDDP.values());

//        for (String key: trraineeDDP.keySet()) {
//            System.out.print(key + ": ");
//            System.out.println(trraineeDDP.get(key));
//        }

//        List<Integer> number = Arrays.asList(1,2,3,4,5,6);
//
//        Iterator<Integer> integerIterator = number.iterator();
//        while (integerIterator.hasNext()) {
//            System.out.println(integerIterator.next());
//        }

        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);

//        number.forEach(System.out::println);

//        number.stream().filter((num) -> num % 2 != 0).forEach(System.out::println);
//        Stream numberResult = number.stream().filter((num) -> num % 2 != 0);
//        numberResult.forEach(System.out::println);

        number.stream().map((num) -> num * 2).forEach(System.out::println);








//        for (Integer num: number) {
//            System.out.println(num);
//        }

//        number.forEach((num) -> System.out.println(num));
//
//        trraineeDDP.forEach((key, value) -> System.out.println(key + " " + value));
//
//
//        Example example = new Example() {
//
//            @Override
//            public void printName(String name) {
//                System.out.println("Hello " + name);
//            }
//        };
//
//        Example example1 = (String name) -> System.out.println("Hello " + name);
//        example.printName("Saya");
//        example1.printName("Dia");
//
    }
}

//interface Example {
//    void printName(String name);
//}