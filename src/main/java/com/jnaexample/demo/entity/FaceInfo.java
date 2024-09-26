package com.jnaexample.demo.entity;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class FaceInfo extends Structure {
    public float x1, y1, x2, y2, score, area;
    public float[] landmarks = new float[10];

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("x1", "y1", "x2", "y2", "score", "area", "landmarks");
    }

    public FaceInfo() {
        super();
        // 初始化数组
        Arrays.fill(landmarks, 0.0f);
    }

    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getY1() {
        return y1;
    }

    public void setY1(float y1) {
        this.y1 = y1;
    }

    public float getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }

    public float getY2() {
        return y2;
    }

    public void setY2(float y2) {
        this.y2 = y2;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float[] getLandmarks() {
        return landmarks;
    }

    public void setLandmarks(float[] landmarks) {
        this.landmarks = landmarks;
    }
}
