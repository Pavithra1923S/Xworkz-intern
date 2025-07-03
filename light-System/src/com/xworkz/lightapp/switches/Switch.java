package com.xworkz.lightapp.switches;

public interface Switch {
    void on();
    void off();
   default void something(){

    }
    static void some(){
       
    }

}
