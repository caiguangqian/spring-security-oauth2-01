package com.funtl.oauth2.resource.mapper;

import com.funtl.oauth2.resource.domain.TbPermission;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.MyMapper;

import java.util.List;

public interface TbPermissionMapper extends MyMapper<TbPermission> {
    List<TbPermission> selectByUserId(@Param("userId") Long id);
}