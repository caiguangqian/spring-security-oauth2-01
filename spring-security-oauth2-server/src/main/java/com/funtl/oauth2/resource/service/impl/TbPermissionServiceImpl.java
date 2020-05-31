package com.funtl.oauth2.resource.service.impl;

import com.funtl.oauth2.resource.domain.TbPermission;
import com.funtl.oauth2.resource.mapper.TbPermissionMapper;
import com.funtl.oauth2.resource.service.TbPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/5/28 0:00
 **/
@Service
public class TbPermissionServiceImpl implements TbPermissionService {
    @Resource
    private TbPermissionMapper tbPermissionMapper;
    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}
