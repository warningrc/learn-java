package com.google.common.base;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CharMatcherTest {

    /**
     * Logger for CharMatcherTest
     */
    private static final Logger logger = LoggerFactory.getLogger(CharMatcherTest.class);

    @Test
    public void test() {
        String spaced = CharMatcher.WHITESPACE.trimAndCollapseFrom("this    is a    string  ", ' ');
        logger.info(spaced);
    }

}
