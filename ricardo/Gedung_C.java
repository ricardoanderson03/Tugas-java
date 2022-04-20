package com.ricardo;

public class Gedung_C extends Gedung_parikir{
    @Override
    void tampilan2(){
        nama_gedung = "Gedung C";
        lantai_gedung = "lantai 1";
        kapasitas = 30;
        System.out.println("Gedung parkir roda lebih dari empat");
        System.out.println("Nama Gedung : "+nama_gedung);
        System.out.println("Lantai      : "+lantai_gedung);
        System.out.println("Kapasitas   : "+kapasitas);
    }
}
