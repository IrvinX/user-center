package com.footprint.common.dao;

import com.footprint.common.model.DUcOrgRelation;
import com.footprint.common.model.DUcOrgRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcOrgRelationMapper {
    long countByExample(DUcOrgRelationExample example);

    int deleteByExample(DUcOrgRelationExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcOrgRelation record);

    int insertSelective(DUcOrgRelation record);

    List<DUcOrgRelation> selectByExample(DUcOrgRelationExample example);

    DUcOrgRelation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcOrgRelation record, @Param("example") DUcOrgRelationExample example);

    int updateByExample(@Param("record") DUcOrgRelation record, @Param("example") DUcOrgRelationExample example);

    int updateByPrimaryKeySelective(DUcOrgRelation record);

    int updateByPrimaryKey(DUcOrgRelation record);
}