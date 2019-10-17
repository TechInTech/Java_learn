/**
 * 
 */

/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: longestCommonSubstring
 * date: 2019年10月17日
 */
public class longestCommonSubstring {
    // 最长公共子串
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String A = "helloworldmyhero";
        String B = "orlmyhero";
        
        lcs(A, B);
    }
    
    public static void lcs(String A, String B) {
        if(A == null || B == null) {
            return;
        }
        
        char[] charA = A.toCharArray();
        char[] charB = B.toCharArray();
        
        int lenA = charA.length;
        int lenB = charB.length;
        
        int[][] matrix = new int[lenA+1][lenB+1];
        
        for(int i = 1; i <= lenA; i++) {
            for(int j = 1; j <= lenB; j++) {
                if(charA[i - 1] == charB[j - 1]){
					matrix[i][j] = matrix[i-1][j-1] + 1;
				} 
            }
        }
		int maxLength = 0, end = 0;
		for(int i = 0; i <= lenA; i++){
			for(int j = 0; j <= lenB; j++){
				if(maxLength < matrix[i][j]){
					end = i;
					maxLength = matrix[i][j];
				}
			}
		}
		
		System.out.println(maxLength);
		System.out.println(A.subSequence(end - maxLength, end));
    }

}
