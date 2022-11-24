package com.mandiri.handson_oop;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        Car supar = new Car("supar", "biru");
//        System.out.println(supar);
        Car biro = new Car("biro", "merah");
        Car sebaru = new Car("sebaru","biru");
        biro.engineStart();
        biro.fillFuel(5);
//        System.out.println(biro);
        biro.engineStart();
        System.out.println(sebaru.getName());
        sebaru.setName("Subaru");
        System.out.println(sebaru.getName());

//        supar.cetak();
//        System.out.println(supar.cetakString());


//        Car supar = new Car();
//        supar.name = "Toyoyo supar";
//        supar.color = "white";
//        supar.fuel = 300;

//        System.out.println(supar.name);
//        System.out.println(supar.color);
//        System.out.println(supar.fuel);
    }
}
