package com.footprint.common.dao;

import com.footprint.common.model.DUcUserOauth;
import com.footprint.common.model.DUcUserOauthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcUserOauthMapper {
    long countByExample(DUcUserOauthExample example);

    int deleteByExample(DUcUserOauthExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcUserOauth record);

    int insertSelective(DUcUserOauth record);

    List<DUcUserOauth> selectByExample(DUcUserOauthExample example);

    DUcUserOauth selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcUserOauth record, @Param("example") DUcUserOauthExample example);

    int updateByExample(@Param("record") DUcUserOauth record, @Param("example") DUcUserOauthExample example);

    int updateByPrimaryKeySelective(DUcUserOauth record);

    int updateByPrimaryKey(DUcUserOauth record);
}