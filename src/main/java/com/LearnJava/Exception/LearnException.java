package com.LearnJava.Exception;

import java.util.Scanner;

/**
 * 异常处理
 */
public class LearnException {
    public static void main(String[] args) {

        if (convertString().equals("test")){
            throw new NullPointerException("str不存在");
            //System.out.println("true");
        }
    }

    static String convertString(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        return String.valueOf(str);
    }
}
