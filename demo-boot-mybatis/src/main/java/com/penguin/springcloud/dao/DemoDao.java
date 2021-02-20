package com.penguin.springcloud.dao;

import com.penguin.springcloud.entities.Payment;
import com.penguin.springcloud.entities.demo.DemoParent;
import com.penguin.springcloud.entities.demo.DemoSon;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DemoDao {

    public List<DemoParent> getAll();

    //@Select("select * from demoparent where p_id = #{id}")
    public DemoParent getParentById(Long id);

    public void addSon(DemoSon son);
}


