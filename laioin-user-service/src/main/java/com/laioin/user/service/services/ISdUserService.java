package com.laioin.user.service.services;

import com.laioin.user.service.entry.SdUser;

public interface ISdUserService {

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    SdUser queryById(Integer id);
}
