package codingbat.array.integer;

/**
 * Created by anjalhussan on 9/2/16.
 */
public class Has271 {
    /*
    Given an array of ints,
    return true if it contains a 2, 7, 1 pattern -- a value,
    followed by the value plus 5, followed by the value minus 1.
    Additionally the 271 counts even if the
    "1" differs by 2 or less from the correct value.

    patter271([1, 2, 7, 1]) → true
    patter271([1, 2, 8, 1]) → false
    patter271([2, 7, 1]) → true
     */

    public static void main(String[]args){
        int[]numbers=new int[]{1, 2, 7, 1};
        System.out.println(patter271(numbers)); //→ true
    }

    public static boolean patter271(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
            int val = nums[i];
            if (nums[i+1] == (val + 5) &&
                    Math.abs(nums[i+2] - (val-1)) <= 2) {
                return true;
            }
        }
        return false;
    }
}
