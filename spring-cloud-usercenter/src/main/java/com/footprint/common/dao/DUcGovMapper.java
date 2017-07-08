package com.footprint.common.dao;

import com.footprint.common.model.DUcGov;
import com.footprint.common.model.DUcGovExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcGovMapper {
    long countByExample(DUcGovExample example);

    int deleteByExample(DUcGovExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcGov record);

    int insertSelective(DUcGov record);

    List<DUcGov> selectByExample(DUcGovExample example);

    DUcGov selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcGov record, @Param("example") DUcGovExample example);

    int updateByExample(@Param("record") DUcGov record, @Param("example") DUcGovExample example);

    int updateByPrimaryKeySelective(DUcGov record);

    int updateByPrimaryKey(DUcGov record);
}