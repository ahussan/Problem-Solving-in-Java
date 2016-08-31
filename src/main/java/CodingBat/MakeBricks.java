package CodingBat;

/**
 * Created by anjalhussan
 */
public class MakeBricks {

    /*
    We want to make a row of bricks that is goal inches long.
    We have a number of small bricks (1 inch each)
    and big bricks (5 inches each).
    Return true if it is possible to make the
    goal by choosing from the given bricks.
    This is a little harder than it looks and
    can be done without any loops.
    See also: Introduction to MakeBricks
    makeBricks(3, 1, 8) → true
    makeBricks(3, 1, 9) → false
    makeBricks(3, 2, 10) → true
    makeBricks(20, 0, 19) → true
    http://codingbat.com/prob/p183562
     */
    public static void main(String[] args){
        System.out.println(makeBricks(7, 1, 11));
        System.out.println(makeBricks(3, 2, 9)); //→ false
        System.out.println(makeBricks(1, 4, 12)); //→ false
        System.out.println(makeBricks(2, 1000000, 100003)); //→ false
        System.out.println(makeBricks(20, 4, 51)) ;//→ false
        System.out.println(makeBricks(40, 2, 52));//→ false
        System.out.println(makeBricks(20, 0, 19)); //→ true
    }

    public static  boolean makeBricks(int small, int big, int goal) {
        int reminder = 0;
        boolean result= false;
        if (big>0){
            int biginch =big*5;
            if (biginch>goal){
                reminder=goal%5;
                if (reminder<=small){
                    result=true;
                }
            } else if (biginch<goal){
                reminder = goal-biginch;
                if (reminder<=small){
                    result=true;
                }
            } else if (biginch==goal){
                result=true;
            }

        } else if(big<=0) {
            if (goal <= small) {
                result = true;
            }
        }
        return result;
    }
}