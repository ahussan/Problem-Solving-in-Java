package codingbat.array.integer;

/**
 * Created by anjalhussan on 9/2/16.
 */
public class Has22 {
    /*
    Given an array of ints,
    return true if the array
    contains a 2 next to a 2 somewhere.

    has22([1, 2, 2]) → true
    has22([1, 2, 1, 2]) → false
    has22([2, 1, 2]) → false
    http://codingbat.com/prob/p121853
     */
    public static void main(String[]args){
        int[]numbers=new int[]{1,2,2};
        System.out.println(has22(numbers)); //→ true
    }

    public static boolean has22(int[] nums) {
        boolean result=false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==2){
                if (i!=nums.length-1 && nums[i+1]==2){
                    result= true;
                    break;
                }
            }
        }
        return result;
    }

}
