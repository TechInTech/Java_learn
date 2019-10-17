
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str11 = br.readLine().trim().split(" ");
        String str1 = str11[0];
        String str2 = str11[1];
        System.out.println(Main.getCommonStrLength(str1,str2));
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
            for(int begin = 0, end = min.length(); end <= min.length(); begin++,end++){
                current = min.substring(begin, end);
                if(max.contains(current)){
                    return current;
                }
            }
        }
        return null;
    }
}