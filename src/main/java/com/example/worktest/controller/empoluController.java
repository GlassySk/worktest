package com.example.worktest.controller;

import com.example.worktest.bean.employ.employment;
import com.example.worktest.bean.employ.jk;
import com.example.worktest.service.empolymentService;
import com.example.worktest.service.impl.EmpolymentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/empol")
public class empoluController {
    @Autowired
    private EmpolymentImpl empolymentService;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public List<employment> findAll(){
//        employment employment = new employment();
//        employment.setName("hh");
//        employment employment1 = new employment();
//        employment.setName("hh1");
//        List<com.example.worktest.bean.employ.employment> employments = new ArrayList<employment>();
//        employments.add(employment);
//        employments.add(employment1);
        List<com.example.worktest.bean.employ.employment> all =empolymentService.findAll();
        System.out.println(all);
        System.out.println("fffffffffff");
        return all;
    }
    @RequestMapping(value = "/jk", method = RequestMethod.GET)
    @ResponseBody
    public jk findjk(){
        jk findjk = empolymentService.findjk();
        return findjk;
    }
    @RequestMapping("/s")
    @ResponseBody
    public String s(){
            String s = new String();
            s="string";
            System.out.println("fffffffffff");
            return s;
        }
}
