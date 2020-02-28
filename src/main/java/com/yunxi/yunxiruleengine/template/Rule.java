package com.yunxi.yunxiruleengine.template;


import com.yunxi.yunxiruleengine.entity.Order;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2020-02-28
 * @Description:
 */
public interface Rule {
    /**
     * 规则执行
     *
     * @param order
     * @return
     */
    Order execute(Order order);
}
