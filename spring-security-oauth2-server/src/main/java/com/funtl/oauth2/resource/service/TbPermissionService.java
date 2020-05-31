package com.funtl.oauth2.resource.service;

import com.funtl.oauth2.resource.domain.TbPermission;

import java.util.List;

public interface TbPermissionService {
    List<TbPermission> selectByUserId(Long userId);
}
