package Level_1;

import java.util.*;

public class Sum_WithoutNum {
	public static void main(String[] args) {
        Solution solution = new Solution();

        // 예시 테스트 케이스
        int[] numbers1 = {1, 2, 3, 4, 6, 7, 8, 0};
        int[] numbers2 = {5, 8, 4, 0, 6, 7, 9};

        System.out.println("첫 번째 테스트 케이스 결과: " + solution.solution(numbers1)); // 예상 결과: 14
        System.out.println("두 번째 테스트 케이스 결과: " + solution.solution(numbers2)); // 예상 결과: 6
    }
}

class Solution {
    public int solution(int[] numbers) {
        int answer = 45; // 0부터 9까지의 숫자의 합

        // 주어진 배열의 각 숫자를 확인하여 빠진 숫자를 찾아 합산
        for (int num : numbers) {
            answer -= num;
        }

        return answer;
    }
}