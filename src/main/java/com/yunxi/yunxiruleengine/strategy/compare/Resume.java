package com.yunxi.yunxiruleengine.strategy.compare;

import lombok.Data;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2020-02-28
 * @Description: 简历类
 */
@Data
public class Resume {
    /**
     * id
     */
    private int id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 工资
     */
    private int salary;
    /**
     * 工作年限
     */
    private int workYears;

    public Resume(int id, String name, int age, int salary, int workYears) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workYears = workYears;
    }
}
