package com.bkadioglu;

public class Main {
    public static void main(String[] args) {


        //ClassIsmi nesneAdi = new ClassIsmi();

        Insan i = new Insan();
        i.ad = "Berke";
        i.soyad = "Kadioglu";
        i.yas = 27;
        i.maas = 3.14;
        i.cinsiyet = true;
        i.uyu();

        Anne a = new Anne();
        a.ad = "Ozbin";
        a.soyad = "Kadioglu";
        a.ekranaYaz(a.ad,a.soyad);
        a.oku(a.ad);
        a.yaz(a.ad);
        a.dinle(a.ad);

        Baba b = new Baba();
        b.ad = "Hurriyet";
        b.soyad = "Kadioglu";
        b.ekranaYaz(b.ad,b.soyad);
        b.dinle(b.ad);
        
        Cocuk c = new Cocuk();
        c.ad = "Ela";
        c.soyad = "Kadioglu";
        c.ekranaYaz(c.ad,c.soyad);


        AkilliCocuk ak = new AkilliCocuk();
        ak.ad = "Hakan";
        ak.soyad = "Yılmaz";
        ak.sifat = "Akıllıdır";
        ak.adSoyadSifatYaz(ak.ad,ak.soyad,ak.sifat);



        UsluCocuk us = new UsluCocuk();
        us.adSoyadSifatYaz("Mehmet","Yıldız","Usludur");


    }
}