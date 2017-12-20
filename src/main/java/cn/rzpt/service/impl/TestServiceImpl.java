package cn.rzpt.service.impl;

import cn.rzpt.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{
    public void test() {
        System.out.println("测试service");
    }
}
