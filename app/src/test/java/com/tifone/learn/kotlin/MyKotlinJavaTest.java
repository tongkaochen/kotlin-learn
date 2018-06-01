package com.tifone.learn.kotlin;

import org.junit.Test;
import com.tifone.learn.kotlin.MyKotlinKt.*;

/**
 * Create by Tifone on 2018/5/31.
 */
public class MyKotlinJavaTest {

    @Test
    public void testIfCondition() {
        MyKotlinKt.ifCondition();
        MyKotlinKt.ifCondition2();

    }
    @Test
    public void testWhenCondition() {
        MyKotlinKt.whenCondition(1);
        MyKotlinKt.whenCondition(2);
        MyKotlinKt.whenCondition(3);
        MyKotlinKt.whenCondition(4);
        MyKotlinKt.whenCondition(8);
        MyKotlinKt.whenCondition(9);
        MyKotlinKt.whenCondition(12);
        MyKotlinKt.whenCondition(10);
    }
}
