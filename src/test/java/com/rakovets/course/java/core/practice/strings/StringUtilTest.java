package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StringUtilTest {
    static StringUtil stringUtil;
    @BeforeAll
    static void init () {
     stringUtil = new StringUtil();
    }

    @Test
    void stringGluingTest01() {
        String abx = stringUtil.stringGluing("abc", "cba");

        Assertions.assertEquals("abccba", abx);
    }

    @Test
    void stringGluingTest02() {
        String abx = stringUtil.stringGluing("abc", null);

        Assertions.assertEquals("abc", abx);
    }

    @Test
    void stringGluingTest03() {
        String abx = stringUtil.stringGluing(null, "cba");

        Assertions.assertEquals("cba", abx);
    }

    @Test
    void stringGluingTest04() {
        String abx = stringUtil.stringGluing(null, null);

        Assertions.assertEquals("", abx);
    }

    @Test
    void indexOfCharTest01() {
        int[] abx = stringUtil.indexesOfChar(null, '\u0000');

        Assertions.assertEquals(int[]{}, abx);
    }
}
