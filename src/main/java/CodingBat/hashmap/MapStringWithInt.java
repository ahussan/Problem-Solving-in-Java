package codingbat.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by anjalhussan on 9/9/16.
 */

/*

Given an array of strings,
return a Map<String, Integer> containing
a key for every different string in the array,
always with the value 0. For example the string
"hello" makes the pair "hello":0. We'll do more
complicated counting later, but for this problem the value is simply 0.
word0(["a", "b", "a", "b"]) → {"b": 0, "a": 0}
word0(["a", "b", "a", "c", "b"]) → {"b": 0, "c": 0, "a": 0}
word0(["c", "b", "a"]) → {"b": 0, "c": 0, "a": 0}
 */
public class MapStringWithInt {

    public static void main(String [] args){
        String[] word0=new String[]{"a", "b", "a", "b"};// → {"b": 0, "a": 0}

        printMap(word0(word0));
    }
    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> myMap = new HashMap();
        for (int i = 0; i < strings.length; i++) {
            myMap.put(strings[i], 0);
        }
        return myMap;
    }

    public static void printMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
    }


}
