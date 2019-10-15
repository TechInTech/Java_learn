/**
 * 
 */

/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: guess_suanshi
 * date: 2019年9月1日
 */
public class guess_suanshi {

    /**
     * @param args
     */
    static int[] aaa=new int[10];
    
    public static void check(int n) {
        while(n > 0) {
            aaa[n%10]++;
            n = n/10;
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for(int i=100; i <= 999; i++)
            for(int j = 100; j<=999; j++) {
                int x = i*j;
                int a = i*(j%10);
                int b = i*((j/10)%10);
                int c = i*(j/100);
                for(int p=0; p < aaa.length; p++) {
                    aaa[p] = 0;
                }
                if(a > 1000 || b>= 1000 || c>=1000 || x>= 100000 || a < 100 || b<100 || c < 100) {
                    continue;
                }
                check(x);check(i);check(j);
                check(a);check(b);check(c);
                boolean flag = true;
                for(int p = 0; p < aaa.length; p++) {
                    if(aaa[p]!=2) {
                        flag = false;
                        break;
                    }
                }
                if(flag == true)
                    System.out.println(x);
            }
    }

}
