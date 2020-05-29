//https://app.codility.com/demo/results/trainingDEPWJG-KPD/
import java.util.*;
class Solution03 {
	public int solution(int[] A) {
		Arrays.sort(A);		
		for(int i = 0; i < A.length; i++) {
			if(A[i] != i + 1)
				return 0;
		}
		return 1;
	}
}
