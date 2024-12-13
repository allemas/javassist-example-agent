package com.byteprofile;
import com.sun.tools.attach.VirtualMachine;

public class Main {
    public static void main(String[] args) throws Exception {
        MyEngines engine = MyEngines.build();
        engine.start();
    }
}