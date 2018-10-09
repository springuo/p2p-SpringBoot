package com.ant.p2p.mapper.loan;

import com.ant.p2p.model.loan.RechargeRecord;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName:RechargeRecordMapper
 * Package:com.ant.p2p.mapper.loan
 * Description:
 *
 * @Date 2018/9/18 8:56
 * @Author guoxin
 */
@Mapper
public interface RechargeRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RechargeRecord record);

    int insertSelective(RechargeRecord record);

    RechargeRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RechargeRecord record);

    int updateByPrimaryKey(RechargeRecord record);
}