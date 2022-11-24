import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        String peran = input.nextLine();
        if (nama.isEmpty() && peran.isEmpty()) {
            System.out.println("Nama dan Peran Harus Di Isi");
        } else if (peran.isEmpty()) {
            System.out.println("Peran Harus Di Isi");
        } else if (nama.isEmpty()) {
            System.out.println("Nama Harus Di Isi");
        } else if (peran == "Superhero") {
            System.out.printf("Selamat Datang %s %s, Kalahkan Semua Monster Di Muka Bumi", peran, nama);
        } else if (peran == "Monster") {
            System.out.printf("Selamat Datang %s %s, Hancurkan Semua Superhero Yang Ada", peran, nama);
        } else {
            System.out.printf("Selamat Datang %s, Pilih Peranmu Untuk Melanjutkan Game Ini", nama);
        }
    }
}

//        if (jam < 0 || jam > 24) {
//            System.out.println("WAKTU HANYA 24 JAM");
//        } else if ((jam >= 8 && jam <=12) || (jam >= 14 && jam <= 17)) {
//            System.out.println("JAM BELAJAR");
//        } else {
//            System.out.println("JAM ISTIRAHAT");
//        }





//        Integer a=2;
//        Integer b=8;
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println(a);
//        System.out.println(b);


//        Scanner input = new Scanner(System.in);
//        Integer panjang;
//        Integer lebar;
//        Integer tinggi;
//        panjang = input.nextInt();
//        input.nextLine();
//        lebar = input.nextInt();
//        input.nextLine();
//        tinggi = input.nextInt();
//        Integer luasBalok = (2*panjang*lebar) + (2*lebar*tinggi) + (2*tinggi*panjang);
//        Integer volumeBalok = panjang * lebar * tinggi;
//        System.out.println(luasBalok);
//        System.out.println(volumeBalok);



//        System.out.println(args[2]);
//        System.out.println("Hello World");
//        String name = "pak";
//        int number = 4;
//        System.out.printf("halo %s saya aslinya %d orang\n", name, number);
//        System.out.println(number++);
//        System.out.println(number++);
//        System.out.println(number);
//
//        int a = 2;
//        int b = 3;
//        int c = a * b;
//        System.out.printf("nilai hasil perkalian dari %d dan %d adalah %d\n", a,b,c);
//
//        a %= -2;
//        System.out.println(a);

//        Scanner input = new Scanner(System.in);
//        Integer a;
//        Integer b;
//        System.out.println("Kalkulator a + b ya ges yaa");
//        System.out.print("input nilai a nya bang:");
//        a = input.nextInt();
//        System.out.print("nah terus yang b sekarang:");
//        b = input.nextInt();
//        Integer result = a + b;
//        System.out.printf("Jadiiii %d + %d = %d yeaaay", a, b, result);
//        System.out.println(result);



//        String nama;

//        String alamat;
//        System.out.println("Input biodata ya ges yaa");
//        System.out.print("Full Name:");
//        nama = input.nextLine();
//        System.out.print("Age:");
//        umur = input.nextInt();
//        input.nextLine();
//        System.out.print("Address:");
//        alamat = input.nextLine();
//        System.out.printf("My Name is %s, iam %d years old, and iam from %s", nama, umur, alamat);
//        System.out.println(result);


//        Scanner input = new Scanner(System.in);
//
//        Integer angka = input.nextInt();
//        if (angka > 90) {
//            System.out.println("A");
//        } else if (angka > 80) {
//            System.out.println("B");
//        } else {
//            System.out.println("E");
//        }

