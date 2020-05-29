//https://app.codility.com/demo/results/trainingNBDR8S-N5V/
class Solution {
	public int[] solution(int N, int[] A) {
		int max = 0;
		int sumMax = 0;		
		
		int[] result = new int[N];
		for(int num : A) {
			if(num == N + 1)
				sumMax = max;
			else {
				if(result[num - 1] < sumMax)
					result[num - 1] = sumMax;
				
				
				result[num - 1] += 1;
				
				if(result[num - 1]  > max)
					max = result[num - 1];
			}
		}
		
		if(sumMax > 0) {
			for(int i = 0; i < result.length; i++) {
				if(result[i] < sumMax)
					result[i] = sumMax;
			}
		}
		
		return result;
	}
}
