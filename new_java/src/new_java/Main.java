package new_java;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 之所以是 Integer 数组，是为了下面逆序排序用，不能用 Arrays.sort 对基本类型进行逆序排序
        Integer[] player = new Integer[n];
        int sum = 0;
        for(int i = 0; i < n; i++) {
            player[i] = sc.nextInt();
            sum += player[i];
        }
        int[] array = new int[sum + 1];// array[i] 用来存储分值为 i 的组数
        array[0] = 1;
        Arrays.sort(player, Collections.reverseOrder());
//        int min;
//        //mid 是 A 比 B 大的临界值，min 是 A 比 B 小的临界值
//        if(sum % 2 == 0) {
//            min = sum / 2;
//        }else {
//            min = sum / 2 + 1;
//        }
//        int mid = sum / 2 + 1;
//        long res = 0;
//        for(int i = 0; i < n; i++) {
//            // m 表示 A 队将球员 i 分配给 B 队后的水平值之和
//            // 要保证 m 小于 B 队的水平值之和且 m + player[i] 大于 B 队的水平值之和
//            for(int m = mid - player[i]; m < min; m++) {
//                if(m < 0) m = 0;//小于0说明有一个值很大，直接把这一个人放到A队就足够了
//                res += array[m];//每一种情况 A 队的水平值之和等于 m + player[i]分
//            }
//            for(int j = sum - player[i]; j >= 0; j--) {//一定要从后往前填，从前往后填不对
//                array[j + player[i]] += array[j];
//            }
//        }
        System.out.print(array[1]);
    }
}
