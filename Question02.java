
// https://app.codility.com/demo/results/trainingUSRB4R-7T5/

class Solution02 {
    public int[] solution(int[] A, int K) {
    	if(A.length == K)
    		return A;
    	
    	for(int i = 0; i < K; i++) {
    		int[] tmp = new int[A.length];
    		for(int j = 0; j < A.length; j++) 
    			tmp[j] = (j == 0) ? A[A.length-1] : A[j - 1];
    		A = tmp;
    	}
    	return A;
    }
}

public class Question02 {
    public static void main(String args[]){
    	Solution02 sol = new Solution02();
    	int[] A = {3, 8, 9, 7, 6};
    	int K = 3;
    	int[] result = sol.solution(A, K);
    	
    	for(int num : result)
    		System.out.println(num);
    }
}
