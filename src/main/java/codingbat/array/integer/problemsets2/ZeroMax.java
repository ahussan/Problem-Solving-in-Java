package codingbat.array.integer.problemsets2;

import Lib.UtilLib;


/**
 * Created by anjalhussan on 9/19/16.
 */

/*

Return a version of the given array
where each zero value in the array is
replaced by the largest odd value to the
right of the zero in the array.
If there is no odd value to the right of the zero,
leave the zero as a zero.
zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]
http://codingbat.com/prob/p187050
 */
public class ZeroMax {
    // not done

    public static void main(String[] args) {
        int[] nums = new int[]{7, 0, 4, 3, 0, 2};
        //7, 0, 1, 0, 0, 7]
        //7, 0, 4, 3, 0, 2
        //7, 0, 4, 3, 0, 2
        UtilLib.printIntarray(zeroMax(nums));
    }

    public static int[] zeroMax(int[] nums) {
        int a[] = new int[nums.length];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] > max && nums[j] % 2 == 1)
                        max = nums[j];
                }
            }
            if (nums[i] == 0)
                a[i] = max;
            else
                a[i] = nums[i];
            max = 0;
        }
        return a;
    }

}
