package com.ob.thinkinginspringboot.util;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

/**
 * Test
 *
 * @author oubin.ob
 * @version : Test.java v 0.1 2021/8/14 11:01 oubin.ob Exp $$
 */
public class StringJoinerTest {

    public static void main(String[] args) {
        String originalStr = "829970993\n" +
                "829900478\n" +
                "829787586\n" +
                "834699032\n" +
                "827811575\n" +
                "647895417";
        String[] split = originalStr.split("\n");
        List<String> strings = Arrays.asList(split);
        StringJoiner joiner = new StringJoiner("','27-", "'27-", "'");
        for (String string : strings) {
            joiner.add(string);
        }
        System.out.println(joiner.toString());

    }
}

