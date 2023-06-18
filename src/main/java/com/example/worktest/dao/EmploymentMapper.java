package com.example.worktest.dao;

import com.example.worktest.bean.employ.employment;
import com.example.worktest.bean.employ.jk;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmploymentMapper {
    /**
     * 通用查询
     * @return List<PaperExamine>
     */
    @Select("SELECT * FROM employment_information")
    List<employment> findAll();
    @Select("SELECT * FROM jk")
    jk findjk();
}
