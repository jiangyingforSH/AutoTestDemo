package com.LearnJava.Interface;

public class MyInterfaceDefaultBImpl implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，B，default");
    }
    @Override
    public void methodDefault(){
        System.out.println("B重写了默认方法");
    }
}
