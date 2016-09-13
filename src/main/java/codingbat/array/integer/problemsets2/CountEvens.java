package codingbat.array.integer.problemsets2;

/**
 * Created by anjalhussan on 9/12/16.
 */
/*

Return the number of even ints in the given array.
Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
http://codingbat.com/prob/p162010

countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
 */

public class CountEvens {

    public static void main(String[]args){
        int[]myarray = new int[]{2, 1, 2, 3, 4};
        System.out.println(countEvens(myarray));
    }

    public static int countEvens(int[] nums) {
        int counter=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]%2==0) {
                counter = counter + 1;
            }
        }
        return counter;
    }

}
