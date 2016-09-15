package codingbat.hashmap;

import java.util.HashMap;
import java.util.Map;

import static Lib.UtilLib.printMap;

/**
 * Created by anjalhussan on 9/9/16.
 */

/*
    Given an array of non-empty strings,
    create and return a Map<String, String> as follows:
    for each string add its first character as a
    key with its last character as the value.
    pairs(["code", "bug"]) → {"b": "g", "c": "e"}
    pairs(["man", "moon", "main"]) → {"m": "n"}
    pairs(["man", "moon", "good", "night"]) → {"g": "d", "n": "t", "m": "n"}
    http://codingbat.com/prob/p126332
 */

public class MapPairs {

    public static void main(String [] args){
        String[] wordLen=new String[]{"man", "moon", "good", "night"};
        printMap(pairs(wordLen));

    }


    public static Map<String, String> pairs(String[] strings) {
        Map<String, String>pair = new HashMap();
        for (int i = 0; i < strings.length; i++) {
            int length = strings[i].length();
            pair.put(strings[i].substring(0, 1), strings[i].substring(length-1, length));
        }
        return pair;

    }
}
