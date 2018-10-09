package com.ant.p2p.service.loan;

import com.alibaba.dubbo.config.annotation.Service;
import com.ant.p2p.common.constant.Constants;
import com.ant.p2p.mapper.loan.LoanInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * ClassName:LoanInfoServiceImpl
 * Package:com.ant.p2p.service.loan
 * Description:
 *
 * @Date 2018/9/21 14:22
 * @Author guoxin
 * @Email:41700175@qq.com
 */
//使用spring的注解将此实现类变成spring的bean
@Component
@Service //使用dubbo的注解
public class LoanInfoServiceImpl implements LoanInfoService {

    @Autowired
    private LoanInfoMapper loanInfoMapper;

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public Double queryHistoryAverageRate() {
        //设置redis中key的序列化方式
        redisTemplate.setKeySerializer(new StringRedisSerializer());

        //从redis缓存中获取指定key的值
        Double historyAverageRate = (Double) redisTemplate.opsForValue().get(Constants.HISTORY_AVERAGE_RATE);

        //判断是否为空
        if (null == historyAverageRate) {

            //去数据库查询
            historyAverageRate = loanInfoMapper.selectHistoryAverageRate();

            //设置失效时间
            redisTemplate.opsForValue().set(Constants.HISTORY_AVERAGE_RATE,historyAverageRate,15, TimeUnit.MINUTES);

        }

        return historyAverageRate;
    }
}
