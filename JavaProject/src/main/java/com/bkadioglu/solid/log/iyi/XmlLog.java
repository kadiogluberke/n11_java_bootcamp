package com.bkadioglu.solid.log.iyi;

public class XmlLog implements  ILog{
    @Override
    public String log(String value) {
        return value + " xml  ee kaydedildi";

    }
}