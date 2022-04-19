package com.ricardo;
import java.util.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        String jenis;
        String nama;
        String no_pol;
        int pilihan1;
        int total_jam;
        Gedung_A gedung1= new Gedung_A();
        Gedung_B gedung2= new Gedung_B();
        Gedung_C gedung3= new Gedung_C();
        roda_dua rod2 = new roda_dua();
        roda_empat rod4 = new roda_empat();
        roda_enam rod6 = new roda_enam();

        System.out.println("1. Gedung A");
        System.out.println("2. Gedung B");
        System.out.println("3. Gedung C");

        System.out.print("Masukan pilihan anda: ");
        pilihan1 = input.nextInt();

        if(pilihan1 == 1){
            gedung1.tampilan2();

            System.out.print("Masukan nama kendaraan    : ");
            nama = input2.nextLine();

            System.out.print("Masukan plat nomer        : ");
            no_pol = input3.nextLine();

            System.out.print("Masukan jumlah jam        : ");
            total_jam = input.nextInt();

            rod2.tampilan1(nama, no_pol);

            System.out.println("\nJumlah tarif parkir     : "+rod2.tarif(total_jam));
        }else if(pilihan1 == 2){
            gedung2.tampilan2();


            System.out.print("Masukan nama kendaraan    : ");
            nama = input2.nextLine();

            System.out.print("Masukan plat nomer        : ");
            no_pol = input3.nextLine();

            System.out.print("Masukan jumlah jam        : ");
            total_jam = input.nextInt();

            rod4.tampilan1(nama, no_pol);

            System.out.println("\nJumlah tarif parkir     : "+rod4.tarif(total_jam));
        }else if(pilihan1 == 3){
            gedung3.tampilan2();

            System.out.print("Masukan nama kendaraan    : ");
            nama = input2.nextLine();

            System.out.print("Masukan plat nomer        : ");
            no_pol = input3.nextLine();

            System.out.print("Masukan jumlah jam        : ");

            total_jam = input.nextInt();

            rod6.tampilan1(nama, no_pol);

            System.out.println("\nJumlah tarif parkir     : "+rod6.tarif(total_jam));
        }else{
            System.out.println("Inputan anda salah");
        }



    }
}



