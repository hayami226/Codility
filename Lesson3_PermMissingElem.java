//https://app.codility.com/demo/results/trainingYXFUAF-H2N/
import java.util.Arrays;
class Solution05 {
    public int solution(int[] A) {
    	int len = A.length;
    	if(len == 0)
    		return 1;
    	
    	Arrays.sort(A);
    	
    	if(A[0] != 1)
    		return 1;
    	
    	if(A[len - 1] != len + 1)
    		return len + 1;
    	
    	for(int i = 1; i < len; i++) {
    		if(A[i] != i + 1)
    			return i + 1;
    	}
    	
    	return -1;
    }
}
