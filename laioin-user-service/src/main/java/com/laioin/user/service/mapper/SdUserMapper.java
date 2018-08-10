package com.laioin.user.service.mapper;

import com.laioin.user.service.entry.SdUser;

public interface SdUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SdUser record);

    int insertSelective(SdUser record);

    SdUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SdUser record);

    int updateByPrimaryKey(SdUser record);
}