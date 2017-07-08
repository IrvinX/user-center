package com.footprint.common.dao;

import com.footprint.common.model.DUcBusinessSystem;
import com.footprint.common.model.DUcBusinessSystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcBusinessSystemMapper {
    long countByExample(DUcBusinessSystemExample example);

    int deleteByExample(DUcBusinessSystemExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcBusinessSystem record);

    int insertSelective(DUcBusinessSystem record);

    List<DUcBusinessSystem> selectByExample(DUcBusinessSystemExample example);

    DUcBusinessSystem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcBusinessSystem record, @Param("example") DUcBusinessSystemExample example);

    int updateByExample(@Param("record") DUcBusinessSystem record, @Param("example") DUcBusinessSystemExample example);

    int updateByPrimaryKeySelective(DUcBusinessSystem record);

    int updateByPrimaryKey(DUcBusinessSystem record);
}