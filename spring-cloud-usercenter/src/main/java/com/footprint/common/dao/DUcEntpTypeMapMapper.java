package com.footprint.common.dao;

import com.footprint.common.model.DUcEntpTypeMap;
import com.footprint.common.model.DUcEntpTypeMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcEntpTypeMapMapper {
    long countByExample(DUcEntpTypeMapExample example);

    int deleteByExample(DUcEntpTypeMapExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcEntpTypeMap record);

    int insertSelective(DUcEntpTypeMap record);

    List<DUcEntpTypeMap> selectByExample(DUcEntpTypeMapExample example);

    DUcEntpTypeMap selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcEntpTypeMap record, @Param("example") DUcEntpTypeMapExample example);

    int updateByExample(@Param("record") DUcEntpTypeMap record, @Param("example") DUcEntpTypeMapExample example);

    int updateByPrimaryKeySelective(DUcEntpTypeMap record);

    int updateByPrimaryKey(DUcEntpTypeMap record);
}