package com.mandiri.handson_oop;

import java.io.*;

public class Main {
    final static File fileLocation = new File("coba.txt");

    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLocation));
            while (true) {
                String text = bufferedReader.readLine();
                if (text == null) break;
                System.out.println(text);
            }



//            FileReader fileReader = new FileReader(fileLocation);
//            while (true) {
//                int ascii = fileReader.read();
//                if (ascii == -1) break;
//                System.out.print((char) ascii);
//            }



//            FileInputStream fileInputStream = new FileInputStream(fileLocation);
////            String text = String.valueOf((char) fileInputStream.read());
//            while (true) {
//                int ascii = fileInputStream.read();
//                if (ascii == -1) break;
//                System.out.print((char) ascii);
//            }
////            System.out.println(text);


//            BufferedWriter fos = new BufferedWriter(new FileWriter(fileLocation, false));
//            fos.write("Asli bre? \n");
//            fos.newLine();
//            fos.write("Asliii sih breee");
//            fos.close();


//            FileWriter fos = new FileWriter(fileLocation);
//            fos.write("Asli Bre");
//            fos.close();


//            FileOutputStream fos = new FileOutputStream(fileLocation);
//            fos.write(84);
//            fos.write(105);
//            fos.write(116);
//            fos.write(97);
//            fos.write(110);
//            fos.write(32);
//
//            fos.write(107);
//            fos.write(105);
//            fos.write(110);
//            fos.write(97);
//            fos.write(110);

//            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}