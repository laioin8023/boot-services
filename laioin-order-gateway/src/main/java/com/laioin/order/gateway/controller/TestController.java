package com.laioin.order.gateway.controller;


import com.laioin.gateway.common.base.BaseController;
import com.laioin.pay.service.entry.SdOrder;
import com.laioin.pay.service.services.ISdOrderService;
import com.laioin.services.common.modle.ResultMsg;
import com.laioin.user.service.entry.SdUser;
import com.laioin.user.service.services.ISdUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 */
@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

    @Autowired
    private ISdUserService sdUserService;
    @Autowired
    private ISdOrderService sdOrderService;


    /**
     * 查询用户
     *
     * @param id
     * @return
     */
    @RequestMapping("/query/user")
    public ResultMsg queryUser(Integer id) {
        SdUser bxUser = sdUserService.queryById(id);
        return buildSuccess(bxUser);
    }

    /**
     * 查询商家
     *
     * @param id
     * @return
     */
    @RequestMapping("/query/order")
    public ResultMsg queryMerchant(String id) {
        SdOrder data = sdOrderService.queryById(id);
        return buildSuccess(data);
    }


}
