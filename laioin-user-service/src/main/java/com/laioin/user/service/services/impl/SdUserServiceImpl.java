package com.laioin.user.service.services.impl;

import com.laioin.user.service.entry.SdUser;
import com.laioin.user.service.mapper.SdUserMapper;
import com.laioin.user.service.services.ISdUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SdUserServiceImpl implements ISdUserService {

    @Resource
    private SdUserMapper userMapper;

    @Override
    public SdUser queryById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
