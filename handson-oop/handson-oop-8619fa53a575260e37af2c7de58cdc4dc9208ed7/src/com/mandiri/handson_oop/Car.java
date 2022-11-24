package com.mandiri.handson_oop;

public class Car {
    //attribut / property
    private String name;
    private   String color;
    private int fuel;

//    public Car(String name, String color, int fuel) {
//        this.name = name;
//        this.color = color;
//        this.fuel = fuel;
//    }

    //SHORTCUT
    //alt + insert -> constructor -> select all attribute
    public Car(String name, String color) {
        this.name = name;
        this.color = color;
        this.fuel = 0;
    }

    public Car() {

    }

    public void engineStart() {
        if (this.fuel > 0) {
            System.out.println("Ngeeeengggg...");
        } else {
            System.out.println("ngisi bensin dulu kali yak?");
        }
    }

    public void fillFuel(int fuel) {
        this.fuel = this.fuel + fuel;
    }

//    public void cetak() {
//        System.out.println(this.name + ", " + this.color + ", " +this.fuel);
//    }
//
//    public String cetakString() {
//        return this.name + ", " + this.color + ", " +this.fuel;
//    }

    //SHORTCUT
    //alt+insert -> to string
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", fuel=" + fuel +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
