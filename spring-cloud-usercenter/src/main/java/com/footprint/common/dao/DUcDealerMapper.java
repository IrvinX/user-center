package com.footprint.common.dao;

import com.footprint.common.model.DUcDealer;
import com.footprint.common.model.DUcDealerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcDealerMapper {
    long countByExample(DUcDealerExample example);

    int deleteByExample(DUcDealerExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcDealer record);

    int insertSelective(DUcDealer record);

    List<DUcDealer> selectByExample(DUcDealerExample example);

    DUcDealer selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcDealer record, @Param("example") DUcDealerExample example);

    int updateByExample(@Param("record") DUcDealer record, @Param("example") DUcDealerExample example);

    int updateByPrimaryKeySelective(DUcDealer record);

    int updateByPrimaryKey(DUcDealer record);
}