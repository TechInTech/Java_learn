/**
 * 
 */

/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: libaidajiu
 * date: 2019年9月1日{time}
 */
public class libaidajiu {

    /**
     * @param args
     */
    public static char[] a= new char[20];
    public static int ans = 0;
    
    public static void dfs(int cur, int dian, int hua, int jiu) {
        if(dian > 5)
            return;
        if(hua > 10)
            return;
        if(cur == 15) {
            if(dian == 5 && hua == 10 && a[14] == 'b' && jiu == 0) {
                for(int i = 0; i <= 14; i++)
                    System.out.print(a[i]);
                System.out.println();
                ans++;
            }
            return;
        }
        a[cur] = 'a';
        dfs(cur+1, dian+1, hua, jiu*2);
        a[cur] = 'b';
        dfs(cur+1, dian, hua+1, jiu-1);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        dfs(0, 0, 0, 2);
        System.out.println(ans);
    }

}
