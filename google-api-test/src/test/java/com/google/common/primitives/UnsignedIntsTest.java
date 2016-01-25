package com.google.common.primitives;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnsignedIntsTest {

    /**
     * Logger for UnsignedIntsTest
     */
    private static final Logger logger = LoggerFactory.getLogger(UnsignedIntsTest.class);

    @Test
    public void test() {
        int notReallyInt = UnsignedInts.parseUnsignedInt("4294967295"); // Max
                                                                        // unsigned
                                                                        // int

        String maxUnsigned = UnsignedInts.toString(notReallyInt); // We’re
                                                                  // legit!

        logger.info(maxUnsigned);
    }

}
