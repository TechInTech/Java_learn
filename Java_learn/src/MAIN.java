/**
 * 
 */

/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: MAIN
 * date: 2019年9月29日
 */

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;

//public class MAIN {
//
//    /**
//     * @param args
//     */
//    public static void main(String[] args) throws IOException {
//        // TODO Auto-generated method stub
//        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
//
//    }
//
//}
//import java.util.*;
//public class MAIN {
//
//    static int i=0;
//
//    public static void move(int n,String x,String y,String z){
//        if(n==1){
//            i++;
//        }else{
//            move(n-1, x, z, y);
//            i++;
//            move(n-1, y, x, z);
//        }
//    }
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//
//        Scanner s=new Scanner(System.in);
//        String chaXun=s.next();
//        int count=Integer.parseInt(chaXun);
//        MAIN.move(count, "X", "Y", "Z");
//        System.out.println(i);
//
//    }
//}



import java.util.regex.*;
//import java.util.spi.LocaleNameProvider;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MAIN {
    public static void main(String[] args) throws IOException {
        String regEx1 = "[\\u4e00-\\u9fa5]";
        String regEx2 = "[a-z||A-Z]";
        String regEx3 = "[0-9]";
        
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br1.readLine().trim();
        
        String s1 = matchResult(Pattern.compile(regEx1),str);
        String s2 = matchResult(Pattern.compile(regEx2),str);
        String s3 = matchResult(Pattern.compile(regEx3),str);
        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();
        int l4 = str.length() - l1 - l2 -l3;
        
        System.out.print("汉字个数："+l1+","+"字母个数："+l2+","+"数字个数："+l3+","+"其它字符个数："+l4+","+"数据中纯文本为："+s1);
    } 
    
    public static String matchResult(Pattern p,String str)
    {
        StringBuilder sb = new StringBuilder();
        Matcher m = p.matcher(str);
        while (m.find())
        for (int i = 0; i <= m.groupCount(); i++) 
        {
            sb.append(m.group());   
        }
        return sb.toString();
    }
}