package enamenam.Latihan;

import java.util.Scanner;

// Created by 21343043_Fadhil Nugraha Wikarya

public class PercabanganIFELSE {
    public static void main(String[] args) {
        double total_pembelian, diskon = 0;

        Scanner dataMasuk = new Scanner(System.in);
        System.out.print("Masukan Total Pembelian: Rp ");
        total_pembelian = dataMasuk.nextDouble();

        if (total_pembelian >= 50000)
            diskon = 0.1 * total_pembelian;
        else
            diskon = 0.02 * total_pembelian;
        
        System.out.println("Besarnya diskon : Rp " + diskon);    
    }
}