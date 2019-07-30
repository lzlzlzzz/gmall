package com.atguigu.gmall.service;

import com.atguigu.gmall.beans.PmsBaseAttrInfo;
import com.atguigu.gmall.beans.PmsBaseAttrValue;

import java.util.HashSet;
import java.util.List;

public interface AttrService {

    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    void saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    void deleteAttrInfo(String attrId);

    List<PmsBaseAttrInfo> getAttrValueByValueIds(HashSet<String> valueIdSet);
}
