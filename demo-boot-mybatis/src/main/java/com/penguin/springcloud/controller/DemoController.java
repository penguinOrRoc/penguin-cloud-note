package com.penguin.springcloud.controller;

import com.penguin.springcloud.entities.CommonResult;
import com.penguin.springcloud.entities.demo.DemoParent;
import com.penguin.springcloud.entities.demo.DemoSon;
import com.penguin.springcloud.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DemoController {
    @Resource
    private DemoService demoService;

    @GetMapping("/demo/getAll")
    public CommonResult getAll(){
        List<DemoParent> all = demoService.getAll();
        if(all.size() > 0)
        {
            return new CommonResult(200,"全都找到了",all);
        }else{
            return new CommonResult(444,"没找到呀~",null);
        }
    }
    @GetMapping("/demo/getParentById")
    public CommonResult getParentById(@RequestParam Long id){
        DemoParent demoParent = demoService.getParentById(id);
        if(demoParent == null)
        {
            return new CommonResult(444,"没找到呀~",null);
        }else{
            return new CommonResult(200,"全都找到了",demoParent);
        }
    }
    @PostMapping("/demo/addSon")
    public CommonResult addSon(DemoSon son){
        demoService.addSon(son);
        return new CommonResult(200,"插入成功~",null);
    }
}


