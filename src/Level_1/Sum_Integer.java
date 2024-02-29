package Level_1;

import java.util.Scanner;

public class Sum_Integer {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 정수 입력 받기
        System.out.print("두 정수를 입력하세요 (예: 3 5): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Solution solution = new Solution();
        // 결과 출력
        System.out.println("두 정수 사이의 합: " + solution.solution(a, b));

        scanner.close();
    }
}

class Solution {
    public long solution(int a, int b) {
        // a와 b 중에서 작은 수를 min, 큰 수를 max로 설정
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        // a와 b가 같은 경우 min을 반환
        if (a == b) {
            return a;
        }

        long sum = 0;
        // min부터 max까지의 모든 정수를 더함
        for (int i = min; i <= max; i++) {
            sum += i;
        }

        return sum;
    }
}