package com.LearnJava.Interface;

public class MyInterfaceDefaultAImpl implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，A，default");
    }
}
