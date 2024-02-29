package Level_1;

public class Replace_Integer {
	public static void main(String[] args) {
        Solution solution = new Solution();

        // 테스트를 위한 문자열 s
        String s1 = "123"; // 기댓값: 123
        String s2 = "-456"; // 기댓값: -456
        String s3 = "+789"; // 기댓값: 789

        // 결과 출력
        System.out.println(solution.solution(s1)); // 123
        System.out.println(solution.solution(s2)); // -456
        System.out.println(solution.solution(s3)); // 789
    }
}

class Solution {
    public int solution(String s) {
        // 부호를 제외한 숫자부분을 문자열로 추출
        String numStr = s.substring(s.startsWith("+") || s.startsWith("-") ? 1 : 0);

        // 문자열을 숫자로 변환
        int result = Integer.parseInt(numStr);

        // 부호에 따라 결과값 조정
        if (s.startsWith("-")) {
            result *= -1;
        }

        return result;
    }
}