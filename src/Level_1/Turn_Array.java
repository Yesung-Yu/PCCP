package Level_1;

import java.util.*;

public class Turn_Array {
	public static void main(String[] args) {
        Solution solution = new Solution();

        // 예시 테스트
        long n = 12345;
        int[] result = solution.solution(n);

        // 결과 출력
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

class Solution {
    public int[] solution(long n) {
        // 자릿수 구하기
        int length = Long.toString(n).length();
        int[] answer = new int[length]; // 결과를 저장할 배열 선언

        // 각 자릿수를 배열에 저장 (뒤에서부터)
        for (int i = length - 1; i >= 0; i--) {
            answer[length - 1 - i] = (int)(n % 10);
            n /= 10;
        }

        return answer;
    }
}

