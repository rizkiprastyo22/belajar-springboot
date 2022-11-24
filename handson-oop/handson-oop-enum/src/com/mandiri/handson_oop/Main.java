package com.mandiri.handson_oop;

public class Main {
    public static void main(String[] args) {
        Gender gender = Gender.FEMALE;
        System.out.println(gender);

        switch (gender) {
            case MALE:
                System.out.println("Dia lakik");
            case FEMALE:
                System.out.println("Dia perempuan");
        }

        System.out.println(Gender.FEMALE.ordinal());
        System.out.println(Gender.values()[1]);

        for (Gender g: Gender.values()) {
            System.out.println(g);
        }

    }
}
