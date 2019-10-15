/**
 * 
 */

/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: quicksort
 * date: 2019年9月2日
 */
public class quicksort {
    public void quick_sort(int []a, int left, int right) {
        if(left > right) {
            return;
        }
        int i = left;
        int j = right;
        
        int temp = a[left];
        
        while(i != j) {
            while(i < j && a[j] >= temp) {
                j--;
            }
            while(i < j && a[i] <= temp) {
                i++;
            }
            if(i < j) {
                int tt = a[i];
                a[i] = a[j];
                a[j] = tt;
            }
        }
        int kk = a[i];
        a[i] = temp;
        a[left] = kk;
        
        quick_sort(a, left, j-1);
        quick_sort(a, i+1, right);
    }
}
