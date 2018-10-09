package com.ant.p2p.service.loan;

import com.ant.p2p.model.loan.LoanInfo;

import java.util.List;

/**
 * ClassName:LoanInfoService
 * Package:com.ant.p2p.service.loan
 * Description:
 *
 * @Date 2018/9/21 14:20
 * @Author guoxin
 * @Email:41700175@qq.com
 */
public interface LoanInfoService {


    /**
     * 获取历史平均年化收益率
     * @return
     */
    Double queryHistoryAverageRate();

    /**
     * 根据产品类型获取最新产品列表
     * @param productType
     * @return
     */
    List<LoanInfo> queryLoanInfoTopByProductType(Integer productType);


    /**
     * 根据产品标识获取产品
     * @param id
     * @return
     */
    LoanInfo queryLoanInfoById(Integer id);
}
