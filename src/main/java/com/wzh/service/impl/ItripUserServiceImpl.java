package com.wzh.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wzh.mapper.ItripUserMapper;
import com.wzh.po.ItripUser;
import com.wzh.service.ItripUserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0",interfaceClass =ItripUserSerivce.class )
public class ItripUserServiceImpl implements ItripUserSerivce {
    @Autowired
    private ItripUserMapper itripUserMapper;

    public ItripUserMapper getItripUserMapper() {
        return itripUserMapper;
    }

    public void setItripUserMapper(ItripUserMapper itripUserMapper) {
        this.itripUserMapper = itripUserMapper;
    }

    @Override
    public ItripUser findByUserCode(ItripUser user) {
        return itripUserMapper.findByUserCode(user);
    }

    @Override
    public int codeUserSave(ItripUser user) {
        return itripUserMapper.insert(user);
    }

    @Override
    public int upadteUserActivated(ItripUser user) {
        return itripUserMapper.updateActivated(user);
    }

    @Override
    public ItripUser doLogin(ItripUser user) {
        return itripUserMapper.doLogin(user);
    }
}
