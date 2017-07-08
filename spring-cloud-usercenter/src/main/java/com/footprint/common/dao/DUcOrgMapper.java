package com.footprint.common.dao;

import com.footprint.common.model.DUcOrg;
import com.footprint.common.model.DUcOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcOrgMapper {
    long countByExample(DUcOrgExample example);

    int deleteByExample(DUcOrgExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcOrg record);

    int insertSelective(DUcOrg record);

    List<DUcOrg> selectByExample(DUcOrgExample example);

    DUcOrg selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcOrg record, @Param("example") DUcOrgExample example);

    int updateByExample(@Param("record") DUcOrg record, @Param("example") DUcOrgExample example);

    int updateByPrimaryKeySelective(DUcOrg record);

    int updateByPrimaryKey(DUcOrg record);
}