package com.ricardo;

public class Gedung_B extends Gedung_parikir{
    @Override
    void tampilan2(){
        nama_gedung = "Gedung B";
        lantai_gedung = "lantai 2";
        kapasitas = 50;
        System.out.println("Gedung parkir roda 4");
        System.out.println("Nama Gedung : "+nama_gedung);
        System.out.println("Lantai      : "+lantai_gedung);
        System.out.println("Kapasitas   : "+kapasitas);
    }
}
