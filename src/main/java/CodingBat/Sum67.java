package CodingBat;

/**
 * Created by anjalhussan on 9/2/16.
 */
public class Sum67 {
    /*
    Return the sum of the numbers in the array,
    except ignore sections of numbers starting
    with a 6 and extending to the next 7
    (every 6 will be followed by at least one 7).
    Return 0 for no numbers.

    sum67([1, 2, 2]) → 5
    sum67([1, 2, 2, 6, 99, 99, 7]) → 5
    sum67([1, 1, 6, 7, 2]) → 4
     */

    public static void main(String[]args){
        int[]numbers=new int[]{1, 2, 2, 6, 99, 99, 7};
        System.out.println(sum67(numbers));
    }

    public static int sum67(int[] nums) {
        int total = 0;

        if (nums != null) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 6){
                    while (nums[i] != 7){
                        i++;
                    }
                }else {
                    total = total + nums[i];
                }
            }
        }
        return total;
    }
}
