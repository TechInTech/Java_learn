/**
 * 
 */

/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: BeerSong
 * date: 2019年8月19日{time}
 */
public class BeerSong {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int beerNum = 99;
        String word = "bottles";
        
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle";
            }
            
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;
            
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }
            System.out.println("*****************************");
            System.out.println("*****************************");
        }
    }

}
