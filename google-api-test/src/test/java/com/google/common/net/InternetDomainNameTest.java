package com.google.common.net;

import junit.framework.Assert;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InternetDomainNameTest {

    /**
     * Logger for InternetDomainNameTest
     */
    private static final Logger logger = LoggerFactory.getLogger(InternetDomainNameTest.class);

    @Test
    public void test_topPrivateDomain() {
        InternetDomainName owner = InternetDomainName.from("blog.warningrc.com").topPrivateDomain();
        Assert.assertEquals("warningrc.com", owner.name());
        logger.info("parts:{}", owner.parts());
    }

    @Test
    public void test_isValid() throws Exception {
        Assert.assertTrue(InternetDomainName.isValid("warningrc.com"));
    }
}
