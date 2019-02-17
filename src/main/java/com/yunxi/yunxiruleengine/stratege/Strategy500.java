package com.yunxi.yunxiruleengine.stratege;


import com.yunxi.yunxiruleengine.entity.Order;

import static com.yunxi.yunxiruleengine.xiaoming.JavaScoreExample.addScore;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-02-16
 * @Description:
 */
public class Strategy500 implements Strategy {
    @Override
    public void cal(Order order) {
        order.setScore(500);
        addScore(order);
    }
}
