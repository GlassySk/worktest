package com.example.worktest.bean.employ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.Table;

@ToString
@Builder
@Data
@Table(name="employment_information")
@ApiModel(description= "shiyan")
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class jk {
    @ApiModelProperty(value = "id")
    private int id;
}
