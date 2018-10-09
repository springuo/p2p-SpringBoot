package com.ant.p2p.mapper.loan;

import com.ant.p2p.model.loan.LoanInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName:LoanInfoMapper
 * Package:com.ant.p2p.mapper.loan
 * Description:
 *
 * @Date 2018/9/18 8:56
 * @Author guoxin
 */
@Mapper
public interface LoanInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LoanInfo record);

    int insertSelective(LoanInfo record);

    LoanInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoanInfo record);

    int updateByPrimaryKeyWithBLOBs(LoanInfo record);

    int updateByPrimaryKey(LoanInfo record);

    /**
     * 获取历史平均年化收益率
     * @return
     */
    Double selectHistoryAverageRate();
}