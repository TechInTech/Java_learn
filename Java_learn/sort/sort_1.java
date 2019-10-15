/**
 * 
 */
import java.util.Arrays;
/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: sort_1
 * date: 2019年9月10日
 */
public class sort_1 {
    public static void main(String[] args) {
        int[] lyst = {23, 46, 0, 8, 11, 18};
        System.out.println("before sorted: ");
        for (int i = 0; i < lyst.length; i++) {
            System.out.print(lyst[i] + " ");
        }
        
        // 归并排序包
//        Arrays.parallelSort(lyst);
        System.out.println();
        
        // 自定义快速排序
        sortQuick(lyst, 0, lyst.length - 1);
        
        System.out.println("After sorted: ");
        for (int i = 0; i < lyst.length; i++) {
            System.out.print(lyst[i] + " ");
        }
    }
    
    public static void sortQuick(int[] ll, int left, int right) {
        if (left < right) {
            int index_ = get_index(ll, left, right);
            sortQuick(ll, left, index_ - 1);
            sortQuick(ll, index_ + 1, right);
        }
    }
    
    public static int get_index(int[] ll, int left, int right) {
        int temp = ll[left];
        while (left < right) {
            while(left < right  && ll[right] >= temp) {
                right--;
            }
            ll[left] = ll[right];
            while(left < right && ll[left] <= temp) {
                left++;
            }
            ll[right] = ll[left];
        }
        ll[left] = temp;
        return left;
    }
}
