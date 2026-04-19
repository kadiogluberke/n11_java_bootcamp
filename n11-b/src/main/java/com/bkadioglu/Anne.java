package com.bkadioglu;

import com.bkadioglu.interfaces.IDinle;
import com.bkadioglu.interfaces.IOku;
import com.bkadioglu.interfaces.IYaz;

public class Anne extends Insan implements IOku, IYaz, IDinle{

    @Override
    public void oku(String adi) {
        System.out.println(adi + " okuyor");
    }

    @Override
    public void yaz(String adi) {
        System.out.println(adi + " yazıyor");
    }


    @Override
    public void dinle(String adi) {
        System.out.println(adi + " dinliyor");
    }
}