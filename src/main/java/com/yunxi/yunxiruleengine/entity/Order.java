package com.yunxi.yunxiruleengine.entity;

import java.util.Date;

public class Order {
    /**
     * 下单日期
      */
    private Date bookingDate;

    /**
     * 订单原价金额
     */
    private int amout;

    /**
     * 下单人
     */
    private User user;

    /**
     * 积分
     */
    private int score;  
      
    public int getScore() {  
        return score;  
    }  
  
    public void setScore(int score) {  
        this.score = score;  
    }  
  
    public Date getBookingDate() {  
        return bookingDate;  
    }  
  
    public void setBookingDate(Date bookingDate) {  
        this.bookingDate = bookingDate;  
    }  
  
    public int getAmout() {  
        return amout;  
    }  
  
    public void setAmout(int amout) {  
        this.amout = amout;  
    }  
  
    public User getUser() {  
        return user;  
    }  
  
    public void setUser(User user) {  
        this.user = user;  
    }  
      
      
      
      
      
}  