package enamenam.Tugas;

//Created by 21343043_Fadhil Nugraha Wikarya

import java.util.Scanner;

public class Tugas2b {
    public static void main(String[] args) {
        Scanner inputNilai = new Scanner(System.in);

        int angka;

        System.out.print("Masukkan Angka: ");
        angka = inputNilai.nextInt();

        switch (angka) {
            case 1:
                System.out.println("Satu");
                break;
            case 2:
                System.out.println("Dua");
                break;
            case 3:
                System.out.println("Tiga");
                break;
            case 4:
                System.out.println("Empat");
                break;
            case 5:
                System.out.println("Lima");
                break;
            case 6:
                System.out.println("Enam");
                break;
            case 7:
                System.out.println("Tujuh");
                break;
            case 8:
                System.out.println("Delapan");
                break;
            case 9:
                System.out.println("Sembilan");
                break;
            case 10:
                System.out.println("Sepuluh");
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }
        inputNilai.close();
    }
}
