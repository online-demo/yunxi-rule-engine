package com.yunxi.yunxiruleengine.strategy.updatexiaoming;


import com.yunxi.yunxiruleengine.entity.Order;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2020-02-28
 * @Description:
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(Order order){
        strategy.cal(order);
    }
}
