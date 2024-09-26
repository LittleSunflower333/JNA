package com.jnaexample.demo.entity;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;
public class Hivision_java_params extends Structure {
    public String model_path;
    public String image_path;
    public String out_path;
    public String face_model_path;
    public int rgb_r, rgb_g, rgb_b;
    public int thread_num, model_scale;
    public Params param = new Params();

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("model_path", "image_path", "out_path", "face_model_path",
                "rgb_r", "rgb_g", "rgb_b", "thread_num", "model_scale", "param");
    }
    public Hivision_java_params() {
        super();
        // 初始化默认值
        this.rgb_r = 255;
        this.rgb_g = 0;
        this.rgb_b = 0;
        this.thread_num = 4;
        this.model_scale = 8;
    }

    public String getModel_path() {
        return model_path;
    }

    public void setModel_path(String model_path) {
        this.model_path = model_path;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public String getOut_path() {
        return out_path;
    }

    public void setOut_path(String out_path) {
        this.out_path = out_path;
    }

    public String getFace_model_path() {
        return face_model_path;
    }

    public void setFace_model_path(String face_model_path) {
        this.face_model_path = face_model_path;
    }

    public int getRgb_r() {
        return rgb_r;
    }

    public void setRgb_r(int rgb_r) {
        this.rgb_r = rgb_r;
    }

    public int getRgb_g() {
        return rgb_g;
    }

    public void setRgb_g(int rgb_g) {
        this.rgb_g = rgb_g;
    }

    public int getRgb_b() {
        return rgb_b;
    }

    public void setRgb_b(int rgb_b) {
        this.rgb_b = rgb_b;
    }

    public int getThread_num() {
        return thread_num;
    }

    public void setThread_num(int thread_num) {
        this.thread_num = thread_num;
    }

    public int getModel_scale() {
        return model_scale;
    }

    public void setModel_scale(int model_scale) {
        this.model_scale = model_scale;
    }

    public Params getParam() {
        return param;
    }

    public void setParam(Params param) {
        this.param = param;
    }
}
