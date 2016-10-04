package codingbat.array.integer.problemsets2;

/**
 * Created by anjalhussan on 9/22/16.
 */
/*
    We'll say that a "mirror" section in an array is
    a group of contiguous elements such that
    somewhere in the array, the same group appears
    in reverse order.
    For example, the largest mirror section
    in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
    Return the size of the largest mirror section found in the given array.

    maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
    maxMirror([1, 2, 1, 4]) → 3
    maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
    http://codingbat.com/prob/p196409
 */
public class MaxMirror {

    public static void main(String[]args){
        int [] luckyArray=new int[]{0, 2, 4};
        int [] findMirror=new int[]{5, 9, 1, 6, 5, 4, 1, 9, 5};
        System.out.println(maxMirror(luckyArray));
        System.out.println(maxMirror(findMirror));
    }

    public static int maxMirror(int[] nums) {
        final int len = nums.length;
        if (len == 0)
            return 0;
        int maxCount = 1;
        boolean flag = false;

        for (int i = 0; i < len; i++) {
            int tempCount = 1;
            int count = i;

            for (int j = len - 1; j >= 0 && (count < len); j--) {
                if (nums[count] == nums[j] && !flag) {
                    flag = true;
                    count++;
                    continue;
                }
                if (nums[count] == nums[j] && flag) {
                    tempCount++;
                    count++;
                    maxCount = (tempCount > maxCount) ? tempCount : maxCount;
                    continue;
                }
                if (nums[i] != nums[j] && flag) {
                    flag = false;
                    count = i;
                    tempCount = 1;
                    continue;
                }
                if (j == count || (j - count) == 1) {
                    flag = false;
                    break;
                }

            }
        }
        return maxCount;
    }
}
/*
    Test and Results
    maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3	3	OK
    maxMirror([1, 2, 1, 4]) → 3	3	OK
    maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2	2	OK
    maxMirror([21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9]) → 4	4	OK
    maxMirror([1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25]) → 4	4	OK
    maxMirror([1, 2, 3, 2, 1]) → 5	5	OK
    maxMirror([1, 2, 3, 3, 8]) → 2	2	OK
    maxMirror([1, 2, 7, 8, 1, 7, 2]) → 2	2	OK
    maxMirror([1, 1, 1]) → 3	3	OK
    maxMirror([1]) → 1	1	OK
    maxMirror([]) → 0	0	OK
    maxMirror([9, 1, 1, 4, 2, 1, 1, 1]) → 3	3	OK
    maxMirror([5, 9, 9, 4, 5, 4, 9, 9, 2]) → 7	7	OK
    maxMirror([5, 9, 9, 6, 5, 4, 9, 9, 2]) → 2	2	OK
    maxMirror([5, 9, 1, 6, 5, 4, 1, 9, 5]) → 3	3	OK
 */
