package com.footprint.common.dao;

import com.footprint.common.model.DUcOrgBankAccount;
import com.footprint.common.model.DUcOrgBankAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcOrgBankAccountMapper {
    long countByExample(DUcOrgBankAccountExample example);

    int deleteByExample(DUcOrgBankAccountExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcOrgBankAccount record);

    int insertSelective(DUcOrgBankAccount record);

    List<DUcOrgBankAccount> selectByExample(DUcOrgBankAccountExample example);

    DUcOrgBankAccount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcOrgBankAccount record, @Param("example") DUcOrgBankAccountExample example);

    int updateByExample(@Param("record") DUcOrgBankAccount record, @Param("example") DUcOrgBankAccountExample example);

    int updateByPrimaryKeySelective(DUcOrgBankAccount record);

    int updateByPrimaryKey(DUcOrgBankAccount record);
}