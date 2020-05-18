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
