package com.footprint.common.dao;

import com.footprint.common.model.DUcEntpAuditHis;
import com.footprint.common.model.DUcEntpAuditHisExample;
import com.footprint.common.model.DUcEntpAuditHisKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcEntpAuditHisMapper {
    long countByExample(DUcEntpAuditHisExample example);

    int deleteByExample(DUcEntpAuditHisExample example);

    int deleteByPrimaryKey(DUcEntpAuditHisKey key);

    int insert(DUcEntpAuditHis record);

    int insertSelective(DUcEntpAuditHis record);

    List<DUcEntpAuditHis> selectByExample(DUcEntpAuditHisExample example);

    DUcEntpAuditHis selectByPrimaryKey(DUcEntpAuditHisKey key);

    int updateByExampleSelective(@Param("record") DUcEntpAuditHis record, @Param("example") DUcEntpAuditHisExample example);

    int updateByExample(@Param("record") DUcEntpAuditHis record, @Param("example") DUcEntpAuditHisExample example);

    int updateByPrimaryKeySelective(DUcEntpAuditHis record);

    int updateByPrimaryKey(DUcEntpAuditHis record);
}