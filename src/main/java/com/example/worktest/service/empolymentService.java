package com.example.worktest.service;

import com.example.worktest.bean.employ.employment;
import com.example.worktest.bean.employ.jk;

import java.util.List;

public interface empolymentService {
    List<employment> findAll();
    jk findjk();
}
