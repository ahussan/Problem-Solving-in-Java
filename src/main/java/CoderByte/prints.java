package CoderByte;

/**
 * Created by anjalhussan on 3/9/17.
 */

//Programming Section
//Question No: 2
public class prints {

    public static void main(String args[]) {

        int num = 1;
        while (num<=100){
            if (num%3==0 && num%5==0){
                System.out.println("FizzBuzz");
            } else if (num%5==0){
                System.out.println("Buzz");
            } else if (num%3==0){
                System.out.println("Fizz");
            }else {
                System.out.println(num);
            }
            num++;
        }
    }
}
