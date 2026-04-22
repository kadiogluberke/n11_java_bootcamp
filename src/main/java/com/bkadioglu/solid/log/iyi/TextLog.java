package com.bkadioglu.solid.log.iyi;

public class TextLog implements  ILog{
    @Override
    public boolean log(String value) {
        System.out.println(value + " text e kaydedil");
        return true;
    }
}
