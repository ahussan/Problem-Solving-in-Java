package codingbat.array.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anjalhussan on 9/20/16.
 */

/*
Start with two arrays of strings, a and b, each in alphabetical order,
possibly with duplicates. Return the count of the number of strings which appear
in both arrays. The best "linear" solution makes a single pass over both arrays,
taking advantage of the fact that they are in alphabetical order.

commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
http://codingbat.com/prob/p100369
 */

public class CommonTwo {


    public static void main(String[] args){
        String [] a = new String[]{"a", "c", "x"};
        String [] b = new String[]{"a", "c", "x"};
        String [] c = new String[]{"a", "a", "b", "b", "c"};
        String [] d = new String[]{"a", "b", "c"};

        String [] x = new String[]{"a", "a", "b", "b", "c"};
        String [] y = new String[]{"b", "b", "b", "x"};
        //commonTwo(["a", "a", "b", "b", "c"], ["b", "b", "b"]) → 1

        String [] p = new String[]{"a", "a", "b", "b", "c"};
        String [] q = new String[]{"b", "b", "b"};
        //commonTwo(["a", "a", "b", "b", "c"], ["b", "b", "b", "x"]) → 1
        System.out.println(commonTwo(a, b));
        System.out.println(commonTwo(c, d));
        System.out.println(commonTwo(x, y));
        System.out.println(commonTwo(p, q));

    }

    public static int commonTwo(String[] a, String[] b) {
        String [] shorter;
        String [] longer;
        List<String> value = new ArrayList<>();
        if (a.length>b.length){
            longer=a.clone();
            shorter=b.clone();
        }else {
            longer=b.clone();
            shorter=a.clone();
        }
        for (int i = 0; i <shorter.length ; i++) {
            for (int j = 0; j <longer.length ; j++) {
                if (shorter[i].equalsIgnoreCase(longer[j])==true && value.contains(shorter[i])!=true){
                    value.add(shorter[i]);
                    break;
                }
            }
        }
        return value.size();
    }


}
