/**
 * 
 */
//import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: inputnumbers
 * date: 2019年9月7日
 */
public class inputnumbers {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串整数并在输入时用英文逗号隔开：");
        String inputString = sc.next().toString();
        
        String stringArray[] = inputString.split(",");
        int num[] = new int[stringArray.length];
        
        for (int i=0; i < stringArray.length; i++) {
            num[i] = Integer.parseInt(stringArray[i]);
            System.out.print(num[i] + " ");
        }
        
        Arrays.parallelSort(num);
        System.out.print("\n"+"排序后的数组：");
        for (int j = 0; j < num.length; j++) {
            System.out.print(num[j]+" ");
        }
    }
}