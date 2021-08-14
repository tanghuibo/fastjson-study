package io.github.tanghuibo.fastjson.controller;

import io.github.tanghuibo.fastjson.request.TestRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanghuibo
 * @date 2021/8/15上午1:23
 */
@RequestMapping("test")
@RestController
public class TestController {

    @PostMapping
    public String postTest(@RequestBody TestRequest request) {
        return request.getName();
    }

}
