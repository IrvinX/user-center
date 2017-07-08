package com.footprint.common.dao;

import com.footprint.common.model.DUcUserBlack;
import com.footprint.common.model.DUcUserBlackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcUserBlackMapper {
    long countByExample(DUcUserBlackExample example);

    int deleteByExample(DUcUserBlackExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcUserBlack record);

    int insertSelective(DUcUserBlack record);

    List<DUcUserBlack> selectByExample(DUcUserBlackExample example);

    DUcUserBlack selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcUserBlack record, @Param("example") DUcUserBlackExample example);

    int updateByExample(@Param("record") DUcUserBlack record, @Param("example") DUcUserBlackExample example);

    int updateByPrimaryKeySelective(DUcUserBlack record);

    int updateByPrimaryKey(DUcUserBlack record);
}