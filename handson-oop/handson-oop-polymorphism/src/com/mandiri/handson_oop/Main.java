package com.mandiri.handson_oop;

public class Main {
    public static void main(String[] args) {
        Hero fanny = new Hero("fanny", 100, 100, 100);
        Hero grock = new Hero("grock", 200, 100, 10);
        Hero franco = new Hero("franco", 150, 100, 10);
        Hero estes = new Hero("estes", 200, 30, 5);

        Monster garaga = new Monster("garaga", 500);

        Tower midTower = new Tower(1000);

        System.out.println(fanny);
        System.out.println(midTower);
        System.out.println("fanny attacked mid tower");
        fanny.attack(midTower);
        System.out.println(midTower);

//        System.out.println(fanny);
//        System.out.println(garaga);
//
//        System.out.println("fanny attacked garaga");
//        fanny.attack(garaga);
//        System.out.println(garaga);

//        System.out.println(fanny);
//        System.out.println(grock);
//        System.out.println(franco);
//        System.out.println(estes);
//        System.out.println();
//
//        System.out.println("fanny serang grock");
//        fanny.attack(grock);
//        fanny.attack(grock);
//        System.out.println(grock);
//        fanny.attack(grock);
//        System.out.println();
//
//        grock.heal(fanny);
//        System.out.println();
//
//        System.out.println("franco kesandung batu");
//        franco.receivedDamage(140);
//        System.out.println(franco);
//        System.out.println();
//
//        System.out.println("estes heal fanny");
//        estes.heal(fanny);
//        System.out.println(fanny);
//        System.out.println(estes);
//        System.out.println();
    }
}
