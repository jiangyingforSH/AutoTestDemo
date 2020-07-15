package com.LearnJava.Exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class LearnSLF4JForLog {
    final Logger logger = LoggerFactory.getLogger(LearnSLF4JForLog.class);

    @Test
    public void test () {
        logger.info("test开始");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        String str = "testStr";
        String sc = "testSc";
        System.out.println("输出："+str);
        logger.info("sc的值{},str的值{}",sc,str);
    }
}
