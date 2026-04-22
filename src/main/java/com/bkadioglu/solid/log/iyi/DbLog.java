package com.bkadioglu.solid.log.iyi;

public class DbLog implements  ILog{
    @Override
    public boolean log(String value) {

        System.out.println(value + " db ye kaydedildi");
        return true;
    }
}