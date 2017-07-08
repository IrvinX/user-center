package com.footprint.common.dao;

import com.footprint.common.model.DUcOrgPerson;
import com.footprint.common.model.DUcOrgPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcOrgPersonMapper {
    long countByExample(DUcOrgPersonExample example);

    int deleteByExample(DUcOrgPersonExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcOrgPerson record);

    int insertSelective(DUcOrgPerson record);

    List<DUcOrgPerson> selectByExample(DUcOrgPersonExample example);

    DUcOrgPerson selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcOrgPerson record, @Param("example") DUcOrgPersonExample example);

    int updateByExample(@Param("record") DUcOrgPerson record, @Param("example") DUcOrgPersonExample example);

    int updateByPrimaryKeySelective(DUcOrgPerson record);

    int updateByPrimaryKey(DUcOrgPerson record);
}