package com.footprint.common.dao;

import com.footprint.common.model.DUcFin1;
import com.footprint.common.model.DUcFin1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcFin1Mapper {
    long countByExample(DUcFin1Example example);

    int deleteByExample(DUcFin1Example example);

    int deleteByPrimaryKey(String id);

    int insert(DUcFin1 record);

    int insertSelective(DUcFin1 record);

    List<DUcFin1> selectByExample(DUcFin1Example example);

    DUcFin1 selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcFin1 record, @Param("example") DUcFin1Example example);

    int updateByExample(@Param("record") DUcFin1 record, @Param("example") DUcFin1Example example);

    int updateByPrimaryKeySelective(DUcFin1 record);

    int updateByPrimaryKey(DUcFin1 record);
}