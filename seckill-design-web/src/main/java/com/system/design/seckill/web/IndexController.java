package com.system.design.seckill.web;

import com.system.design.seckill.common.api.IKillBuzService;
import com.system.design.seckill.common.api.IOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author chengzhengzheng
 * @date 2021/10/26
 */
@RestController
@RequestMapping("/v1")
public class IndexController {
    @Resource
    private IOrderService killBuzService;

    @GetMapping(value = "/kill")
    public Long doKill(long killId, String userId) {
        return killBuzService.doKill(killId, userId);
    }
}
