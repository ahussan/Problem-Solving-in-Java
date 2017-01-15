package recursion;

/**
 * Created by anjalhussan on 12/26/16.
 */

/*

Given a string, compute recursively (no loops)
a new string where all the lowercase 'x' chars have been changed to 'y' chars.

changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"
 */

public class changeXY {

    public static void main(String[]args){

        System.out.println(changeXY("xxhixx"));;

    }


    public static String changeXY(String str) {
        if (str.length() == 0) return str;
        if (str.charAt(0) == 'x') return "y" + changeXY(str.substring(1));
        return str.charAt(0) + changeXY(str.substring(1));
    }

}
