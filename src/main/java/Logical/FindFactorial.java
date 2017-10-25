package Logical;

/**
 * Created by anjalhussan on 10/25/16.
 */
/*
Using the Java language,
have the function FirstFactorial(num) take the num parameter
being passed and return the Logical of it (e.g. if num = 4,
return (4 * 3 * 2 * 1)). For the test cases, the range will be between 1 and 10.
Sample Test Cases
Input:4
Output:24

Input:8
Output:40320

 */
public class FindFactorial {
    public static void main(String[]args){
        System.out.println(firstFactorial(4));
        System.out.println(firstFactorial(8));
        System.out.println(firstFactorial(-5));
        System.out.println(firstFactorial(0));
        System.out.println(firstFactorial(10));
    }

    public static int firstFactorial(int num) {
        int result=0;
        if (num<0){
            System.out.println("Input should be a positive Number");
        } else if (num==0) {
            return result;
        } else if (num>0) {
            result=num;
            for (int i = 1; i <num ; i++) {
                result = result*i;
            }
        }
        return result;
    }

}
