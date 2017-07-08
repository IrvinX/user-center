package com.footprint.common.dao;

import com.footprint.common.model.DUcOrgAWhite;
import com.footprint.common.model.DUcOrgAWhiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcOrgAWhiteMapper {
    long countByExample(DUcOrgAWhiteExample example);

    int deleteByExample(DUcOrgAWhiteExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcOrgAWhite record);

    int insertSelective(DUcOrgAWhite record);

    List<DUcOrgAWhite> selectByExample(DUcOrgAWhiteExample example);

    DUcOrgAWhite selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcOrgAWhite record, @Param("example") DUcOrgAWhiteExample example);

    int updateByExample(@Param("record") DUcOrgAWhite record, @Param("example") DUcOrgAWhiteExample example);

    int updateByPrimaryKeySelective(DUcOrgAWhite record);

    int updateByPrimaryKey(DUcOrgAWhite record);
}