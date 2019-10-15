import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Oula {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int a=num;
        double oulaAnwser=0;
        ArrayList<Integer> oulaList = new ArrayList<Integer>();
        if (isPrime(num)){
            oulaAnwser=num-1;
        }else{
            List<Integer> allPrime = getAllPrime(num);
            for(int i : allPrime){
                int tem=num;
                num=repeatdivide(num,i);
                if (tem!=num){
                    oulaList.add(i);
                }
            }
            oulaAnwser=a;
            for (int j :oulaList){
                 oulaAnwser=oulaAnwser*(1-(double)1/j);
            }
        }
        scanner.close();
        System.out.println("欧拉函数的值为"+Math.round(oulaAnwser));
    }
    public static List<Integer> getAllPrime(int num){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i =2;i<num;i++){
            if (isPrime(i)) {
                result.add(i);
            }
        }
        return result;
    }
    public static boolean isPrime(int num){
        if(num < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++ ) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }
 
    public static boolean canbedivide(int num,int i ){
        return num==1?false:num%i==0?true:false;
    }
    public static int repeatdivide(int num,int i ){
        int result=0;
        if (canbedivide(num,i)){
            result=repeatdivide(num/i,i);
        }else{
            return num;
        }
        return result;
    }
}