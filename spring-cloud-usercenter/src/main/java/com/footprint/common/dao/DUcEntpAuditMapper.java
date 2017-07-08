package com.footprint.common.dao;

import com.footprint.common.model.DUcEntpAudit;
import com.footprint.common.model.DUcEntpAuditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcEntpAuditMapper {
    long countByExample(DUcEntpAuditExample example);

    int deleteByExample(DUcEntpAuditExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcEntpAudit record);

    int insertSelective(DUcEntpAudit record);

    List<DUcEntpAudit> selectByExample(DUcEntpAuditExample example);

    DUcEntpAudit selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcEntpAudit record, @Param("example") DUcEntpAuditExample example);

    int updateByExample(@Param("record") DUcEntpAudit record, @Param("example") DUcEntpAuditExample example);

    int updateByPrimaryKeySelective(DUcEntpAudit record);

    int updateByPrimaryKey(DUcEntpAudit record);
}