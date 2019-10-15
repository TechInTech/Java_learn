/**
 * 
 */

/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: Shuffle1
 * date: 2019年8月19日{time}
 */
public class Shuffle1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
                x = x -1;
                System.out.print("-");
            }
            if (x == 2) {
                System.out.print("b c");
                x = x - 1;
                System.out.print("-");
            }
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }
    }

}
