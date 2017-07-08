package com.footprint.common.dao;

import com.footprint.common.model.DUcWf;
import com.footprint.common.model.DUcWfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcWfMapper {
    long countByExample(DUcWfExample example);

    int deleteByExample(DUcWfExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcWf record);

    int insertSelective(DUcWf record);

    List<DUcWf> selectByExample(DUcWfExample example);

    DUcWf selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcWf record, @Param("example") DUcWfExample example);

    int updateByExample(@Param("record") DUcWf record, @Param("example") DUcWfExample example);

    int updateByPrimaryKeySelective(DUcWf record);

    int updateByPrimaryKey(DUcWf record);
}