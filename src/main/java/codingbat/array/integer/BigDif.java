package codingbat.array.integer;

/**
 * Created by anjalhussan on 8/31/16.
 */

/*
problem Statement:

Given an array length 1 or more of ints,
return the difference between the largest and smallest
values in the array.
Note: the built-in Math.min(v1, v2)
and Math.max(v1, v2) methods return the smaller or larger of two values.

bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
http://codingbat.com/prob/p196640
 */
public class BigDif {

    public static void main(String[] args){
        int []numbers = new int[]{2, 10, 7, 2};
        System.out.println(bigDiff(numbers));
    }

    public static int bigDiff(int[] nums) {
        int max=nums[0], min=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max<nums[i]){
                max=nums[i];
            }
            if (min>nums[i]){
                min=nums[i];
            }
        }
        return max-min;
    }
}

