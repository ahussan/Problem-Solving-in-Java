package codingbat.array.string;

/**
 * Created by anjalhussan on 10/4/16.
 */
/*

Return true if the given string contains a "bob" string,
but where the middle 'o' char can be any char.
bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
http://codingbat.com/prob/p175762
 */
public class BobThere {

    public static void main(String[]args){
        System.out.println(bobThere("abcbob"));
        System.out.println(bobThere("b9b"));
        System.out.println(bobThere("bac"));

    }

    public static boolean bobThere(String str) {
        boolean res=false;
        char[] allstr = str.toCharArray();
        for (int i = 0; i <allstr.length-2 ; i++) {
            if (allstr[i]=='b'){
                if (allstr[i+2]=='b'){
                    res=true;
                }
            }

        }
        return res;
    }

}
