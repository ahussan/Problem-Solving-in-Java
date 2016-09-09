package string.manipulation;

import java.util.Collection;

/**
 * Created by anjalhussan on 9/9/16.
 */

/*
Description:
You are going to be given a string.
Your job is to return that string in a
certain order that I will explain below:
Let's say you start with this: 012345
The first thing you do is reverse it:543210
Then you will take the string from the 1st position and reverse it again:501234
Then you will take the string from the 2nd position and reverse it again:504321
Then you will take the string from the 3rd position and reverse it again:504123
Continue this pattern until you have done every single position, and then you will return the string you have created. For this particular number, you would return:504132
Input:
A string of length 1 - 1000
Output:
A correctly reordered string.
 */
public class ReverseString {

    public static void main(String[]args){
        System.out.println(reversedString("012345"));
        System.out.println(reversedString("abcde"));
    }

    public static String reversedString(String givenString){
        char[] allchar = givenString.toCharArray();
        char[] reversedchar = new char[givenString.length()];
        for (int i = 0; i < givenString.length(); i++) {
            int startIndex= i;
            int endIndex = givenString.length()-1;
            while (startIndex<givenString.length()){
                reversedchar[startIndex] = allchar[endIndex];
                startIndex ++;
                endIndex--;
            }
            allchar=reversedchar.clone();
        }
        return String.valueOf(allchar);
    }
}
