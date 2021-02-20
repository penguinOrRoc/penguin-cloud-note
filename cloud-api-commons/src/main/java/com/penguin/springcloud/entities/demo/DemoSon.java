package com.penguin.springcloud.entities.demo;

public class DemoSon {
    private int s_id;
    private String s_value;
    private int p_id;

    public DemoSon() {
    }

    public DemoSon(int s_id, String s_value, int p_id) {
        this.s_id = s_id;
        this.s_value = s_value;
        this.p_id = p_id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_value() {
        return s_value;
    }

    public void setS_value(String s_value) {
        this.s_value = s_value;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }
}


