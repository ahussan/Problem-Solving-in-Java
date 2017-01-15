package string.manipulation;

/**
 * Created by anjalhussan on 1/13/17.
 */

/*
reverse every two letter followed by an space from an string
// for example SYFUL will be 'YS UF L'
 */
public class AddSpaceAfterTwoLetter {

    public static void main(String[]args){
        System.out.println(reversedString("012345"));
        System.out.println(reversedString("abcde"));
    }

    public static String reversedString(String input){
        StringBuilder result = new StringBuilder();
        if (input.length() > 0) {
            for (int i = 0; i < input.length(); i=i+2) {
                if (i >=0 && i < input.length()){
                    result.append(input.charAt(i));
                }
                if (i+1 >=0 && i+1 < input.length()){
                    result.append(input.charAt(i+1));
                }
                if (i+2<input.length()){
                    result.append(" ");
                }
            }
        }
        return result.toString();
    }

}
