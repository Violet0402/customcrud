package com.sumaojin.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;
    private String mobile;
    private String password;
    private String sex;
    private Date birthdate;
    private String address;
    private String email;
    private String state;
    private Date create_time;
    private Date update_time;
}
