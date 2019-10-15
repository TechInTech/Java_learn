/**
 * 
 */

/**
 * @author DELL
 * Project Name: Java_learn
 * Class Name: cut_stamp
 * date: 2019年9月1日{time}
 */
public class cut_stamp {

    /**
     * @param args
     */
    public static int count = 0;
    public static int cut[] = new int[5];
    public static int isVisit[] = new int[5];
    public static int b[] = {+1, -1, +5, -5};
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int stamp[] = new int[12];
        
        for (int i=1, k=1; i <= 12; i++) {
            stamp[i-1] = k++;
            if(i%4 == 0) {
                k++;
            }
        }
        
        for (int a = 0; a < 12; a++) {
            for (int b = a+1; b < 12; b++) {
                for (int c = b+1; c < 12; c++) {
                    for (int d = c+1; d < 12; d++) {
                        for (int e = d + 1; e < 12; e++) {
                            cut[0] = stamp[a];
                            cut[1] = stamp[b];
                            cut[2] = stamp[c];
                            cut[3] = stamp[d];
                            cut[4] = stamp[e];
                            for(int i = 0; i < 5; i++) {
                                isVisit[i] = 0;
                            }
                            isVisit[0] = 1;
                            
                            find(0);
                            int flag = 1;
                            for(int j = 0; j < 5; j++) {
                                if (isVisit[j] == 0) {
                                    flag = 0;
                                    break;
                                }
                            }
                            if(flag == 1) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static void find(int index) {
        for(int i = 0; i < 4; i++) {
            int temcut = cut[index] + b[i];
            if(temcut < 1 || temcut > 14 || temcut == 5 || temcut == 10) {
                continue;
            }
            for(int k = 0; k < 5; k++) {
                if(isVisit[k] == 0 && cut[k] == temcut) {
                    isVisit[k] = 1;
                    find(k);
                }
            }
        }
    }

}
