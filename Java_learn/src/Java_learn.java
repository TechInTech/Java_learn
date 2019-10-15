import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_learn {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str11 = br.readLine().trim().split(" ");
        String str1 = str11[0];
        String str2 = str11[1];
        
        System.out.println(getCommonStrLength(str1,str2));
    }   
    public static String getCommonStrLength(String str1, String str2){
        if(str1 == null || str2 == null){
            return null;
        }
        if (str1.equals("") || str2.equals("")){
            return null;
        }
        String max = "";
        String min = "";
        if(str1.length() < str2.length()){
            max = str2;
            min = str1;
        } else {
            max = str1;
            min = str2;
        }
        String current = "";
        for(int i = 0; i < min.length(); i++){
            for(int begin = 0, end = min.length()-i; end <= min.length(); begin++,end++){
                current = min.substring(begin, end);
                if(max.contains(current)){
                    return current;
                }
            }
        }
        return null;
    }

//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        int x = 10;
//        String name = "Dirk";
//        x = x * 17;
//        System.out.print("x is " + x + "\n");
//        
//        double d = Math.random();
//        
//        double r = Math.rint(d*10);
//        System.out.print(r);
//        //**
//        x = 10;
//        for (int i = 0; i < x; i += 1) {
//            System.out.print(i + "\n");
//            //System.out.print("\n");
//        }
//        
//        //**
//        /*
//        while(x > 7) {
//            x -= 1;
//            System.out.print("This is a valid statement." + '\n');
//        }
//        for (x = 0; x < 10; x += 1) {
//            System.out.print("x is now " + x + "\n");
//        }
//        */
//        
//        // if/else 的条件分支测试 
//        x = 2;
//        if (x == 10) {
//            System.out.println("x must be 10.");
//        } else {
//            System.out.println("x is not 10.");
//        }
//        if ((x < 3) & (name.equals("Dirk"))) {
//            System.out.println("Gently");
//        }
//        System.out.println("this line runs no matter what.");
//
//    }

}
