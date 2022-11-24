import java.util.Scanner;

public class HariKe3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer inputan = input.nextInt();
        Integer i = 1;
        while (i <= inputan) {

            for (int j = 0; j <i ; j++) {
                System.out.print("* ");
            }
            if (i == inputan) {
                System.out.println();
                for (int k = 1; k < i; k++) {
                    for (int l = i; l > k; l--) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

            }
            System.out.println();
            i++;
        }



//        Scanner input = new Scanner(System.in);
//        Integer inputAngka = input.nextInt();
//        Integer jumlahGanjil = 0;
//        Integer jumlahGenap = 0;
//        for (int i = 0; i < inputAngka; i++) {
//            jumlahGenap += 2*(i+1);
////            System.out.println(2*i);
//            if (i % 2 == 1) {
//                jumlahGanjil += i;
//            }
//        }
////        for (int i = 0; i < inputAngka; i++) {
////            jumlahGenap
////        }
//        System.out.println(jumlahGanjil);
//        System.out.println(jumlahGenap);


//        Scanner input = new Scanner(System.in);
//        int inputan;
//        do {
//            System.out.println("masukkan angka kecuali angka negatip:");
//            inputan = input.nextInt();
////            System.out.println("itu angka " + inputan);
//        } while (inputan >= 0);



//        Scanner input = new Scanner(System.in);
////        int i = 1;
//        System.out.println("masukkan angka kecuali angka 99:");
//        int inputan = input.nextInt();
//        while (inputan != 99) {
//            System.out.println("itu angka " + inputan);
//            inputan = input.nextInt();
////            i++;
//        }



//        System.out.println("1234");
//        System.out.println("1234");
//        System.out.println("1234");
//        System.out.println("1234");



//        int jmlhBaris = 4;
//        for (int i = 1; i <= jmlhBaris; i++) {
//            for (int j = 5; j >= 1; j--) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }



//        int jmlhBaris = 4;
//        for (int i = 0; i <= jmlhBaris; i++) {
//            for (int j = jmlhBaris; j > i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//        for (int i = 7; i > 2 ; i--) {
//            System.out.println(i);
//        }
        
        
        
//        for (int i = 1; i<=10; i++) {
//            if (i % 2 == 1) {
//                System.out.println(i);
//            }
//        }



//        Scanner input = new Scanner(System.in);
//        Integer tanggal = input.nextInt();
//        Integer bulan = input.nextInt();
//        Integer tahun = input.nextInt();
//        switch (bulan) {
//            case 1:
//                System.out.println(tanggal + " Januari " + tahun);
//                break;
//            case 2:
//                System.out.println(tanggal + " Februari " + tahun);
//                break;
//            case 3:
//                System.out.println(tanggal + " Maret " + tahun);
//                break;
//            case 4:
//                System.out.println(tanggal + " April " + tahun);
//                break;
//            case 5:
//                System.out.println(tanggal + " Mei " + tahun);
//                break;
//            case 6:
//                System.out.println(tanggal + " Juni " + tahun);
//                break;
//            case 7:
//                System.out.println(tanggal + " Juli " + tahun);
//                break;
//            case 8:
//                System.out.println(tanggal + " Agustus " + tahun);
//                break;
//            case 9:
//                System.out.println(tanggal + " September " + tahun);
//                break;
//            case 10:
//                System.out.println(tanggal + " Oktober " + tahun);
//                break;
//            case 11:
//                System.out.println(tanggal + " November " + tahun);
//                break;
//            case 12:
//                System.out.println(tanggal + " Desember " + tahun);
//                break;
//            default:
//                System.out.println("Tidak ada bulan " + bulan);
//        }



//        Integer nilai = 20;
//        String result = (nilai > 60) ? "LUSLUS" : (nilai > 40) ? "Boleh" : "gak lulus";
//        System.out.println(result);

        //ternary operator




//        char nilai = 'G';
//        switch (nilai) {
//            default:
//                System.out.println("Input salah");
//                break;
//            case 'A':
//            case 'B':
//                System.out.println("Sangat baik");
//                break;
//            case 'C':
//            case 'D':
//                System.out.println("Cukup baik");
//                break;
//            case 'E':
//                System.out.println("Tidak lulus");
//        }



//        Integer nilai = input.nextInt();
//        if (nilai > 90) {
//            System.out.println("A");
//            return;
//        }
//        if (nilai > 80) {
//            System.out.println("B");
//            return;
//        }
//        if (nilai < 50) System.out.println("E");
    }
}
