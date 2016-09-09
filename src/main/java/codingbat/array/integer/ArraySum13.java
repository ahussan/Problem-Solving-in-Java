package codingbat.array.integer;

/**
 * Created by anjalhussan on 8/30/16.
 */
public class ArraySum13 {

    /*
    Return the sum of the numbers in the array,
    returning 0 for an empty array.
    Except the number 13 is very unlucky,
    so it does not count and numbers that come
    immediately after a 13 also do not count.
    sum13([1, 2, 2, 1]) → 6
    sum13([1, 1]) → 2
    sum13([1, 2, 2, 1, 13]) → 6
    http://codingbat.com/prob/p127384
     */

    public static void main(String[] args){
        int[] numbers = new int[]{1,2,3,4,5,13,20,13,20,50};
        System.out.println(sums(numbers));
    }

    public static int sums(int[] nums){
        int result=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]!=13){
                result=result+nums[i];
            } else {
                i=i+1;
            }
        }
        return result;
    }

}
