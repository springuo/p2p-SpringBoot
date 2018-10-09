package com.ant.p2p.mapper.loan;

import com.ant.p2p.model.loan.IncomeRecord;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName:IncomeRecordMapper
 * Package:com.ant.p2p.mapper.loan
 * Description:
 *
 * @Date 2018/9/18 8:56
 * @Author guoxin
 */
@Mapper
public interface IncomeRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IncomeRecord record);

    int insertSelective(IncomeRecord record);

    IncomeRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IncomeRecord record);

    int updateByPrimaryKey(IncomeRecord record);
}