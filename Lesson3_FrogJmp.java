//https://app.codility.com/demo/results/training6PFUEH-2QE/
class Solution04 {
    public int solution(int X, int Y, int D) {
        return (int)Math.ceil((double)(Y - X)/D);
    }
}

public class Lesson3_FrogJmp {
    public static void main(String args[]){
    	Solution04 sol = new Solution04();
    	System.out.println(sol.solution(10,85,30));
    }
}
