package com.demo.consumer.service.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.api.DemoServices;
import com.demo.consumer.service.DemoServiceCon;

/**
 * 消费服务实现
 * @author ch
 *
 */
@Component
public class DemoServiceConImpl implements DemoServiceCon
{

    @Reference(version = "1.0.0", check = false)
    private DemoServices demoServices;

    @Override
    public String ConService() throws Exception {
        return "RPC返回：" + demoServices.toProvider();

    }

}
