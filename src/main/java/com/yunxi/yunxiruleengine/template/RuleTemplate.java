package com.yunxi.yunxiruleengine.template;

import com.yunxi.yunxiruleengine.entity.Order;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2020-02-28
 * @Description:
 */
@Component
public class RuleTemplate implements Rule {
    @Resource
    private KieContainer kieContainer;

    @Override
    public Order execute(Order order) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(order);
        kieSession.fireAllRules();
        return order;

    }
}
