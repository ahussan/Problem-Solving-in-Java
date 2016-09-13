package codingbat.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by anjalhussan on 9/11/16.
 */

/*

Modify and return the given map as follows:
for this problem the map may or may not contain
the "a" and "b" keys.
If both keys are present, append their 2 string
values together and store the result under the key "ab".

mapAB({"b": "There", "a": "Hi"}) → {"b": "There", "a": "Hi", "ab": "HiThere"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
http://codingbat.com/prob/p107259
 */
public class MapAB {


    public static void main(String [] args){
        Map<String, String> mymap = new HashMap<>();
        mymap.put("b", "There");
        mymap.put("a", "Hi");
        printMap(mapAB(mymap));


    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a")){
            if (map.containsKey("b")){
                map.put("ab",map.get("a").concat(map.get("b")));
            }
        }
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
