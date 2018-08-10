package com.laioin.pay.service.services;

import com.laioin.pay.service.entry.SdOrder;

public interface ISdOrderService {

    /**
     * 根据id查询
     * @param orderId
     * @return
     */
    SdOrder queryById(String orderId);
}
