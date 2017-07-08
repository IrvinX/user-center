package com.footprint.common.dao;

import com.footprint.common.model.DUcEnterprise;
import com.footprint.common.model.DUcEnterpriseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcEnterpriseMapper {
    long countByExample(DUcEnterpriseExample example);

    int deleteByExample(DUcEnterpriseExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcEnterprise record);

    int insertSelective(DUcEnterprise record);

    List<DUcEnterprise> selectByExample(DUcEnterpriseExample example);

    DUcEnterprise selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcEnterprise record, @Param("example") DUcEnterpriseExample example);

    int updateByExample(@Param("record") DUcEnterprise record, @Param("example") DUcEnterpriseExample example);

    int updateByPrimaryKeySelective(DUcEnterprise record);

    int updateByPrimaryKey(DUcEnterprise record);
}