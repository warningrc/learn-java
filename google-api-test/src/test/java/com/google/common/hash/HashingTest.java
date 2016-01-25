package com.google.common.hash;

import lombok.Data;
import lombok.experimental.Builder;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Charsets;

public class HashingTest {

    /**
     * Logger for HashingTest
     */
    private static final Logger logger = LoggerFactory.getLogger(HashingTest.class);

    @Test
    public void test_murmur3_128() {
        HashCode hc = hashCode(Hashing.murmur3_128());
        logger.info("HashCode:int:{},long:{}", hc.asInt(), hc.asLong());

    }

    @Test
    public void test_md5() {
        HashCode hc = hashCode(Hashing.md5());
        logger.info("HashCode:int:{},long:{}", hc.asInt(), hc.asLong());

    }

    private HashCode hashCode(HashFunction hf) {
        Person person = new Person.PersonBuilder().age(24).id(123456L).name("warning").build();
        HashCode hc = hf.newHasher().putLong(person.getId()).putString(person.getName(), Charsets.UTF_8)
                .putObject(person, new Funnel<Person>() {

                    private static final long serialVersionUID = 1L;

                    @Override
                    public void funnel(Person person, PrimitiveSink into) {
                        into.putLong(person.getId()).putInt(person.getAge())
                                .putString(person.getName(), Charsets.UTF_8);
                    }
                }).hash();
        return hc;
    }

    @Data
    @Builder
    static class Person {

        private long id;

        private String name;

        private int age;
    }

}
