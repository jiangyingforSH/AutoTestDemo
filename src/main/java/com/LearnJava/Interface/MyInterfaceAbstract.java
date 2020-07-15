package com.LearnJava.Interface;

/**
 *
 任何版本Java中，接口都能定义抽象方法

 格式：
 public abstract 返回值类型 方法名称（参数列表）

 注意：
 1. 接口当中的抽象方法，修饰符必须是两个固定的关键字：public、abstract
 2. 这两个关键字修饰符，可以选择性的省略
 */

public interface MyInterfaceAbstract {

    public abstract void methodAbs();

    abstract void methodAbs1();

    public void methodAbs2();

    void methodAbs3();
}
