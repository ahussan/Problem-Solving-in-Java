package codingbat.array.integer.problemsets2;

/**
 * Created by anjalhussan on 9/12/16.
 */

/*

    Given an array of ints,
    return true if the array contains no 1's and no 3's.

    lucky13([0, 2, 4]) → true
    lucky13([1, 2, 3]) → false
    lucky13([1, 2, 4]) → false
 */
public class Lucky13 {

    public static void main(String[]args){
        int [] luckyarray=new int[]{0, 2, 4};
        System.out.println(lucky13(luckyarray));
    }
    public static boolean lucky13(int[] nums) {
        boolean result=true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1||nums[i]==3){
                result=false;
                break;
            }

        }

        return result;
    }


}
