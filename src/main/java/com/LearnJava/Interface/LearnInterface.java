package com.LearnJava.Interface;

/**
 *
 1. 接口不能直接使用，需要有实现类
 2. 接口实现类必须覆盖(重写)接口中所有的抽象方法
 实现：一般，创建xxxImpl.class实现，去掉abstract关键字，加上方法体大括号，
 使用：创建实现类的对象使用

 注意事项：
 如果实现类并没有覆盖重写接口所有抽象方法，那么实现类自己就必须是抽象类

 接口默认方法
 1. 接口默认方法，可以通过任意接口实现类，直接调用
 2. 接口默认方法，也可以被重写
 */
public class LearnInterface {

    public static void main(String[] args) {
        //不能直接new接口对象使用

        //创建实现类的对象使用
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs();
        impl.methodAbs1();

        //接口默认方法
        MyInterfaceDefaultAImpl implA = new MyInterfaceDefaultAImpl();
        implA.methodAbs();//调用抽象方法，实际运行的是右侧实现类，new的谁就运行谁

        //调用默认方法，如果实现类中没有，会向上找接口
        implA.methodDefault();//调用了默认方法

        MyInterfaceDefaultBImpl implB = new MyInterfaceDefaultBImpl();
        implB.methodAbs();
        implB.methodDefault();//重写的默认方法
    }
}
