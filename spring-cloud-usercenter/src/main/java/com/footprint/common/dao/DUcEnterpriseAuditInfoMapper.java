package com.footprint.common.dao;

import com.footprint.common.model.DUcEnterpriseAuditInfo;
import com.footprint.common.model.DUcEnterpriseAuditInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcEnterpriseAuditInfoMapper {
    long countByExample(DUcEnterpriseAuditInfoExample example);

    int deleteByExample(DUcEnterpriseAuditInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcEnterpriseAuditInfo record);

    int insertSelective(DUcEnterpriseAuditInfo record);

    List<DUcEnterpriseAuditInfo> selectByExample(DUcEnterpriseAuditInfoExample example);

    DUcEnterpriseAuditInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcEnterpriseAuditInfo record, @Param("example") DUcEnterpriseAuditInfoExample example);

    int updateByExample(@Param("record") DUcEnterpriseAuditInfo record, @Param("example") DUcEnterpriseAuditInfoExample example);

    int updateByPrimaryKeySelective(DUcEnterpriseAuditInfo record);

    int updateByPrimaryKey(DUcEnterpriseAuditInfo record);
}