package com.rakovets.course.java.core.practice.jcf_collection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class StringCollectionUtilTest {
    private StringCollectionUtil collectionUtil;
    private Collection<String> collection;

    @BeforeEach
    void init() {
        collection = new ArrayList<>();
        collection.add("hello");
        collection.add("java");
        collection.add("programmer");
        collectionUtil = new StringCollectionUtil();
    }

    @Test
    void resetWordsByLengthTest1() {
        collection = collectionUtil.resetWordsByLength(collection, 4);
        boolean expected = collection.equals((new ArrayList<>(Arrays.asList("hello", "*", "programmer"))));

        System.out.println(collection);
        Assertions.assertTrue(expected);
    }

    @Test
    void resetWordsByLengthTest2() {
        collection = collectionUtil.resetWordsByLength(collection, 2);
        boolean expected = collection.equals((new ArrayList<>(Arrays.asList("hello", "*", "programmer"))));

        System.out.println(collection);
        Assertions.assertFalse(expected);
    }

    @Test
    void removeWordsByLengthTest1() {
        collection = collectionUtil.removeWordsByLength(collection, 5);
        boolean expected = collection.equals(new ArrayList<>(Arrays.asList("java", "programmer")));

        System.out.println(collection);
        Assertions.assertTrue(expected);
    }

    @Test
    void removeWordsByLengthTest2() {
        collection = collectionUtil.removeWordsByLength(collection, 4);
        boolean expected = collection.equals(new ArrayList<>(Arrays.asList("java", "programmer")));

        System.out.println(collection);
        Assertions.assertFalse(expected);
    }
}
