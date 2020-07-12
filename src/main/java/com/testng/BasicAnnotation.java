package com.testng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class BasicAnnotation {
    final Logger logger = LoggerFactory.getLogger(BasicAnnotation.class);
    @Test
    public void testCase1(){
        logger.info("开始");
    }
}
