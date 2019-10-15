import javax.sound.midi.MidiChannel;

/**
 * 
 */

/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: mergeSort
 * date: 2019年9月10日
 */
public class mergeSort {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] lyst = {23, 46, 0, 8, 11, 18};
        System.out.println("before sorted: ");
        for (int i = 0; i < lyst.length; i++) {
            System.out.print(lyst[i] + " ");
        }
        
        // 归并排序包
//        Arrays.parallelSort(lyst);
        System.out.println();
        
        merge_sort(lyst, 0 , lyst.length - 1);
        
        System.out.println("After sorted: ");
        for (int i = 0; i < lyst.length; i++) {
            System.out.print(lyst[i] + " ");
        }
    }
    
    public static void merge_sort(int[] lyst, int low, int high) {
        if(low < high) {
            int mid = (low + high) / 2;
            merge_sort(lyst, low, mid);
            merge_sort(lyst, mid+1, high);
            merge(lyst, low, mid, high);
        }
    }
    
    public static void merge(int[] lyst, int low, int mid, int high) {
        int[] container = new int[high - low + 1];
        int i = low;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= high) {
            if(lyst[i] < lyst[j]) {
                container[k++] = lyst[i++];
            } else {
                container[k++] = lyst[j++];
            }   
        }
        
        while(i <= mid) {
            container[k++] = lyst[i++];
        }
        while(j <= high) {
            container[k++] = lyst[j++];
        }
        
        for(int k2=0; k2 < container.length; k2++) {
            lyst[low+k2] = container[k2];
        }
    }
}
