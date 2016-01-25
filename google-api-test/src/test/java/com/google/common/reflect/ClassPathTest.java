package com.google.common.reflect;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassPathTest {

    /**
     * Logger for ClassPathTest
     */
    private static final Logger logger = LoggerFactory.getLogger(ClassPathTest.class);

    @Test
    public void test_getTopLevelClasses() throws Exception {
        ClassPath classpath = ClassPath.from(Thread.currentThread().getContextClassLoader());
        for (ClassPath.ClassInfo classInfo : classpath.getTopLevelClasses(this.getClass().getPackage().getName())) {
            logger.info(classInfo.getName());
        }
    }

}
