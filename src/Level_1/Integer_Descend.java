package Level_1;

import java.util.Arrays;

public class Integer_Descend {
	public static void main(String[] args) {
        Solution solution = new Solution();

        // 예시 테스트
        long n = 118372;
        System.out.println(solution.solution(n)); // 예상 결과: 873211
    }
}

class Solution {
    public long solution(long n) {
        // 자연수 n을 문자열로 변환하여 각 자릿수를 배열에 저장
        String str = Long.toString(n);
        char[] digits = str.toCharArray();

        // 각 자릿수를 큰 것부터 작은 순으로 정렬
        Arrays.sort(digits);

        // 정렬된 자릿수를 역순으로 결합하여 정수로 변환하여 반환
        StringBuilder sb = new StringBuilder();
        for (int i = digits.length - 1; i >= 0; i--) {
            sb.append(digits[i]);
        }

        return Long.parseLong(sb.toString());
    }
}