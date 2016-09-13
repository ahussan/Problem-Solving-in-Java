package codingbat.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by anjalhussan on 9/11/16.
 */

/*

Given a map of food keys and their topping values,
modify and return the map as follows:
if the key "ice cream" has a value,
set that as the value for the key "yogurt" also.
If the key "spinach" has a value, change that value to "nuts".

topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
http://codingbat.com/prob/p196458
 */
public class Topping2 {


    public static void main(String [] args){
        Map<String, String> mymap = new HashMap<>();
        mymap.put("spinach", "dirt");
        mymap.put("ice cream", "cherry");
        printMap(mymap);
        System.out.println(" ===== After Modifying =====");
        printMap(topping2(mymap));
    }

    public static Map<String, String> topping2(Map<String, String> map) {
        if (map.get("ice cream")!=null){
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.get("spinach")!=null){
            map.put("spinach", "nuts");
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
