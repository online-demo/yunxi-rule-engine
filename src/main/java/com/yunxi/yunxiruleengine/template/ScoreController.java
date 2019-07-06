package com.yunxi.yunxiruleengine.template;

import com.yunxi.yunxiruleengine.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.yunxi.yunxiruleengine.xiaoming.JavaScoreExample.printScore;
import static com.yunxi.yunxiruleengine.xiaoming.JavaScoreExample.getInitData;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-07-06
 * @Description:
 */
@RestController
public class ScoreController {
    @Autowired
    private Rule rule;

    @RequestMapping("/score")
    public void score() throws Exception {
        List<Order> orderList = getInitData();

        for (int i = 0; i < orderList.size(); i++) {
            printScore(rule.execute(orderList.get(i)));
        }
    }
}
