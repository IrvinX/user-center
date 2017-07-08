package com.footprint.common.dao;

import com.footprint.common.model.DUcUser;
import com.footprint.common.model.DUcUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcUserMapper {
    long countByExample(DUcUserExample example);

    int deleteByExample(DUcUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcUser record);

    int insertSelective(DUcUser record);

    List<DUcUser> selectByExample(DUcUserExample example);

    DUcUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcUser record, @Param("example") DUcUserExample example);

    int updateByExample(@Param("record") DUcUser record, @Param("example") DUcUserExample example);

    int updateByPrimaryKeySelective(DUcUser record);

    int updateByPrimaryKey(DUcUser record);
}