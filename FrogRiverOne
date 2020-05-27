//https://app.codility.com/demo/results/training7U44J8-7ZM/
import java.util.HashSet;
class Solution07 {
    public int solution(int X, int[] A) {
    	HashSet<Integer> set = new HashSet<Integer>();
    	for(int i = 1; i < X + 1; i++)
    		set.add(i);
    	
    	for(int i = 0; i < A.length; i++) {
    		if( set.contains(A[i]) )
    			set.remove(A[i]);
    		else
    			continue;
    		
    		if(set.size() == 0)
    			return i;    		
    	}
    	return -1;
    }
}
