package com.bkadioglu;

import com.bkadioglu.interfaces.IDinle;

public class Baba extends Insan implements IDinle {

    @Override
    public void dinle(String adi) {
        System.out.println(adi + " dinliyor");
    }

}
