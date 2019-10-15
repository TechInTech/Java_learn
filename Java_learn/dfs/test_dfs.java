/**
 * 
 */

/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: test_dfs
 * date: 2019年8月31日{time}
 */
public class test_dfs {

    /**
     * @param args
     */
    public static int N=0;
    public static void dfs(int cur, int sum) {
        if(cur > 13)
            return ;
        if(sum > 13)
            return;
        if(sum == 13 && cur == 13)
            N++;
        for(int i=0; i<=4; i++)
            dfs(cur + 1, sum+i);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        dfs(0, 0);
        System.out.println(N);
    }

}
