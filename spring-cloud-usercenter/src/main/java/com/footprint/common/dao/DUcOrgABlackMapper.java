package com.footprint.common.dao;

import com.footprint.common.model.DUcOrgABlack;
import com.footprint.common.model.DUcOrgABlackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcOrgABlackMapper {
    long countByExample(DUcOrgABlackExample example);

    int deleteByExample(DUcOrgABlackExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcOrgABlack record);

    int insertSelective(DUcOrgABlack record);

    List<DUcOrgABlack> selectByExample(DUcOrgABlackExample example);

    DUcOrgABlack selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcOrgABlack record, @Param("example") DUcOrgABlackExample example);

    int updateByExample(@Param("record") DUcOrgABlack record, @Param("example") DUcOrgABlackExample example);

    int updateByPrimaryKeySelective(DUcOrgABlack record);

    int updateByPrimaryKey(DUcOrgABlack record);
}