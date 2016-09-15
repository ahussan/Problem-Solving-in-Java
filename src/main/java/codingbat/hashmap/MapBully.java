package codingbat.hashmap;

import Lib.UtilLib;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by anjalhussan on 9/11/16.
 */

    /*
    Modify and return the given map as follows:
    if the key "a" has a value, set the key "b" to
    have that value, and set the key "a" to have the value "".
    Basically "b" is a bully, taking the value and
    replacing it with the empty string.
    mapBully({"b": "dirt", "a": "candy"}) → {"b": "candy", "a": ""}
    mapBully({"a": "candy"}) → {"b": "candy", "a": ""}
    mapBully({"b": "carrot", "c": "meh", "a": "candy"}) → {"b": "candy", "c": "meh", "a": ""}
    http://codingbat.com/prob/p197888
     */

public class MapBully {

    public static void main(String [] args){
        Map<String, String> mymap = new HashMap<>();
        mymap.put("a", "Candy");
        mymap.put("b", "Carrot");
        UtilLib.printMap(mymap);
        System.out.println("=========");
        UtilLib.printMap(mapBully(mymap));

    }

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")){
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

}
