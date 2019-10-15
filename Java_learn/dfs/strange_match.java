/**
 * 
 */

/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: strange_match
 * date: 2019年9月1日
 */
public class strange_match {

    /**
     * @param args
     */
    public static int[] a = new int[20];
    public static int ans = 0;
    
    public static void dfs(int cur, int score) {
        if(cur > 10) {
            if(score == 100) {
                for(int i=0; i < cur; i++)
                    System.out.print(a[i]);
                System.out.println();
                ans++;
            }
            return;
        }
        a[cur] = 1;
        dfs(cur+1, score*2);
        a[cur] = 0;
        dfs(cur+1, score-cur);
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        dfs(1, 10);
        System.out.println(ans);
    }

}
