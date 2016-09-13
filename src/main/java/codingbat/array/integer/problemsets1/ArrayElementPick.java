package codingbat.array.integer.problemsets1;

/**
 * Created by anjalhussan on 8/29/16.
 */
public class ArrayElementPick {

        /*
    Given an array of ints, return a new array length 2
    containing the first and last elements
    from the original array.
    The original array will be length 1 or more.
    makeEnds([1, 2, 3]) → [1, 3]
    makeEnds([1, 2, 3, 4]) → [1, 4]
    makeEnds([7, 4, 6, 2]) → [7, 2]
    */


    public static void main(String[] arg){
        int [] findStartAndEnd = new int[]{1,2,3,4,5};
        int [] result = findFirstLast(findStartAndEnd);
        for (int i = 0; i <result.length; i++) System.out.println(result[i]);
    }

    public static int [] findFirstLast(int [] test){
        int[] newArray = new int[2];
        newArray[0]=test[0];
        newArray[1]=test[test.length-1];
        return newArray;
    }
}
