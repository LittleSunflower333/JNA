package com.jnaexample.demo;

import com.jnaexample.demo.entity.Hivision_java_params;
import com.sun.jna.*;
import lombok.Data;

public interface HivisionIDphotosLibrary extends Library {
    HivisionIDphotosLibrary INSTANCE = Native.loadLibrary("src\\main\\resources\\win32-x86-64\\HivisionIDphotos", HivisionIDphotosLibrary.class);
    void human_mating(Hivision_java_params hivision_java_params);
    int add(int a, int b);
    int ID_photo(Hivision_java_params hivision_java_params,int out_size_kb,boolean layout_phot);
}
