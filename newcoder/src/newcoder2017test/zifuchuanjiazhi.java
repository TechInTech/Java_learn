///**
// * 
// */
package newcoder2017test;
//
///**
// * @author DELL
// * Project Name: newcoder
// * Class Name: zifuchuanjiazhi
// * date: 2019年9月13日
// */
//import java.io.IOException;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.HashMap;
//import java.util.Arrays;
//
//public class zifuchuanjiazhi {
//
//    /**
//     * @param args
//     */
//    public static void main(String[] args) throws IOException {
//        // TODO Auto-generated method stub
//        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
//        HashMap<Character, Integer> mp = new HashMap<>();
//        
//        String str1 = br1.readLine().trim();
//        int n = Integer.parseInt(br1.readLine().trim());
//        
//        char[] chararr = str1.toCharArray();
//        
//        for(char c: chararr) {
//            if(!mp.containsKey(c)) {
//                mp.put(c,1);
//            }else {
//                mp.put(c, mp.get(c)+1);
//            }
//        }
//        
//        int[] count = new int[mp.size()];
//        int i = 0;
//        for(Integer value: mp.values()) {
//            count[i] = value;
//            i++;
//        }
//        Arrays.parallelSort(count);
//        while(n > 0) {
//            count[count.length-1] = count[count.length-1] - 1;
//            n = n - 1;
//            Arrays.parallelSort(count);
//        }
//        int sums = 0;
//        for(int j = 0; j < count.length; j++) {
//            sums = sums + count[j]*count[j];
//        }
//        System.out.println(sums);
//    }
//
//}



//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.util.Arrays;
//
//public class zifuchuanjiazhi{
//    public static void main(String[] args) throws IOException {
//        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
//        
//        String[] line1 = br1.readLine().trim().split(" ");
//        String[] line2 = br1.readLine().trim().split(" ");
//        
//        int[] input1 = new int[line1.length];
//        int[] input2 = new int[line2.length];
//        
//        for(int i=0; i< line1.length; i++) {
//            input1[i] = Integer.parseInt(line1[i]);
//            input2[i] = Integer.parseInt(line2[i]);
//        }
//        int[] flag = new int[line1.length];
//        
//        boolean flag4 = false;
//        for(int j=0; j < line1.length; j++) {
//            boolean flag3=false;
//            for(int k= 1; k< line1.length; k++) {
//                int diff = input1[k] - input2[j];
//                boolean flag1 = false;
//                for(int l=0; l< line1.length; l++) {
//                    if(diff == input2[l]) {
//                        flag1 = true;
//                        break;
//                    }
//                }
//                if(flag1) {
//                    flag[j] = input1[k];
//                    flag3 = true;
//                    break;
//                }
//            }
//            if (!flag3) {
//                flag4 = true;
//                break;
//            }
//        }
//        if(flag4) {
//            System.out.println("NO");
//        }else {
//            System.out.println("YES");
//            for(int t= 0; t<line1.length;t++) {
//                System.out.print(flag[t] + " ");
//            }
//        }
//    }
//}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import

//public class zifuchuanjiazhi{
//    public static void main(String[] args) throws IOException {
//        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
//        String s1 = br1.readLine().trim();
//        char[] s2 = s1.toCharArray();
//        for(int i = s2.length - 1; i >= 0; i--) {
//            if(s2[i] >= 'A' && s2[i] <= 'Z') {
//                s2[i] = Character.toLowerCase(s2[i]);
//            } else if(s2[i] == ' ') {
//                s2[i] = '0';
//            }
//            System.out.print(s2[i]);
//        }
//    }
//}


public class zifuchuanjiazhi{
    public static void main(String[] args) throws IOException {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String s2 = br1.readLine().trim();
        int n = Integer.parseInt(s2);
        String[] s1 = br1.readLine().trim().split(" ");
        int[] aa = new int[s1.length];
        for (int i= 0; i < s1.length; i++) {
            aa[i] = Integer.parseInt(s1[i]);
        }
        int sum = 0;
        for(int j= 0; j < s1.length-1; j++) {
            for(int k= j+1; k < s1.length; k++) {
                if(aa[j] > aa[k]) {
                    sum = sum + Math.abs(j-k);
                }
            }
        }
        System.out.println(sum);
    }
}