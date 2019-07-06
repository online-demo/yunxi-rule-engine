package com.yunxi.yunxiruleengine.drools;

import com.yunxi.yunxiruleengine.entity.Order;
import com.yunxi.yunxiruleengine.entity.User;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-07-06
 * @Description: Drools积分
 */
public class DroolsScoreExample {


    /**
     * 计算额外积分金额 规则如下: 订单原价金额
     * 100以下, 不加分
     * 100-500 加100分
     * 500-1000 加500分
     * 1000 以上 加1000分
     *
     * @param args
     * @throws Exception
     */
    public static final void main(final String[] args) throws Exception{
        // KieServices is the factory for all KIE services
        KieServices ks = KieServices.Factory.get();

        // From the kie services, a container is created from the classpath
        KieContainer kc = ks.getKieClasspathContainer();

        execute(kc);
    }


    public static void execute( KieContainer kc ) throws Exception{
        // From the container, a session is created based on
        // its definition and configuration in the META-INF/kmodule.xml file
        KieSession ksession = kc.newKieSession("point-rulesKS");

        List<Order> orderList = getInitData();

        for (int i = 0; i < orderList.size(); i++) {
            Order order = orderList.get(i);
            ksession.insert(order);
            ksession.fireAllRules();
            // 执行完规则后, 执行相关的逻辑
            addScore(order);
        }

        ksession.dispose();

    }

  
    private static void addScore(Order order){
        System.out.println("用户" + order.getUser().getName() + "享受额外增加积分: " + order.getScore());
    }  
      
    private static List<Order> getInitData() throws Exception {  
        List<Order> orderList = new ArrayList<Order>();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        {  
            Order order = new Order();  
            order.setAmout(80);  
            order.setBookingDate(df.parse("2019-07-01"));
            User user = new User();  
            user.setLevel(1);  
            user.setName("User1");
            order.setUser(user);
            orderList.add(order);
        }  
        {  
            Order order = new Order();  
            order.setAmout(200);  
            order.setBookingDate(df.parse("2019-07-02"));
            User user = new User();
            user.setLevel(2);  
            user.setName("User2");
            order.setUser(user);  
            orderList.add(order);  
        }  
        {  
            Order order = new Order();  
            order.setAmout(800);  
            order.setBookingDate(df.parse("2019-07-03"));
            User user = new User();  
            user.setLevel(3);  
            user.setName("User3");
            order.setUser(user);  
            orderList.add(order);  
        }  
        {  
            Order order = new Order();  
            order.setAmout(1500);  
            order.setBookingDate(df.parse("2019-07-04"));
            User user = new User();  
            user.setLevel(4);  
            user.setName("User4");
            order.setUser(user);  
            orderList.add(order);  
        }  
        return orderList;  
    }  
}  