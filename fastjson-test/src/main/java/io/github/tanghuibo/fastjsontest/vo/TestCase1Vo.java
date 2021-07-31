package io.github.tanghuibo.fastjsontest.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author tanghuibo
 * @date 2021/8/1上午12:39
 */
public class TestCase1Vo {

    /**
     * message
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
