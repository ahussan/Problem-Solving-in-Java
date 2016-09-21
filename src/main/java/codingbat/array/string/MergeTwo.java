package codingbat.array.string;

import Lib.UtilLib;

import java.util.*;


/**
 * Created by anjalhussan on 9/21/16.
 */
    /*http://codingbat.com/prob/p139150
    Start with two arrays of strings,
    A and B, each with its elements in alphabetical order
    & without duplicates. Return a new array containing
    the first N elements from the two arrays.
    The result array should be in alphabetical order and
    without duplicates. A and B will both have a length which is N or more.
    The best "linear" solution makes a single pass over A and B,
    taking advantage of the fact that they are in alphabetical order,
    copying elements directly to the new array.
    mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
    mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
    mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]
     */
public class MergeTwo {

    public static void main(String[] args) {
        String[] a = new String[]{"a", "c", "z"};
        String[] b = new String[]{"b", "f", "z"};
        UtilLib.printStringarray(mergeTwo(a,b,2));
    }

    public static  String[] mergeTwo(String[] a, String[] b, int n) {
        Object[] myarray ;
        List<String> mylist = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (mylist.contains(a[i])==false){
                mylist.add(a[i]);
            }
        }
        for (int j = 0; j < b.length; j++) {
            if (mylist.contains(b[j])==false){
                mylist.add(b[j]);
            }
        }
        Collections.sort(mylist);
        myarray = mylist.subList(0, n).toArray();
        String [] myStringarray = new String[myarray.length];
        for (int i = 0; i < myarray.length; i++) {
            myStringarray[i]=myarray[i].toString();
        }
        return myStringarray;
    }

}
