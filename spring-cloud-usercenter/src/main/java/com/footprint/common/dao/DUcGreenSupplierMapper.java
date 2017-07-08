package com.footprint.common.dao;

import com.footprint.common.model.DUcGreenSupplier;
import com.footprint.common.model.DUcGreenSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcGreenSupplierMapper {
    long countByExample(DUcGreenSupplierExample example);

    int deleteByExample(DUcGreenSupplierExample example);

    int deleteByPrimaryKey(String id);

    int insert(DUcGreenSupplier record);

    int insertSelective(DUcGreenSupplier record);

    List<DUcGreenSupplier> selectByExample(DUcGreenSupplierExample example);

    DUcGreenSupplier selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DUcGreenSupplier record, @Param("example") DUcGreenSupplierExample example);

    int updateByExample(@Param("record") DUcGreenSupplier record, @Param("example") DUcGreenSupplierExample example);

    int updateByPrimaryKeySelective(DUcGreenSupplier record);

    int updateByPrimaryKey(DUcGreenSupplier record);
}