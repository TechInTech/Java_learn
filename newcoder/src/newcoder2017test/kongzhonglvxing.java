/**
 * 
 */
package newcoder2017test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author DELL
 * Project Name: newcoder
 * Class Name: kongzhonglvxing
 * date: 2019年9月12日
 */

public class kongzhonglvxing {
    public static void main(String[] args) throws IOException{
        InputStreamReader instream = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(instream);
        
        int count = 0;
        
        String[] ss = br.readLine().trim().split(" ");
        
        int n = Integer.parseInt(ss[0]);
        int s = Integer.parseInt(ss[1]);
        
        String[] s1 = br.readLine().trim().split(" ");
        int[] nums = new int[s1.length];
        
        for(int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(s1[i]);
        }
        int sums = 0;
        for(int j =0; j < n; j++) {
            sums = sums + nums[j];
            if(sums > s) {
                break;
            } else {                
                count++;
            }
        }
        System.out.println(count);
    }
}
