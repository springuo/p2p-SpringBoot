package com.ant.p2p.mapper.user;

import com.ant.p2p.model.user.FinanceAccount;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName:FinanceAccountMapper
 * Package:com.ant.p2p.mapper.user
 * Description:
 *
 * @Date 2018/9/18 8:56
 * @Author guoxin
 */
@Mapper
public interface FinanceAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FinanceAccount record);

    int insertSelective(FinanceAccount record);

    FinanceAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FinanceAccount record);

    int updateByPrimaryKey(FinanceAccount record);
}