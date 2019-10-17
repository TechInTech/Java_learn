/**
 * 
 */

/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: divideAndConquerAlgorithm
 * date: 2019年10月17日
 */
public class divideAndConquerAlgorithm {
    // 分治算法
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a = {-2, 11, -4, 13, -5, -2};
        int[] b = {-6, 2, 4, -7, 5, 3, 2, -1, 6, -9, 10, -2};
        
        System.out.println(maxSum1(a));
        System.out.println(maxSum2(b));
		System.out.println(maxSubSum3(b));
		System.out.println(maxSum4(b));
    }
    
    public static int maxSum1(int[] a) {
        int maxVal = 0;
        
        for(int i = 0; i < a.length; i++){
			
			for(int j = i; j < a.length; j++){
				int currentVal = 0;
				
				for(int k = i; k <= j; k++){
					currentVal += a[k];
				}
				
				if(currentVal > maxVal){
					maxVal = currentVal;
				}
			}
		}
		return maxVal;
    }
	
	public static int maxSum2(int[] a){
		int maxVal = 0;
		
		for(int i = 0; i < a.length; i++){
			int currentVal = 0;
			
			for(int j = i; j < a.length; j++){
				currentVal += a[j];
				if(currentVal > maxVal){
					maxVal = currentVal;
				}
			}
		}
		return maxVal;
	}
	
	// 递归分治策略，时间复杂度O(nlogn)
	public static int maxSubSum3(int[] a){
		return maxSumRec(a, 0, a.length-1);
	}
	
	public static int maxSumRec(int[] a, int left, int right){
		// 递归结束条件
		if(left == right){
			if(a[left] > 0){
				return a[left];
			} else {
				return 0;
			}
		}
		
		int center = (left + right) / 2;
		
		// 最大子序列在left
		int maxLeftSum = maxSumRec(a, left, center);
		
		// 最大子序列在右侧
		int maxRightSum = maxSumRec(a, center + 1, right);
		
		int maxLeftBoderSum = 0, leftBoderSum = 0;
		for(int i = center; i >= left; i--){
			leftBoderSum += a[i];
			if(maxLeftBoderSum < leftBoderSum){
				maxLeftBoderSum = leftBoderSum;
			}
		}
		
		int maxRightBoderSum = 0, rightBoderSum = 0;
		for(int i = center+1; i <= right; i++){
			rightBoderSum += a[i];
			if(rightBoderSum > maxRightBoderSum){
				maxRightBoderSum = rightBoderSum;
			}
		}
		return max3(maxLeftBoderSum, maxRightBoderSum, maxLeftBoderSum + maxRightBoderSum);
	}
	
	public static int max3(int a, int b, int c){
		return a > b ? (a > c ? a : c) : (b > c ? b : c);
	}
	
	
	//  此方法的时间复杂度为O(n);任一子序列中的负数均不能作为最大子序列的首元素
	public static int maxSum4(int[] a){
		int maxVal = 0, currentVal = 0;
		for(int i = 0; i < a.length; i++){
			currentVal += a[i];
			if(currentVal > maxVal)
				maxVal = currentVal;
			else if (currentVal < 0)
				currentVal = 0;
		}
		return maxVal;
	}
}