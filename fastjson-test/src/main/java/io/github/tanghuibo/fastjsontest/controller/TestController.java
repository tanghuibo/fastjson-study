package io.github.tanghuibo.fastjsontest.controller;

import io.github.tanghuibo.fastjsontest.request.TestCase1Request;
import io.github.tanghuibo.fastjsontest.vo.TestCase1Vo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanghuibo
 * @date 2021/8/1上午12:37
 */
@RestController
@RequestMapping("test")
public class TestController {

    /**
     * spring mvc 接入 fastjson 序列化测试
     *
     * curl --location --request POST 'http://127.0.0.1:8080/test/case1' --header 'Content-Type: application/json' --data-raw '{"msg": "data1"}'
     *
     * @param request
     * @return
     */
    @PostMapping("case1")
    public TestCase1Vo test1(@RequestBody TestCase1Request request) {
        TestCase1Vo vo = new TestCase1Vo();
        vo.setMessage(request.getMessage());
        return vo;
    }
}
