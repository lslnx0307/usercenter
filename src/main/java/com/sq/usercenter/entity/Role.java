package com.sq.usercenter.entity;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author makejava
 * @since 2018-10-11 19:39:35
 */
public class Role implements Serializable {
    private static final long serialVersionUID = -68918979235859358L;
    
    private Integer id;
    
    private String roleName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}