//https://app.codility.com/demo/results/trainingT5F5HH-2BN/
import java.util.*;
class Solution06 {
    public int solution(int[] A) {
    	if(A.length == 0)
    		return 0;
    	
    	int sum = 0;
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	for(int i = 0; i < A.length; i++) {
    		arr.add(A[i]);
    		sum += A[i];
    	}
    	
    	int min = 0;
    	int minSum = 0;
    	for(int i = arr.size() - 1; i > 0; i--) {
    		minSum += arr.get(i);
    		int result = Math.abs((sum - minSum) - minSum);
    		if(i == arr.size() - 1) 
    			min = result;
    		else if(min > result) 
    			min = result;
    	}
    	
    	return min;
    }
}
