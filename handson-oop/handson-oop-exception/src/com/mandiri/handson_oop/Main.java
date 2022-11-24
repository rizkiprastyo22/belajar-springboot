package com.mandiri.handson_oop;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("START");
        try {
            TestException testException = new TestException();
            Integer[] arr = {1,2,3,4,5,6};
            testException.cigarettePurchase(4);

//            testException.divideNumber(5);
//            testException.printArr(arr);
        } catch (Exception e) {
            System.out.println(e);
        }


        menu();
        System.out.println("FINISH");

//        TestException testException = new TestException();
    }

    private static void menu() {
        System.out.println("=== MENU ===");
    }
}
