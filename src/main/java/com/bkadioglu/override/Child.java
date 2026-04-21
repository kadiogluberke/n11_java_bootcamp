package com.bkadioglu.override;

public class Child  extends Parent{


    public Child()
    {
        super.yaz();
    }

    public void yaz()
    {
        System.out.println("child sınfındaki yaz metodu çağrıldı");
    }
}
