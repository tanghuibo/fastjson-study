package io.github.tanghuibo.fastjsontest.badcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author tanghuibo
 * @date 2021/8/1下午3:08
 */
public class BadCodeImpl implements BadCodeAble {

    Logger log = LoggerFactory.getLogger(BadCodeImpl.class);

    public void setName(String name) {
        log.info("BadCodeImpl injection success {}", name);
    }
}
