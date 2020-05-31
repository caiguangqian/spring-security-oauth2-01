package com.funtl.oauth2.resource.service.impl;

import com.funtl.oauth2.resource.domain.TbUser;
import com.funtl.oauth2.resource.mapper.TbUserMapper;
import com.funtl.oauth2.resource.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/5/27 23:53
 **/
@Service
public class TbUserServiceImpl implements TbUserService {
    @Autowired
    TbUserMapper tbUserMapper;
    @Override
    public TbUser getUsername(String username) {
        Example example=new Example(TbUser.class);
        example.createCriteria().andEqualTo("username",username);
        return tbUserMapper.selectOneByExample(example);
    }
}
