package com.footprint.common.dao;

import com.footprint.common.model.DUcPerson;
import com.footprint.common.model.DUcPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcPersonMapper {
    long countByExample(DUcPersonExample example);

    int deleteByExample(DUcPersonExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcPerson record);

    int insertSelective(DUcPerson record);

    List<DUcPerson> selectByExample(DUcPersonExample example);

    DUcPerson selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcPerson record, @Param("example") DUcPersonExample example);

    int updateByExample(@Param("record") DUcPerson record, @Param("example") DUcPersonExample example);

    int updateByPrimaryKeySelective(DUcPerson record);

    int updateByPrimaryKey(DUcPerson record);
}