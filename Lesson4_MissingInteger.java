//https://app.codility.com/demo/results/trainingT8R2GS-4N4/
import java.util.*;
class Solution09 {
	public int solution(int[] A) {
		Arrays.sort(A);		
		if(Arrays.binarySearch(A, 1) < 0)
			return 1;
		
		for(int i = 0; i < A.length - 1; i++) {		
			if(A[i] < 0 || A[i] == A[i + 1] || A[i] + 1 == A[i + 1])
				continue;
				
			return A[i] + 1;
		}		
		return A[A.length - 1] + 1;
	}
}
