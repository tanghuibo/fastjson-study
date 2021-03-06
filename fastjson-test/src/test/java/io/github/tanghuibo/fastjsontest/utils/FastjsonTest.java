package io.github.tanghuibo.fastjsontest.utils;

import com.alibaba.fastjson.JSON;
import io.github.tanghuibo.fastjsontest.badcode.AutoCloseableBadCode;
import io.github.tanghuibo.fastjsontest.badcode.BadCodeAble;
import io.github.tanghuibo.fastjsontest.badcode.BadCodeInnerBean;
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
        //两个相同的 key 能过 ??
        log.info("result {}", JSON.parseObject("{\"a\": 1, \"a\":2}"));
    }

    @Test
    public void test5() {
        JSON.parseObject("{\n" +
                "  \"test\": {\n" +
                "    \"name\": \"gaga\"\n" +
                "  }\n" +
                "}", BadCodeInnerBean.class);

        String jsonString = "{\"@type\":\"io.github.tanghuibo.fastjsontest.badcode.BadCodeImpl\",\"name\":\"haha\"}";
        log.info("result {}", jsonString);
        Object result = JSON.parse(jsonString);
        log.info("result className {}", result.getClass().getName());

    }

    @Test
    public void test6() {
        String jsonString = "{\"@type\":\"io.github.tanghuibo.fastjsontest.badcode.AutoCloseableBadCode\",\"msg\":\"haha\"}";
        log.info("result {}", jsonString);
        Object result = JSON.parseObject(jsonString, AutoCloseable.class);
        log.info("result className {}", result.getClass().getName());
    }

    @Test
    public void test7() {
        String jsonString = "{\"@type\":\"io.github.tanghuibo.fastjsontest.badcode.AutoCloseableBadCode\",\"msg\":\"haha\"}";
        log.info("result {}", jsonString);
        JSON.parseObject("{}", AutoCloseableBadCode.class);
        Object result = JSON.parseObject(jsonString);
        log.info("result className {}", result.getClass().getName());
    }
}

