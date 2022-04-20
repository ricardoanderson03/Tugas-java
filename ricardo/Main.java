package com.ricardo;
import java.util.*;
import java.util.Scanner;
public class Main {
    static void info_gedung(){
        Scanner input = new Scanner(System.in);
        int pilihan;
        Gedung_A gedung1= new Gedung_A();
        Gedung_B gedung2= new Gedung_B();
        Gedung_C gedung3= new Gedung_C();
        Area1_A area_1a= new Area1_A();
        Area2_A area_2a= new Area2_A();
        Area1_B area_1B= new Area1_B();
        Area2_B area_2B= new Area2_B();
        Area1_C area_1c= new Area1_C();
        Area2_C area_2c= new Area2_C();

        System.out.println("\nInfo gedung parkir");
        System.out.println("1. Gedung A");
        System.out.println("2. Gedung B");
        System.out.println("3. Gedung C");

        System.out.print("Masukan pilihan anda: ");
        pilihan = input.nextInt();
        if(pilihan == 1){

            gedung1.tampilan2();

            area_1a.tampilan3();

            area_2a.tampilan3();

        }else if(pilihan == 2){

            gedung2.tampilan2();

            area_1B.tampilan3();

            area_2B.tampilan3();

        }else if(pilihan == 3){
            gedung3.tampilan2();

            area_1c.tampilan3();

            area_2c.tampilan3();

        }else{
            System.out.println("Inputan anda salah");
        }
    }

    static void tarif(){
        int pilihan;
        int total_jam;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        String jenis;
        String nama;
        String no_pol;
        roda_dua rod2 = new roda_dua();
        roda_empat rod4 = new roda_empat();
        roda_enam rod6 = new roda_enam();

        System.out.println("\nPerhitungan tarif");
        System.out.println("1. Roda 2");
        System.out.println("2. Roda 4");
        System.out.println("3. Roda 6");
        System.out.print("Masukan pilihan anda: ");
        pilihan = input.nextInt();
        if(pilihan == 1){
            System.out.print("Masukan nama kendaraan    : ");
            nama = input2.nextLine();

            System.out.print("Masukan plat nomer        : ");
            no_pol = input3.nextLine();

            System.out.print("Masukan jumlah jam        : ");
            total_jam = input.nextInt();

            rod2.tampilan1(nama, no_pol);

            System.out.println("\nJumlah tarif parkir     : "+rod2.tarif(total_jam));
        }else if(pilihan == 2){
            System.out.print("Masukan nama kendaraan    : ");
            nama = input2.nextLine();

            System.out.print("Masukan plat nomer        : ");
            no_pol = input3.nextLine();

            System.out.print("Masukan jumlah jam        : ");
            total_jam = input.nextInt();

            rod4.tampilan1(nama, no_pol);

            System.out.println("\nJumlah tarif parkir     : "+rod4.tarif(total_jam));
        }else if(pilihan == 3){

            System.out.print("Masukan nama kendaraan    : ");
            nama = input2.nextLine();

            System.out.print("Masukan plat nomer        : ");
            no_pol = input3.nextLine();

            System.out.print("Masukan jumlah jam        : ");

            total_jam = input.nextInt();

            rod6.tampilan1(nama, no_pol);

            System.out.println("\nJumlah tarif parkir     : "+rod6.tarif(total_jam));
        }else{

        }
    }
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        int pilihan, ulang;
        System.out.println("INFO PARKIAN");
        System.out.println("1. Info gedung");
        System.out.println("2. Info tarif");
        System.out.print("Masukan pilihan anda: ");
        pilihan = input.nextInt();


            pilihan = input.nextInt();
            if(pilihan == 1){
                info_gedung();
            }else if(pilihan == 2){
                tarif();
            }else{
                System.out.println("Inputan anda salah");
            }
    }
}



