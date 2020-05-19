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

public class Lesson2_OddOccurrencesInArray {
    public static void main(String args[]){
    	Solution03 sol = new Solution03();
    	int[] A = {1,1,11,2,2,3,7,8,3,7,8,9,7,13,9,7,6,5,6,5,4,3,4,3,11};
    	System.out.println(sol.solution(A));
    }
}
