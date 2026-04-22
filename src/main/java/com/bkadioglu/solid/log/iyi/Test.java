package com.bkadioglu.solid.log.iyi;

public class Test {


    public static void main(String[] args)
    {
        // DbLog dbLog = new DbLog();
        // XmlLog xml= new XmlLog();
        TextLog text = new TextLog();
        Logger logger = new Logger(text);
        System.out.println(logger.LogYaz("303 nolu hata kodu oluştu"));
    }
}
