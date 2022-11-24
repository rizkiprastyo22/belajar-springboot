package com.mandiri.handson_oop;

import com.mandiri.handson_oop.shape.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(10);

        for (Integer number: arrayList) {
            System.out.println(number);
        }

//        HashSet<Integer> integerHashSet = new HashSet<>();
//        integerHashSet.add(1);
//        integerHashSet.add(5);
//        integerHashSet.add(3);
//        integerHashSet.add(1);
//        integerHashSet.add(10);
//
//        integerHashSet.remove(10);
//        System.out.println(integerHashSet.size());
//        System.out.println(integerHashSet.contains(11));
//
//        for (Integer num: integerHashSet) {
//            System.out.println(num);
//        }
//        integerHashSet.clear();

//        Set<Circle> circleSet = new HashSet<>();
//        circleSet.add(new Circle(10.0));
//        circleSet.add(new Circle(7.0));
//        circleSet.add(new Circle(9.0));
//        circleSet.add(new Circle(3.0));
//        circleSet.add(new Circle(8.0));
//        circleSet.add(new Circle(10.0));
//        System.out.println(circleSet);
    }
}
