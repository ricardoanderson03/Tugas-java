package com.ricardo;

public class roda_enam extends Parkir{
    @Override
    void tampilan1(String nama_kendaraan,  String plat_nomor){
        jenis_kendaraan = "Roda enam";
        System.out.println("Jenis kendaraan : "+jenis_kendaraan);
        System.out.println("Nama  kendaraan : "+nama_kendaraan);
        System.out.println("Plat nomer      :"+plat_nomor);
    }
    int tarif(int jam){
        if(jam == 1){
            jml = 6000;
        }else if(jam == 2){
            jml =6000+6000;
        }else if(jam >=3){
            jml = jam * 6000;
        }else{
            jml = 0;
        }
        return jml;
    }
}
