package com.jnaexample.demo;

import com.sun.jna.*;
import lombok.Data;

// java
public interface JnaLibrary extends Library {
    JnaLibrary INSTANCE = Native.loadLibrary("E:\\workSpace\\JNAdemo\\src\\main\\resources\\win32-x86-64\\Dlldemo", JnaLibrary.class);
    int add(int a, int b);
    int minus(int a, int b);
    int multiply(int a, int b);
    int divide(int a, int b);
    String hello_char(String a);
    String hello_string(String a);
}
