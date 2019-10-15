/**
 * 
 */
//import java.io.*;
/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: IoTest01
 * date: 2019年9月7日
 */
//public class IoTest01 {
//    public static void main(String[] args) throws IOException{
//        int i = (int) System.in.read();
//        System.out.println("The i is:"+i);
//    }
//}

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class IoTest01 {
    public static boolean isValid(String s) {
        char[] string = new char[s.length()];
        int i = 0;
        for(char c: s.toCharArray()) {
            string[i++] = c;
        }
        
        for(int j = 0; j < string.length - 1;j = j+2){
            if(string[j] == '(' && string[j+1] == ')') {
                continue;
            } else if (string[j] == '{' && string[j+1] == '}'){
                continue;
            } else if (string[j] == '[' && string[j+1] == ']'){
                continue;
            } else {
                return false;
            } 
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        boolean flag = isValid(str);
        System.out.println(flag);
    }
}