package com.bkadioglu.override;

public class Test {

    public static void main(String[] args)
    {
        Child c = new Child();
        Child c1 = new Child();
        // Child c2 = new Child();
        
        c.yaz();
        c1.yaz();
    }
}