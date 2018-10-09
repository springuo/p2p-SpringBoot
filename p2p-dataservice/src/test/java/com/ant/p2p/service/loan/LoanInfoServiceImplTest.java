package com.ant.p2p.service.loan;

import com.ant.p2p.DataserviceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ClassName:LoanInfoServiceImplTest
 * Package:com.ant.p2p.service.loan
 * Description:
 *
 * @Date 2018/9/21 15:57
 * @Author guoxin
 * @Email:41700175@qq.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
//springboot的启动入口类
@SpringBootTest(classes = DataserviceApplication.class)
public class LoanInfoServiceImplTest {

    @Autowired
    private LoanInfoService loanInfoService;

    @Test
    public void queryHistoryAverageRate() {
        Double historyAverageRate = loanInfoService.queryHistoryAverageRate();
        System.out.println("=========历史平均年化收益率===========：" + historyAverageRate);
    }
}