/**
 * 
 */

/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: dynamicProgram
 * date: 2019年10月17日
 */
public class dynamicProgram {
    // 最长公共子序列(的长度)
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String A = "1A2C3D4B56";
		String B = "B1D23CA45B6A";
		
		System.out.println(maxLengthOfCommonStrings(A, A.length(), B, B.length()));
    }
	
	public static int maxLengthOfCommonStrings(String s1, int n1, String s2, int n2){
		int dp[][] = new int[n1+1][n2+1];
		for(int i = 0; i < n1; i++){
			for(int j = 0; j < n2; j++){
				if(s1.charAt(i) == s2.charAt(j)){
					dp[i+1][j+1] = dp[i][j] + 1;
				} else{
					dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}
		}
		return dp[n1][n2];
	}
}
