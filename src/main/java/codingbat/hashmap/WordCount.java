package codingbat.hashmap;

import Lib.UtilLib;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by anjalhussan on 10/3/16.
 */

/*
The classic word-count algorithm:
given an array of strings, return a Map<String,
Integer> with a key for each different
string, with the value the number of times that string appears in the array.
wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
http://codingbat.com/prob/p117630
 */
public class WordCount {

    public static void main(String []args){
        String[] words=new String[]{"a", "b", "a", "c", "b"};
        String[] words2=new String[]{"c", "b", "a"};
        String[] words3=new String[]{"c", "c", "c", "c"};

        UtilLib.printMap(wordCount(words));
        UtilLib.printMap(wordCount(words2));
        UtilLib.printMap(wordCount(words3));
    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map <String, Integer>counter = new HashMap();
        for (int i = 0; i <strings.length ; i++) {
            if (counter.containsKey(strings[i])){
                counter.put(strings[i], counter.get(strings[i])+1);
            } else {
                counter.put(strings[i],1);
            }
        }
        return counter;
    }
}
