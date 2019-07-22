package com.zhiyou100.pojo;

import java.io.Serializable;

public class Dept implements Serializable {
    private  Integer d_id;
    private  String d_name;
    private String d_desc;

    public Dept(Integer d_id, String d_name, String d_desc) {
        this.d_id = d_id;
        this.d_name = d_name;
        this.d_desc = d_desc;
    }

    public Dept(String d_name, String d_desc) {
        this.d_name = d_name;
        this.d_desc = d_desc;
    }

    public Dept() {
    }

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getD_desc() {
        return d_desc;
    }

    public void setD_desc(String d_desc) {
        this.d_desc = d_desc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "d_id=" + d_id +
                ", d_name='" + d_name + '\'' +
                ", d_desc='" + d_desc + '\'' +
                '}';
    }
}
