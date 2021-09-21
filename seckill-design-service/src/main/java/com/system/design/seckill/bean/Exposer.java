package com.system.design.seckill.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chengzhengzheng
 * @date 2021/9/19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exposer {
    //是否开启秒杀
    private boolean exposed;
    //加密措施
    private String  md5;
    private long    seckillId;
    //系统当前时间(毫秒)
    private long    now;
    //秒杀的开启时间
    private long    start;
    //秒杀的结束时间
    private long    end;

    public static Exposer buildNotStaredExposer(long seckillId, long startTime, long endTime) {
        return new Exposer(false, "", seckillId, System.currentTimeMillis(), startTime, endTime);
    }

    public static Exposer buildHasStaredExpos(long seckillId, String md5,long startTime, long endTime) {
        return new Exposer(true, md5, seckillId, System.currentTimeMillis(), startTime, endTime);
    }
}
