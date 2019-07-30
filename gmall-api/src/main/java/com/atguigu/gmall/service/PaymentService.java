package com.atguigu.gmall.service;

import com.atguigu.gmall.beans.PaymentInfo;

import java.util.Map;

public interface PaymentService {

    void addPayment(PaymentInfo paymentInfo);

    void updatePayment(PaymentInfo paymentInfo);

    void sendPaymentResult(PaymentInfo paymentInfo);

    void sendPaymentStatusCheckQueue(PaymentInfo paymentInfo,int count);

    Map<String, Object> checkPayment(String orderSn);

    String checkDbPayStatus(String orderSn);
}
