package com.funtl.oauth2.resource.service;

import com.funtl.oauth2.resource.domain.TbUser;

public interface TbUserService {
    //根据用户名得到用户
    public TbUser getUsername(String username);
}
