package com.example.demo.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @author liangpengyu
 */
public class RestData {
    private String data;
    private String lpy;

    @Override
    public String toString() {
        return "RestData{" +
                "data='" + data + '\'' +
                ", lpy='" + lpy + '\'' +
                '}';
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLpy() {
        return lpy;
    }

    public void setLpy(String lpy) {
        this.lpy = lpy;
    }
}
