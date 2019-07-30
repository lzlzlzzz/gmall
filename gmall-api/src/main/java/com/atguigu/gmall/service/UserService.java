package com.atguigu.gmall.service;

import com.atguigu.gmall.beans.UmsMember;
import com.atguigu.gmall.beans.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {


    List<UmsMember> getAllUser();

    UmsMember getUserById(String id);

    UmsMember login(UmsMember umsMember);

    void putToken(String token,String memberId);

    List<UmsMemberReceiveAddress> getMemberAddresserById(String memberId);

    UmsMember addOauthUser(UmsMember umsMember);

    UmsMemberReceiveAddress getAddressByAddressId(String addressId);

    void sendLoginSuccessQueue(String id, String cartListCookie);
}
