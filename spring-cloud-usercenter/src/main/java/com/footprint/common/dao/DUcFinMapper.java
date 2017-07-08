package com.footprint.common.dao;

import com.footprint.common.model.DUcFin;
import com.footprint.common.model.DUcFinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcFinMapper {
    long countByExample(DUcFinExample example);

    int deleteByExample(DUcFinExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcFin record);

    int insertSelective(DUcFin record);

    List<DUcFin> selectByExample(DUcFinExample example);

    DUcFin selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcFin record, @Param("example") DUcFinExample example);

    int updateByExample(@Param("record") DUcFin record, @Param("example") DUcFinExample example);

    int updateByPrimaryKeySelective(DUcFin record);

    int updateByPrimaryKey(DUcFin record);
}