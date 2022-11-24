package com.mandiri.handson_oop;

import com.mandiri.handson_oop.constants.Constants;

public class TestException {
    public void printArr(Integer[] arr) throws ArrayIndexOutOfBoundsException {
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void divideNumber(Integer number) {
        int c = number/0;
        System.out.println(c);
    }

    public void cigarettePurchase(Integer age) throws ExampleCustomException {
        if (age < 17) {
            throw new ExampleCustomException(Constants.EXCEPTION_MESSAGE);
        }
    }
}
