package oop;

import java.util.Scanner;

public class Lingkaran {

    static Scanner scan = new Scanner(System.in);

    public static int scanInput(){
        int r;
        System.out.print("Masukkan panjang jari - jari (cm) : ");
        r = scan.nextInt();
        return r;
    }

    public static double hitungLuas(int r){
        final double pi = Math.PI;
        return pi*r*r;
    }

    public static boolean konfirmasi(){
        String konfirmasi;
        System.out.print("Apakah ingin lanjut ?(y/n) : ");
        scan.nextLine();
        konfirmasi = scan.nextLine();
        if(konfirmasi.equalsIgnoreCase("y")){
            return true;
        } else {
            return false;
        }
    }

    public static void doProcess(){
        do{
            System.out.println("-------------------------------------");
            System.out.printf("Luas Lingkaran : %.2f cm^2\n", hitungLuas(scanInput()));
            System.out.println("-------------------------------------");
        } while (konfirmasi());
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("--------- PROGRAM SELESAI -----------");
        System.out.println("-------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        System.out.println("PROGRAM MENGHITUNG LUAS LINGKARAN");
        doProcess();
    }

}