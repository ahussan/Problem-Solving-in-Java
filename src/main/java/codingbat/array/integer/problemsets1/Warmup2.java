package codingbat.array.integer.problemsets1;

/**
 * Created by anjalhussan on 9/6/16.
 */
public class Warmup2 {
    /*

    Given an array of ints, we'll say that a triple
    is a value appearing 3
    times in a row in the array.
    Return true if the array does not contain any triples.
    noTriples([1, 1, 2, 2, 1]) → true
    noTriples([1, 1, 2, 2, 2, 1]) → false
    noTriples([1, 1, 1, 2, 2, 2, 1]) → false
     */
    public static void main(String[]args){
        int [] numbers = new int[]{1, 1, 1, 2, 2, 2, 1};
        System.out.println(noTriples(numbers));

    }
    public static boolean noTriples(int[] nums) {
        boolean result = true;
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i]==nums[i+1] && nums[i]==nums[i+2]){
                result=false;
            }
        }
        return result;
    }

}
