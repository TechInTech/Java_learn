/**
 * 
 */
import java.io.*;
import java.util.Scanner;
/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: ioinput
 * date: 2019年9月7日
 */
public class ioinput {
    public static void main(String[] args) throws IOException{
//        System.out.print("Enter a char:");
//        //但是System.in.read()只能针对一个字符的获取，同时，获取进来的变量的类型只能是char
//        char i = (char) System.in.read();
////        int j = (int) i;
////        System.out.println("j" + j);
//        System.out.println("your char is:"+i);
        
        
     // way 2
        
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = null, str1 = null;
//        System.out.print("Enter your value:");
//        str = br.readLine();
//        System.out.println("your value is :"+str);
//        
//        System.out.print("Enter your value:");
//        str1 = br.readLine();
//        System.out.println("your value is :"+str1);
//        
        
     // way 3   
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("input you name:");
        String name = sc.nextLine();
        
        
        System.out.println("input your age:");     
        int age = sc.nextInt();
       
        System.out.println("input your salary:");
        float salary = sc.nextFloat();
        
        sc.close();
        System.out.println("your information are following:");
        System.out.println("姓名："+name+"\n"+"年龄："+age+"\n"+"工资："+salary);
    }
}
