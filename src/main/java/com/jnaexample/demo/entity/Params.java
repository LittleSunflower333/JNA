package com.jnaexample.demo.entity;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;
public class Params extends Structure {
    public int out_image_width, out_image_height;
    public boolean change_bg_only;
    public float head_measure_ratio, head_height_ratio;
    public float[] head_top_range = new float[2];
    public int rgb_r, rgb_g, rgb_b;
    public FaceInfo face_info = new FaceInfo();

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("out_image_width", "out_image_height", "change_bg_only",
                "head_measure_ratio", "head_height_ratio", "head_top_range",
                "rgb_r", "rgb_g", "rgb_b", "face_info");
    }

    public Params() {
        super();
        // 初始化默认值
        out_image_width = 295;
        out_image_height = 413;
        change_bg_only = false;
        head_measure_ratio = 0.2f;
        head_height_ratio = 0.55f;
        head_top_range[0] = 0.12f;
        head_top_range[1] = 0.1f;
        rgb_r = 255;
        rgb_g = 0;
        rgb_b = 0;
    }

    public int getOut_image_width() {
        return out_image_width;
    }

    public void setOut_image_width(int out_image_width) {
        this.out_image_width = out_image_width;
    }

    public int getOut_image_height() {
        return out_image_height;
    }

    public void setOut_image_height(int out_image_height) {
        this.out_image_height = out_image_height;
    }

    public boolean isChange_bg_only() {
        return change_bg_only;
    }

    public void setChange_bg_only(boolean change_bg_only) {
        this.change_bg_only = change_bg_only;
    }

    public float getHead_measure_ratio() {
        return head_measure_ratio;
    }

    public void setHead_measure_ratio(float head_measure_ratio) {
        this.head_measure_ratio = head_measure_ratio;
    }

    public float getHead_height_ratio() {
        return head_height_ratio;
    }

    public void setHead_height_ratio(float head_height_ratio) {
        this.head_height_ratio = head_height_ratio;
    }

    public float[] getHead_top_range() {
        return head_top_range;
    }

    public void setHead_top_range(float[] head_top_range) {
        this.head_top_range = head_top_range;
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

    public FaceInfo getFace_info() {
        return face_info;
    }

    public void setFace_info(FaceInfo face_info) {
        this.face_info = face_info;
    }
}
