package CodingBat2;

/**
 * Created by anjalhussan on 9/7/16.
 */
public class Warmup2String {
    /*

    Given a string, return true
    if the first instance of "x" in the string
    is immediately followed by another "x".

    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true
    http://codingbat.com/prob/p186759
     */

    public static void main(String[] args){
        System.out.println(doubleX("axaxax"));
        doubleX("axxbb") ;//→ true	true	OK
        doubleX("axaxax") ;//→ false	false	OK
        doubleX("xxxxx") ;//→ true	true	OK
        doubleX("xaxxx") ;//→ false	false	OK
        doubleX("aaaax");// → false	false	OK
        doubleX("");// → false	false	OK
        doubleX("abc");// → false	false	OK
        doubleX("x");// → false	false	OK
        doubleX("xx");// → true	true	OK
        doubleX("xax");// → false	false	OK
        doubleX("xaxx");// → false	false	OK
    }

    public static boolean doubleX(String str) {
        boolean result=false;
        int firstxIndex = str.indexOf("x");
        if (firstxIndex+1<str.length()) {
            char nextX = str.charAt(firstxIndex + 1);
            if (nextX == 'x' | nextX == 'X') {
                return true;
            }
        }
        return result;
    }

}
