package codingbat.array.integer.problemsets2;

import Lib.UtilLib;
import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anjalhussan on 9/16/16.
 */

/*

Return an array that contains exactly
the same numbers as the given array,
but rearranged so that every 3 is
immediately followed by a 4.
Do not move the 3's,
but every other number may move.
The array contains the same number of 3's and 4's,
every 3 has a number after it that is not a 3 or 4,
and a 3 appears in the array before any 4.

fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
 */
public class Fix34 {
    public static void main(String[] args){
        int [] numbers = new int[]{1, 3, 1, 4};
        UtilLib.printIntarray(fix34(numbers));

    }

    public static int[] fix34(int[] nums) {
        List<Integer> indexof3 = new ArrayList();
        List<Integer> indexof4 = new ArrayList();
        List<Integer> allothernumber = new ArrayList();
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==4){
                indexof4.add(i);
            }
            else if (nums[i]==3){
                indexof3.add(i);
            }else {
                allothernumber.add(nums[i]);
            }
        }
        for (int i = 0; i < indexof3.size(); i++) {
            result[indexof3.get(i)]=3;
            result[indexof3.get(i)+1]=4;
        }
        int counter=0;
        for (int i = 0; i < nums.length; i++) {
            if (result[i]!=3&&result[i]!=4){
                result[i]=allothernumber.get(counter);
                counter++;
            }
        }
        return result;
    }
}
