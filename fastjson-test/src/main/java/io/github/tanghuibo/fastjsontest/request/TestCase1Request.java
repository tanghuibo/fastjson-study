package io.github.tanghuibo.fastjsontest.request;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author tanghuibo
 * @date 2021/8/1上午12:38
 */
public class TestCase1Request {

    /**
     * 名称
     */
    @JSONField(name = "msg")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
