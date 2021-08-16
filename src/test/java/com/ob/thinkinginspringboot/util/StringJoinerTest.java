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
        String originalStr = "824612199\n" +
                "664773773\n" +
                "829974802\n" +
                "828988480\n" +
                "824655552\n" +
                "829974879\n" +
                "827855967\n" +
                "769173997\n" +
                "725830732\n" +
                "834071645\n" +
                "795127020\n" +
                "829974882";
        String[] split = originalStr.split("\n");
        List<String> strings = Arrays.asList(split);
        StringJoiner joiner = new StringJoiner("','27-", "'27-", "'");
        for (String string : strings) {
            joiner.add(string);
        }
        System.out.println(joiner.toString());

    }
}

