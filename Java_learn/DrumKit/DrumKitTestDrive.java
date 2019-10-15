/**
 * 
 */

/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: DrumKitTestDrive
 * date: 2019年8月19日{time}
 */
class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        
        d.playSnare();
        d.snare = false;
        d.playTopHat();
        
        if (d.snare == true) {
            d.playSnare();
        }
              
    }
}
