package Level_1;

public class Average {

	static class Solution {
	    public double solution(int[] arr) {
	        double sum = 0;
	        for (int num : arr) {
	            sum += num;
	        }
	        double average = sum / arr.length;
	        return average;
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();
	        int[] arr = {1, 2, 3, 4, 5};
	        System.out.println(solution.solution(arr));
	    }
	}
}
