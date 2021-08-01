package io.github.tanghuibo.fastjsontest.utils;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author tanghuibo
 * @date 2021/8/1上午12:51
 */
public class FastjsonTest {

    Logger log = LoggerFactory.getLogger("test");

    @Test
    public void test1() {

        String jsonString = "{\"@type\":\"java.lang.AutoCloseable\",\"@type\":\"io.github.tanghuibo.fastjsontest.badcode.AutoCloseableBadCode\",\"msg\":\"haha\"}";
        log.info("result {}", jsonString);
        Object result = JSON.parse(jsonString);
        log.info("result className {}", result.getClass().getName());

    }


    @Test
    public void test2() {
        String jsonString = "{\"@type\":\"io.github.tanghuibo.fastjsontest.badcode.AutoCloseableBadCode\",\"msg\":\"haha\"}";
        log.info("result {}", jsonString);
        Object result = JSON.parseObject(jsonString, AutoCloseable.class);
        log.info("result className {}", result.getClass().getName());
    }
}

