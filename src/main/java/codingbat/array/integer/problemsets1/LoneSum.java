package codingbat.array.integer.problemsets1;

/**
 * Created by anjalhussan on 8/30/16.
 */
public class LoneSum {

    /*
    Given 3 int values, a b c, return their sum.
    However, if one of the values is the same as
    another of the values, it does not count towards the sum.
    loneSum(1, 2, 3) → 6
    loneSum(3, 2, 3) → 2
    loneSum(3, 3, 3) → 0
     */

    public static void main(String[] args){
        System.out.println(calculateLoneSum(6, 6, 6));
    }

    public static int calculateLoneSum(int a, int b, int c){
        int result = 0;
        if (a!=b&&a!=c){
            result = result+a;
        }
        if (b!=a&&b!=c){
            result = result+b;
        }
        if (c!=a&&c!=b){
            result = result+c;
        }
        return result;
    }
}
