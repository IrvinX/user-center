package com.footprint.common.dao;

import com.footprint.common.model.DUcTextileEntp;
import com.footprint.common.model.DUcTextileEntpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcTextileEntpMapper {
    long countByExample(DUcTextileEntpExample example);

    int deleteByExample(DUcTextileEntpExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcTextileEntp record);

    int insertSelective(DUcTextileEntp record);

    List<DUcTextileEntp> selectByExample(DUcTextileEntpExample example);

    DUcTextileEntp selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcTextileEntp record, @Param("example") DUcTextileEntpExample example);

    int updateByExample(@Param("record") DUcTextileEntp record, @Param("example") DUcTextileEntpExample example);

    int updateByPrimaryKeySelective(DUcTextileEntp record);

    int updateByPrimaryKey(DUcTextileEntp record);
}