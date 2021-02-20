package com.penguin.springcloud.entities.demo;

import java.util.List;

public class DemoParent {
    private int p_id;
    private String p_value;
    private List<DemoSon> sons;

    public DemoParent() {
    }

    public DemoParent(int p_id, String p_value, List<DemoSon> sons) {
        this.p_id = p_id;
        this.p_value = p_value;
        this.sons = sons;
    }

    public List<DemoSon> getSons() {
        return sons;
    }

    public void setSons(List<DemoSon> sons) {
        this.sons = sons;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_value() {
        return p_value;
    }

    public void setP_value(String p_value) {
        this.p_value = p_value;
    }
}


