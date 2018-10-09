package com.ant.p2p.mapper.loan;

import com.ant.p2p.model.loan.BidInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName:BidInfoMapper
 * Package:com.ant.p2p.mapper.loan
 * Description:
 *
 * @Date 2018/9/18 8:56
 * @Author guoxin
 */
@Mapper
public interface BidInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BidInfo record);

    int insertSelective(BidInfo record);

    BidInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BidInfo record);

    int updateByPrimaryKey(BidInfo record);
}