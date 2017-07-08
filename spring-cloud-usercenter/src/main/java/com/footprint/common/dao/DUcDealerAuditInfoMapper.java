package com.footprint.common.dao;

import com.footprint.common.model.DUcDealerAuditInfo;
import com.footprint.common.model.DUcDealerAuditInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DUcDealerAuditInfoMapper {
    long countByExample(DUcDealerAuditInfoExample example);

    int deleteByExample(DUcDealerAuditInfoExample example);

    int insert(DUcDealerAuditInfo record);

    int insertSelective(DUcDealerAuditInfo record);

    List<DUcDealerAuditInfo> selectByExample(DUcDealerAuditInfoExample example);

    int updateByExampleSelective(@Param("record") DUcDealerAuditInfo record, @Param("example") DUcDealerAuditInfoExample example);

    int updateByExample(@Param("record") DUcDealerAuditInfo record, @Param("example") DUcDealerAuditInfoExample example);
}