package io.github.tanghuibo.fastjsontest.badcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author tanghuibo
 * @date 2021/8/1下午3:08
 */
public class RunnableBadCode implements Runnable {

    Logger log = LoggerFactory.getLogger(RunnableBadCode.class);

    public void setName(String name) {
        log.info("RunnableBadCode injection success: {}", name);
    }

    @Override
    public void run() {

    }
}
