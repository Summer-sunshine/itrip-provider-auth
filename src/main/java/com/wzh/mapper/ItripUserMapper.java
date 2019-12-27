package com.wzh.mapper;

import com.wzh.po.ItripUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItripUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripUser record);

    int insertSelective(ItripUser record);

    ItripUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripUser record);

    int updateByPrimaryKey(ItripUser record);
    //查询该用户是否存在
    public ItripUser findByUserCode(ItripUser user);
    //修改用户状态
    public int updateActivated(ItripUser user);
    //用户登录查找
    public ItripUser doLogin(ItripUser user);
}