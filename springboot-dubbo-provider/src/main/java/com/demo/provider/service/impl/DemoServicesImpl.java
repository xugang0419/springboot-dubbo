package com.demo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.api.DemoServices;

@Service(version = "1.0.0")
public class DemoServicesImpl implements DemoServices
{

    @Override
    public String toProvider() throws Exception {
        return "恭喜你连接成功,我是提供者";

    }

}
