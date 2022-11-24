import java.util.Arrays;

public class HariKe4 {
    public static void main(String[] args) {
//        sayHi("titan", "MANUNGG");
//        System.out.println(tambwah(2,3));
//        System.out.println(multiply(10,15));
//        String kata = "test";
//        System.out.println(kata.length());
        System.out.println(hitungKata("test ting nih"));
//        kata.substring(1)
    }

    public static int hitungKata(String kata) {
        int jumlahKata = 1;
        for (int i = 0; i < kata.length() - 1; i++) {
            if (kata.charAt(i) == ' ') {
                jumlahKata++;
            }
        }
        return jumlahKata;
    }



//    public static int multiply(int num1, int num2) {
//        return num1 * num2;
//    }



//    public static void sayHi(String nama, String kota) {
//        System.out.println("halo saya " + nama + " ,saya dari " + kota);
//    }
//
//    public static int tambwah(int a, int b) {
//        return a + b;
//    }



//        int[] arr = {5,2,3,4,2,1,0};
////        int[] arr = {5,2,3};
//        int temp = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - 1; j++) {
//
////                System.out.println("===");
////                System.out.println(j);
////                System.out.println(j+1);
//                if (arr[j] > arr[j+1]) {
//
////                    System.out.println(temp);
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//
//        for (int arey: arr) {
//            System.out.print(arey);
//        }



//        int[] arr = {5,2,3,4,2,1,0};
////        int[] arr = {5,2,3};
//        int temp = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i+1; j < arr.length; j++) {
////                System.out.println("===");
////                System.out.println(i);
////                System.out.println(j);
//                if (arr[i] > arr[j]) {
////                    System.out.println(temp);
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//
//        for (int arey: arr) {
//            System.out.print(arey);
//        }



//        Integer[][] number = {{1,2,3}, {4,5,6,7,8}, {7,8,9}};
////        System.out.println(number[0][2]);
////        System.out.println(number.length);
//        for (int i = 0; i < number.length; i++) {
//            for (int j = 0; j < number[i].length ; j++) {
//                System.out.print(number[i][j]);
//            }
//            System.out.println();
//        }



//        int[] a = {1,2,3};
////        int[] b = a;
//        int[] b = Arrays.copyOf(a, 5);
//        b[1] = 7;
//
//        for (int nA: a) {
//            System.out.print(nA);
//        }
//        System.out.println();
//
//        for (int nB: b) {
//            System.out.print(nB);
//        }

//        System.out.println("4");
//        System.out.println("5");
//        System.out.println("6");


//        Integer [] numbers = {1,2,3,4,5,6};
//        Integer [] anotherNumbers = {4,5,6,7,8,9,10};
//        /* taruh code disini*/
//        for (int num: numbers) {
//            for (int anotherNum: anotherNumbers) {
//                if (num == anotherNum) System.out.println(num);
//            }
//        }




//        String[] nama = new String[5];
//        System.out.println(nama[0] = "Syamsul");
//        System.out.println(nama[1] = "Thanos");
//        System.out.println(nama[2] = "Patrick");
//        System.out.println(nama[3] = "Asep");
//        System.out.println(nama[4] = "Kabur");
//        nama[5] = "ngisi nama";

//        Integer[] angka = {0, 1, 2, 3, 4};
//        System.out.println(angka[0] + angka[1] * angka[2]);

//        for (int i = 0; i < angka.length; i++) {
//            System.out.println(angka[i]);
//        }

//        angka[0].doubleValue();
//
//        for (int ang: angka) {
//            System.out.println(ang);
//        }

//    }
}
