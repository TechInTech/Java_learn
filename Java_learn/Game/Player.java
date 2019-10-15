/**
 * 
 */

/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: Player
 * date: 2019年8月19日{time}
 */
public class Player {
    int number = 0; // 要被猜的数字
    
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
