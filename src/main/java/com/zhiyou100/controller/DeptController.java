package com.zhiyou100.controller;

import com.zhiyou100.pojo.Dept;
import com.zhiyou100.result.ResultObject;
import com.zhiyou100.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("dept")
public class DeptController {
    @Resource
    private DeptService deptService;

    @RequestMapping("/toListUI.action")
    public  String toListUI(){
        return "/dept/list.html";
    }

    @ResponseBody
    @GetMapping("/findAll.action")
    public ResultObject findAll(){
        return deptService.findAll();
    }
    @ResponseBody
    @PostMapping("/add.action")
    public ResultObject add(Dept dept){
        return deptService.add(dept);
    }
    @ResponseBody
    @PostMapping("/delete.action")
    public  ResultObject delete(Integer d_id){
        return  deptService.deleteById(d_id);
    }
    @ResponseBody
    @PostMapping("/updateById.action")
    public ResultObject updateById(Dept dept){
        return  deptService.updateById(dept);
    }
}
