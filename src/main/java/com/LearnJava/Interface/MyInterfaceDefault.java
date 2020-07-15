package com.LearnJava.Interface;

/**
 *
 从Java 8 开始，接口允许定义默认方法
 格式：
 public default 返回值 方法名称（参数列表）{
    方法体
 }
 备注：默认方法，可以解决接口升级的问题
 */
public interface MyInterfaceDefault {

    //原始抽象方法
    public abstract void methodAbs();

    //新增抽象方法,会导致原本被实现的类报错
    //public abstract void methodAbs2();

    //新的方法，改成默认方法,实现类不报错，如何实现？新建实现类
    public default void methodDefault(){
        System.out.println("新增方法");
    }
}
