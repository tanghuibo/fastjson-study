package io.github.tanghuibo.fastjsontest.badcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author tanghuibo
 * @date 2021/8/1下午3:08
 */
public class AutoCloseableBadCode implements AutoCloseable {

    Logger log = LoggerFactory.getLogger(AutoCloseableBadCode.class);

    public void setName(String name) {
        log.info("AutoCloseableBadCode injection success {}", name);
    }

    @Override
    public void close() throws Exception {

    }
}
