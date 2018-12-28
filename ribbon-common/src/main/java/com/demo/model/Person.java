package com.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.annotation.Resource;

/**
 * Person
 *
 * @author 10905 2018/12/18
 * @version 1.0
 */
@Data//getset方法
@ToString//toString方法
@NoArgsConstructor//无参
@AllArgsConstructor//全参
@Resource
public class Person {
    private String id;
    private String name;
    private String password;


}
