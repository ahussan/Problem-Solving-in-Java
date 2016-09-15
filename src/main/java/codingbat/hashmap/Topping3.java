package codingbat.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static Lib.UtilLib.printMap;

/**
 * Created by anjalhussan on 9/11/16.
 */

/*


Given a map of food keys and topping values,
modify and return the map as follows:
if the key "potato" has a value,
set that as the value for the key "fries".
If the key "salad" has a value,
set that as the value for the key "spinach".

topping3({"potato": "ketchup"}) → {"fries": "ketchup", "potato": "ketchup"}
topping3({"potato": "butter"}) → {"fries": "butter", "potato": "butter"}
topping3({"salad": "oil", "potato": "ketchup"}) → {"salad": "oil", "fries": "ketchup", "spinach": "oil", "potato": "ketchup"}
http://codingbat.com/prob/p128461
 */
public class Topping3 {


    public static void main(String [] args){
        Map<String, String> mymap = new HashMap<>();
        mymap.put("potato", "ketchup");
        mymap.put("salad", "oil");
        printMap(mymap);
        System.out.println(" ===== After Modifying =====");
        printMap(topping3(mymap));
    }

    public static Map<String, String> topping3(Map<String, String> map) {
        if (map.get("potato")!=null){
            map.put("fries", map.get("potato"));
        }
        if (map.get("salad")!=null){
            map.put("spinach", map.get("salad"));
        }

        return map;
    }
}
