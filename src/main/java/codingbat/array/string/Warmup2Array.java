package codingbat.array.string;

/**
 * Created by anjalhussan on 9/7/16.
 */
public class Warmup2Array {
    /*
    Given an array of ints, return
    the number of times that two 6's are
    next to each other in the array.
    Also count instances where the second "6" is actually a 7.
    array667([6, 6, 2]) → 1
    array667([6, 6, 2, 6]) → 1
    array667([6, 7, 2, 6]) → 1
     */

    public static void main(String [] args){
        int [] numbers = new int[]{6, 7, 2, 6};
        System.out.println(array667(numbers));
    }

    public static int array667(int[] nums) {
        int result =0;
        for (int i = 0; i <nums.length-1 ; i++) {
            if (nums[i]==6){
                if (nums[i+1]==6||nums[i+1]==7){
                    result = result+1;
                }
            }

        }
        return result;
    }

    /*
    array667([6, 6, 2]) → 1	1	OK
    array667([6, 6, 2, 6]) → 1	1	OK
    array667([6, 7, 2, 6]) → 1	1	OK
    array667([6, 6, 2, 6, 7]) → 2	2	OK
    array667([1, 6, 3]) → 0	0	OK
    array667([6, 1]) → 0	0	OK
    array667([]) → 0	0	OK
    array667([3, 6, 7, 6]) → 1	1	OK
    array667([3, 6, 6, 7]) → 2	2	OK
    array667([6, 3, 6, 6]) → 1	1	OK
    array667([6, 7, 6, 6]) → 2	2	OK
    array667([1, 2, 3, 5, 6]) → 0	0	OK
    array667([1, 2, 3, 6, 6]) → 1	1	OK

     */
}
