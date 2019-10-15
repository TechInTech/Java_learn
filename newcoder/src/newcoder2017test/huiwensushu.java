/**
 * 
 */
package newcoder2017test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import javax.sound.sampled.Line;

/**
 * @author DELL
 * Project Name: newcoder
 * Class Name: huiwensushu
 * date: 2019年9月12日
 */
public class huiwensushu {

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().trim().split(" ");
        
        int l = Integer.parseInt(lines[0]);
        int r = Integer.parseInt(lines[1]);
        
        int count = 0;
        for(int j = l; j <= r; j++) {
            if(isSushu(j) && isHuiwen(j)) {
                count++;
            }
        }
        
        System.out.println(count);
    }
    
    public static boolean isSushu(int n) {
        if(n == 1) {
            return false;
        }
        for(int i = 2; i <= (int) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
//    public static boolean isSushu(int num){
//        if(num == 1) return false;
//        if(num<=3) return true;
//        if(num%6!=1 && num%6!=5) return false;
//        int sqrt = (int)Math.sqrt(num);
//        for(int i=5;i<=sqrt;i+=6){
//            if(num%(i)==0 || num%(i+2)==0) return false;
//        }
//        //System.out.println("prime:"+num);
//        return true;
//    }
    
    public static boolean isHuiwen(int n) {
        if(n < 10) {
            return true;
        }
        String str1 = String.valueOf(n);
        for(int i=0; i < str1.length(); i++) {
            if(str1.charAt(i) != str1.charAt(str1.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
