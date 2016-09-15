package Lib;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by anjalhussan on 9/15/16.
 */
public class UtilLib {

    public static void printarray(int[] nums){
        System.out.println(Arrays.toString(nums));
    }

    public static void printMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }
    }
}
