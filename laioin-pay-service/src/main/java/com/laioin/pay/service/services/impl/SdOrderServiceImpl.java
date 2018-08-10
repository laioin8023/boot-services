package com.laioin.pay.service.services.impl;

import com.laioin.pay.service.entry.SdOrder;
import com.laioin.pay.service.mapper.SdOrderMapper;
import com.laioin.pay.service.services.ISdOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SdOrderServiceImpl implements ISdOrderService {

    @Resource
    private SdOrderMapper orderMapper;

    @Override
    public SdOrder queryById(String orderId) {
        return orderMapper.selectByPrimaryKey(orderId);
    }
}
