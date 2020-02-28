package com.yunxi.yunxiruleengine.strategy.updatexiaoming;


import com.yunxi.yunxiruleengine.entity.Order;

import static com.yunxi.yunxiruleengine.xiaoming.JavaScoreExample.printScore;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2020-02-28
 * @Description:
 */
public class Strategy500 implements Strategy {
    @Override
    public void cal(Order order) {
        order.setScore(500);
        printScore(order);
    }
}
