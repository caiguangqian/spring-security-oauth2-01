package com.funtl.oauth2.resource.service.impl;

import com.funtl.oauth2.resource.mapper.TbContentMapper;
import com.funtl.oauth2.resource.service.TbContentService;
import com.funtl.oauth2.resource.domain.TbContent;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/5/29 22:57
 **/
@Service
public class TbContentServiceImpl implements TbContentService {
    @Resource
    private TbContentMapper tbContentMapper;
    @Override
    public List<TbContent> selectAll() {
        return tbContentMapper.selectAll();
    }
}
