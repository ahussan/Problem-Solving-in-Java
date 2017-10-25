package OtherKinds;

/**
 * Created by anjalhussan on 2/27/17.
 */
public class BankAccountCharges {
   /*
    A bank account charges $10 per month plus the following check
    fees for a commercial checking account:
    $.10 each for fewer than 20 checks
    $.08 each for 20-39 checks
    $.06 each for 40-59 checks
    $.04 each for 60 or more checks
    Write a program that asks for the number of checks written for the month.
    The program should then calculate and display the bank's services fees for the month.
     */
    public static void main(String[]args){
        System.out.println(calculate(0));
        System.out.println(calculate(20));
        System.out.println(calculate(39));
        System.out.println(calculate(40));
        System.out.println(calculate(59));
        System.out.println(calculate(60));
        System.out.println(calculate(100));


    }

    public static double calculate(int numberOfCheck){
        double servicefee= 10.00;

        if (numberOfCheck!=0&&numberOfCheck<20){
            servicefee=servicefee+(numberOfCheck*.10);
        } else if (numberOfCheck>=20&&numberOfCheck<=39){
            servicefee=servicefee+(numberOfCheck*.08);
        }else if (numberOfCheck>=40&&numberOfCheck<=59){
            servicefee=servicefee+(numberOfCheck*.06);
        } else if (numberOfCheck>=60){
            servicefee=servicefee+(numberOfCheck*.06);
        }
        return servicefee;
    }
}
