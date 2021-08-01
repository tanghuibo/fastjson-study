package io.github.tanghuibo.fastjsontest.badcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.CharBuffer;

/**
 * @author tanghuibo
 * @date 2021/8/1下午3:34
 */
public class ReadableBadCode implements Readable {

    Logger log = LoggerFactory.getLogger(ReadableBadCode.class);

    public void setName(String name) {
        log.info("ReadableBadCode injection success: {}", name);
    }


    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }
}
