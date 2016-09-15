package codingbat.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static Lib.UtilLib.printMap;

/**
 * Created by anjalhussan on 9/9/16.
 */
/*
    Given an array of strings,
    return a Map<String, Integer> containing
    a key for every different string in the array,
    and the value is that string's length.
    wordLen(["a", "bb", "a", "bb"]) → {"a": 1, "bb": 2}
    wordLen(["this", "and", "that", "and"]) → {"that": 4, "this": 4, "and": 3}
    wordLen(["code", "code", "code", "bug"]) → {"bug": 3, "code": 4}
 */

public class MapWordLen {

    public static void main(String [] args){
        String[] wordLen=new String[]{"a", "bb", "a", "bb","cccc"};
        printMap(findwordLen(wordLen));

    }
    public static Map<String, Integer> findwordLen(String[] strings) {
        Map<String, Integer> hashmap = new HashMap();
        for (int i = 0; i < strings.length; i++) {
            hashmap.put(strings[i], strings[i].length());
        }
        return hashmap;
    }


}
