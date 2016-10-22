package codingbat.array.string;

/**
 * Created by anjalhussan on 10/21/16.
 */
public class GHappy {

    /*

We'll say that a lowercase 'g' in a string is "happy"
if there is another 'g' immediately to its left or right.
Return true if all the g's in the given string are happy.

gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
http://codingbat.com/prob/p198664
     */

    public static void main (String[] args) {
        System.out.println(gHappy("xxggxx"));
        System.out.println(gHappy(""));
        System.out.println(gHappy("xxggxx"));
        System.out.println(gHappy("xxgggxyg"));

    }

    public static boolean gHappy(String str) {
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.length() != 0) {
                if (str.length()==1 & str.charAt(0)=='g'){
                    break;
                }else if (str.charAt(i) == 'g' && i < str.length() - 1) {
                    flag = false;
                    if (str.charAt(i + 1) == 'g' || str.charAt(i - 1) == 'g') {
                        flag = true;
                    }
                } else if (str.charAt(i) == 'g' && i < str.length()) {
                    flag = false;
                    if (str.charAt(i - 1) == 'g') {
                        flag = true;
                    }
                }
            }
        }
        //as per codingbat, if no char in the string, return true
        if (str.length()== 0) {
            flag=true;
        }
            return flag;
    }
}
