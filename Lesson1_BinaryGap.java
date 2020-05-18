//https://app.codility.com/demo/results/trainingNB29YA-NP9/
class Solution {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int max = 0;
        for(int i = 0; i < binary.length(); i++) {
        	String str = gerString(binary, i);
        	if(str.equals("1")) {
                boolean visible = false;
                int iCnt = 0;
        		for(int j = i; j < binary.length() - 1; j++) {
        			if(gerString(binary, j + 1).equals("0"))
        				iCnt++;
        			else {
        				visible = true;
        				break;
        			}
        		}
    			if(visible && max < iCnt) {
    				max = iCnt;
    			}
        	}
        }
        return max;
    }
    
    public String gerString(String str, int idx) {
    	return String.valueOf(str.charAt(idx));
    }
}
