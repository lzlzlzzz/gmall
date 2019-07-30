package com.atguigu.gmall.service;

import com.atguigu.gmall.beans.OmsOrder;

public interface OrderService {

    void addOrder(OmsOrder omsOrder);

    String genTradeCode(String memberId);

    boolean checkTradeCode(String memberId, String tradeCode);

    OmsOrder getOrderByOrderSn(String orderSn);

    void updateOrder(OmsOrder omsOrder);

    void sendOrderPayQueue(String out_trade_no);
}
