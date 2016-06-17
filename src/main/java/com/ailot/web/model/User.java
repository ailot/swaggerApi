package com.ailot.web.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author LiTao
 * @Date 2016-06-17
 * @Email litao28@gome.com.cn
 * @Desc
 */

@ApiModel("用户")
public class User {

    @ApiModelProperty(value = "用户ID",required = true)
    private String id;

    @ApiModelProperty(value = "名字",required = true)
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
