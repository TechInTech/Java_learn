/**
 * 
 */

/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: arrays_list
 * date: 2019年8月19日{time}
 */
public class arrays_list {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = new int[7];
        int n = nums.length;
        for (int i=0; i < n; i = i+1) {
            nums[i] = 2 + i;
        }
        for (int j = 0; j < n; j = j+1) {
            System.out.print(nums[j] + " ");
        }

    }

}
