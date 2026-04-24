package com.bkadioglu.solid.log.iyi;

public class TextLog implements  ILog{
    @Override
    public String log(String value) {
        return value + " text e kaydedil";

    }
}
