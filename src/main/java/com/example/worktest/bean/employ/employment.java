package com.example.worktest.bean.employ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.Table;
import java.util.Date;

@ToString
@Builder
@Data
@Table(name="employment_information")
@ApiModel(description= "shiyan")
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class employment {
    @ApiModelProperty(value = "id")
    private int id;
    @ApiModelProperty(value = "名字")
    private String name;
    @ApiModelProperty(value = "i照片名")
    private String photo;
    @ApiModelProperty(value = "薪资")
    private long salary;
    @ApiModelProperty(value = "公司")
    private String company;
    @ApiModelProperty(value = "地址")
    private String address;
    @ApiModelProperty(value = "地址编号")
    private int username;
    @ApiModelProperty(value = "时间")
    private Date addDate;
}
