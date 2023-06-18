package com.example.worktest.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface employment {
    /**
     * 通用查询
     * @return List<PaperExamine>
     */
    @Select("SELECT * FROM employment_information")
    List<employment> findAll();

}
