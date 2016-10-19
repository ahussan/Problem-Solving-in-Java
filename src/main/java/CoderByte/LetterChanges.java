package CoderByte;



/**
 * Created by anjalhussan on 10/19/16.
 */

/*
Challenge
Using the Java language, have the function LetterChanges(str)
take the str parameter being passed and modify
it using the following algorithm.
Replace every letter in the string with the letter
following it in the alphabet (ie. c becomes d, z becomes a).
Then capitalize every vowel in this new string (a, e, i, o, u)
and finally return this modified string.
Sample Test Cases
Input:"hello*3"
Output:"Ifmmp*3"

Input:"fun times!"
Output:"gvO Ujnft!"
https://coderbyte.com/editor/guest:Letter%20Changes:Java
 */
public class LetterChanges {

    public static void main (String[] args) {
        // keep this function call here
        //Scanner s = new Scanner(System.in);
        //System.out.print(LetterChanges(s.nextLine()));
        System.out.print(LetterChanges("abcde"));

    }

    public static String LetterChanges(String str) {
        String outputasString;
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] vowel = "aeiou".toCharArray();
        char [] givenstr = str.toLowerCase().toCharArray();
        char[] output = new char[givenstr.length];
        for (int i = 0; i <givenstr.length ; i++) {
            for (int j = 0; j <alphabet.length ; j++) {
                if (givenstr[i]==alphabet[j]&&givenstr[i]!='z'){
                    output[i]=alphabet[j+1];
                    break;
                } else if (givenstr[i]=='z'){
                    output[i]='a';
                    break;
                }
            }
        }
        for (int i = 0; i <output.length; i++) {
            for (int j = 0; j < vowel.length ; j++) {
                if (output[i]==vowel[j]){
                    String temp = Character.toString(output[i]).toUpperCase();
                    output[i]=temp.charAt(0);
                    break;
                }
            }
        }
        return new String(output);
    }
}
