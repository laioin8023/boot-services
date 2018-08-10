package com.laioin.user.gateway.controller;


import com.laioin.gateway.common.base.BaseController;
import com.laioin.services.common.modle.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 控制器
 */
@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

    @RequestMapping("/query")
    public ResultMsg query(Integer id) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("nickname", "你好呀");
        return buildSuccess(map);
    }

}
