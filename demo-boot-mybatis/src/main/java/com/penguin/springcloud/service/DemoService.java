package com.penguin.springcloud.service;

import com.penguin.springcloud.entities.demo.DemoParent;
import com.penguin.springcloud.entities.demo.DemoSon;

import java.util.List;

public interface DemoService {
    public List<DemoParent> getAll();

    public DemoParent getParentById(Long id);

    void addSon(DemoSon son);
}