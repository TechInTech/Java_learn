///**
// * 
// */
//
///**
// * @author DELL
// * Project Name: Java_learn
// * Class Name: oj3
// * date: 2019年8月31日{time}
// */
//public class oj3 {
//
//    /**
//     * @param args
//     */
//    public static int ans=0;
//    public static int a[] = new int[20];
//    public static int visited[] = new int[20];
//    
//    public static void dfs(int cur) {
//        if(cur > 12) {
//            if((a[1] + a[2] == a[3])&&
//                    (a[4]-a[5]==a[6])&&
//                    (a[7]*a[8] == a[9])&&
//                    (a[11]*a[12]==a[10])) {
//                ans++;
//                return;
//            }
//        }
//        for(int i=1;i<=13;i++) {
//            if(visited[i]==0) {
//                visited[i] = 1;
//                a[cur] = i;
//                dfs(cur+1);
//                visited[i]=0;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        dfs(1);
//        System.out.println(ans);
//    }
//
//}
public class oj3 {
    public static int ans=0;
    public static int a[]=new int[20];
    public static int visited[]=new int[20];
    public static void dfs(int cur){
        if(cur>12){
            if((a[1]+a[2]==a[3])&&
                    (a[4]-a[5]==a[6])&&
                    (a[7]*a[8]==a[9])&&
                    (a[11]*a[12]==a[10]))
                ans++;
                return;         
        }

        for(int i=1;i<=13;i++){
            if(visited[i]==0){
                visited[i]=1;
                a[cur]=i;
                dfs(cur+1);
                visited[i]=0;
            }
        }
    }
    public static void main(String[] args){
        dfs(1);
        System.out.println(ans);
    }
}