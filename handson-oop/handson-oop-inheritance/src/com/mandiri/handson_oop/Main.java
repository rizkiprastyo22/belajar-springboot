package com.mandiri.handson_oop;

import com.mandiri.handson_oop.shape.Block;
import com.mandiri.handson_oop.shape.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(7.0,3.0);
        System.out.println(rect);
        System.out.println("Keliling persegi panjang = " + rect.getRound());
        System.out.println("Luas persegi panjang = " + rect.getSurface());
        System.out.println();

        Block blok = new Block(3.0, 4.0, 5.0);
        System.out.println(blok);
        System.out.println("Keliling balok = " + blok.getSurface());
        System.out.println("Luas balok = " + blok.getRound());
        System.out.println("Volume balok = " + blok.getVolume());
        System.out.println();

        Rectangle rect1 = new Block(1.0, 2.0, 3.0);
        System.out.println(rect1);
        System.out.println();

        Object object = new Block(2.0, 4.0, 6.0);
        System.out.println(object);
        System.out.println();

        Block block2 = (Block) new  Rectangle(7.0, 5.0);
        System.out.println(block2);
    }
}
