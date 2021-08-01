package io.github.tanghuibo.fastjsontest.utils;

import com.alibaba.fastjson.JSON;
import io.github.tanghuibo.fastjsontest.badcode.BadCodeAble;
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

    @Test
    public void test3() {

        JSON.parseObject("{}", BadCodeAble.class);
        String jsonString = "{\"@type\":\"io.github.tanghuibo.fastjsontest.badcode.BadCodeAble\",\"@type\":\"io.github.tanghuibo.fastjsontest.badcode.BadCodeImpl\",\"name\":\"haha\"}";
        log.info("result {}", jsonString);
        Object result = JSON.parse(jsonString);
        log.info("result className {}", result.getClass().getName());

    }

    @Test
    public void test4() {
        System.out.println(JSON.parseObject("{\"a\": 1, \"a\":2}"));
    }
}

