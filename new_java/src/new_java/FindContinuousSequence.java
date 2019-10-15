package new_java;

public class FindContinuousSequence {
    public void Find(int s)
    {
        if(s<3)
        {
            return;
        }
        int i=1,j=2;
        int sum=i+j;
        while(i<(s+1)/2&&i<j)
        {
            if(sum==s)
            {
                print( i, j);//打印和为s的连续序列
                sum=sum+(++j);//++j操作的意思是找到一个后，再将序列向后扩展一个，查找下一个
               
            }
            else if(sum<s)
            {
                sum=sum+(++j);//如果连续序列和小于s那么就将序列后端往后扩展一个，也就是j++;这里因为为了计算扩展后的序列和写在一起
                //其实，可以分为j++;sum+=j;这两步。
            }
            else
            {  
                sum=sum-(i++);//如果连续序列和大于s那么就将序列前段往后缩进一个，也就是i++;为了计算缩进后的序列和写在一起
                //其实，可以分为sum=sum-i;i++;这两步。(往后缩进了，肯定要把原来前端第一个数减去)
                
            }
        }
    }
  
    public void print(int i,int j)
    {
        for(int k=i;k<=j;k++)
        {
            System.out.print(k +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       int s=15;
       FindContinuousSequence object=new FindContinuousSequence();
       object.Find(s);
   }
}