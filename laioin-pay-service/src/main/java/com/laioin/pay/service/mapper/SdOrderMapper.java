package com.laioin.pay.service.mapper;

import com.laioin.pay.service.entry.SdOrder;

public interface SdOrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(SdOrder record);

    int insertSelective(SdOrder record);

    SdOrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(SdOrder record);

    int updateByPrimaryKey(SdOrder record);
}