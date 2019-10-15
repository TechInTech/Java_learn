/**
 * 
 */
package newcoder2017test;

/**
 * @author DELL
 * Project Name: newcoder
 * Class Name: paixu
 * date: 2019年9月13日
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class paixu{
    public static void main(String[] args) throws IOException{
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br1.readLine().trim());
        String[] str1 = br1.readLine().trim().split(" ");
        int[] int2 = new int[n];
        int[] int1 = new int[n];
        for(int i = 0; i < n; i++){
            int2[i] = Integer.parseInt(str1[i]);
            int1[i] = int2[i];
        }
        Arrays.parallelSort(int2);
        int count = 0;
        for(int j = 0; j < n; j++){
            if(int1[j] != int2[j]){
                count++;
            }
        }
        System.out.println(count);
    }
}