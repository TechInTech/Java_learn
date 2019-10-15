/**
 * 
 */
import java.util.ArrayList;

/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: shenqisuanshi
 * date: 2019年9月1日{time}
 */
public class shenqisuanshi {

    /**
     * @param args
     */
    public static int ans = 0, ans2 = 0;
    public static int a[]= new int[10];
    public static int visited[] = new int[10];
    
    public static boolean testrepeat() {
        int left = a[0];
        int right = a[1]*100 + a[2]*10 + a[3];
        int answer = left*right;
        
        String s1 = left + "";
        String s2 = right + "";
        String s3 = answer + "";
        
        ArrayList<Character> arr = new ArrayList<>();
        
        for(int i=0; i < s1.length(); i++) 
            arr.add(s1.charAt(i));
        for(int i=0; i < s2.length(); i++) 
            arr.add(s2.charAt(i));
        if(s3.length() != 4) 
            return false;
        for(int i=0; i < s3.length(); i++) {
            if(s3.indexOf(arr.get(i)) == -1)
                return false;
        }
        return true;
    }
    
    public static boolean testrepeat2() {
        int left = a[0]*10 + a[1];
        int right = a[2]*10 + a[3];
        int answer = left*right;
        
        String s1 = left + "";
        String s2 = right + "";
        String s3 = answer + "";
        
        ArrayList<Character> arr=new ArrayList<>();
        
        for(int i = 0; i < s1.length(); i++)
            arr.add(s1.charAt(i));
        for(int i = 0; i < s2.length(); i++)
            arr.add(s2.charAt(i));
        if(s3.length() != 4)
            return false;
        for(int i = 0; i < s3.length(); i++) {
            if(s3.indexOf(arr.get(i)) == -1) {
                return false;
            }
        }
        return true;
    }
    
    public static void dfs(int cur) {
        if(cur > 3) {
            if(testrepeat()) {
                System.out.println("-------");
                System.out.println("A*BCD: ");
                System.out.print(a[0] + "*" + a[1] + a[2] + a[3] + "\n");
                ans++;
            }
            
            if(testrepeat2()) {
                System.out.println("-------");
                System.out.println("AB*CD: ");
                System.out.print(a[0] + "" + a[1] + "*" + a[2] + a[3] + "\n");
                ans2++;
            }
            return;
        }
        for(int i=0; i<10; i++) {
//            if(cur == 1 && i==0)
//                continue;
            if(visited[i] == 0) {
                visited[i] = 1;
                a[cur] = i;
                dfs(cur+1);
                visited[i] = 0;
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        dfs(0);
        System.out.println(ans + ans2/2);
    }

}
