class Solution08 {
    public int solution(int A, int B, int K) {
    	int result = B / K - A / K;
    	if(A % K == 0)
    		result++;
    	return result;
    }
}
