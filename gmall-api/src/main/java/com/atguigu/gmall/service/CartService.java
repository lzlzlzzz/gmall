package com.atguigu.gmall.service;

import com.atguigu.gmall.beans.OmsCartItem;

import java.util.List;

public interface CartService {

    OmsCartItem isCartExist(OmsCartItem omsCartItem);

    void updataCartById(OmsCartItem omsCartItem);

    void insertCart(OmsCartItem omsCartItem);

    List<OmsCartItem> getCartCache(String memberId);

    void updateCartCheck(OmsCartItem omsCartItem);

    void insertCartFromCookie(OmsCartItem omsCartItem);
}
