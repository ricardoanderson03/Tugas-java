package com.ricardo;

public class Gedung_A extends Gedung_parikir{
    @Override
    void tampilan2(){
        nama_gedung = "Gedung A";
        lantai_gedung = "lantai 3";
        kapasitas = 50;
        System.out.println("Gedung parkir roda 2");
        System.out.println("Nama Gedung : "+nama_gedung);
        System.out.println("Lantai      : "+lantai_gedung);
        System.out.println("Kapasitas   : "+kapasitas);
    }
}
