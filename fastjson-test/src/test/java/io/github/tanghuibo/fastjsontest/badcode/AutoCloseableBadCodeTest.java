package io.github.tanghuibo.fastjsontest.badcode;

import org.junit.jupiter.api.Test;

/**
 * @author tanghuibo
 * @date 2021/8/1下午3:10
 */
public class AutoCloseableBadCodeTest {

    @Test
    public void setName() {
        AutoCloseableBadCode badCode = new AutoCloseableBadCode();
        badCode.setName("haha");
    }
}