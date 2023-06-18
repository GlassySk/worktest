package com.example.worktest.service.impl;

import com.example.worktest.bean.employ.employment;
import com.example.worktest.bean.employ.jk;
import com.example.worktest.dao.EmploymentMapper;
import com.example.worktest.service.empolymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class EmpolymentImpl implements empolymentService{
    private EmploymentMapper employmentMapper;
    public EmpolymentImpl(EmploymentMapper employmentMapper)
    {
        this.employmentMapper=employmentMapper;
    }
    @Override
    public List<employment> findAll() {
        List<employment> all = employmentMapper.findAll();
        return all;
    }

    @Override
    public jk findjk() {
        return employmentMapper.findjk();
    }

}
