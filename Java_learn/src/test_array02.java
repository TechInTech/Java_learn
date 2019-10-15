/**
 * 
 */

/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: test_array02
 * date: 2019年9月1日{time}
 */
public class test_array02 {
    public static int a[]=new int[14];
    public static int visit[]=new int[14];
    public static int sum=0;
    public static void main(String[] args){
        dfs(1);
        System.out.println(sum);
    }


    public static void dfs(int n)  
    {  
        if(n>3 && a[1]+a[2]!=a[3])            
            return;  
        if(n>6 && a[4]-a[5]!=a[6])           
            return;  
        if(n>9 && a[7]*a[8]!=a[9])               
            return;  
        if(n>12 && a[12]*a[11]==a[10])        
        {  
            sum++;  
            return;  
        }  

        for(int i=1;i<14;i++)  
        {  
            if(visit[i]==0)  
            {  
                visit[i]=1;  
                a[n]=i;  
                dfs(n+1);  
                visit[i]=0;  
            }  
        }  
        return;  
    }  
}
