package com.penguin.springcloud.service.impl;

import com.penguin.springcloud.dao.DemoDao;
import com.penguin.springcloud.entities.demo.DemoParent;
import com.penguin.springcloud.entities.demo.DemoSon;
import com.penguin.springcloud.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoDao demoDao;

    @Override
    public List<DemoParent> getAll() {
        return demoDao.getAll();
    }


    @Override
    public DemoParent getParentById(Long id) {
        return demoDao.getParentById(id);
    }

    @Override
    public void addSon(DemoSon son) {
        demoDao.addSon(son);
    }
}


