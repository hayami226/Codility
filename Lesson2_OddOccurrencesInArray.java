//https://app.codility.com/demo/results/trainingQMPU4Z-QCT/ 
import java.util.Arrays;
class Solution03 {
	public int solution(int[] A) {
		Arrays.sort(A);
		for(int i = 0; i < A.length; i = i + 2) {
			if(i == A.length - 1)
				return A[A.length - 1];
			if(A[i] != A[i + 1])
				return A[i];
		}
    	return -1;
    }
}
