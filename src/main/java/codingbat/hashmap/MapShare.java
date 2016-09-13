package codingbat.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by anjalhussan on 9/11/16.
 */

/*

    Modify and return the given map as follows:
    if the key "a" has a value, set the key "b" to have that same value.
    In all cases remove the key "c", leaving the rest of the map unchanged.
    mapShare({"b": "bbb", "c": "ccc", "a": "aaa"}) → {"b": "aaa", "a": "aaa"}
    mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
    mapShare({"d": "hi", "c": "meh", "a": "aaa"}) → {"d": "hi", "b": "aaa", "a": "aaa"}
    http://codingbat.com/prob/p148813
 */
public class MapShare {


    public static void main(String [] args){
        Map<String, String> mymap = new HashMap<>();
        mymap.put("a", "aaa");
        mymap.put("b", "bbb");
        mymap.put("c", "ccc");
        printMap(mapShare(mymap));



    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")){
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }


    public static void printMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }
    }
}
