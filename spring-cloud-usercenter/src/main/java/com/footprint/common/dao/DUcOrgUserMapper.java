package com.footprint.common.dao;

import com.footprint.common.model.DUcOrgUser;
import com.footprint.common.model.DUcOrgUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcOrgUserMapper {
    long countByExample(DUcOrgUserExample example);

    int deleteByExample(DUcOrgUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcOrgUser record);

    int insertSelective(DUcOrgUser record);

    List<DUcOrgUser> selectByExample(DUcOrgUserExample example);

    DUcOrgUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcOrgUser record, @Param("example") DUcOrgUserExample example);

    int updateByExample(@Param("record") DUcOrgUser record, @Param("example") DUcOrgUserExample example);

    int updateByPrimaryKeySelective(DUcOrgUser record);

    int updateByPrimaryKey(DUcOrgUser record);
}