package Level_1;

import java.util.Scanner;

public class Harshard_Number {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        // 사용자로부터 정수 입력 받기
        System.out.print("정수를 입력하세요: ");
        int x = scanner.nextInt();

        // 결과 출력
        System.out.println(solution.solution(x));

        scanner.close();
    }
}

class Solution {
    public boolean solution(int x) {
        // 자릿수의 합을 구하기 위한 변수 sum 초기화
        int sum = 0;
        int originalX = x; // 입력받은 정수를 보존하기 위한 변수

        // 자릿수의 합 구하기
        while (x > 0) {
            sum += x % 10; // 현재 자릿수를 더함
            x /= 10; // 다음 자릿수로 이동
        }

        // 원래의 수를 자릿수의 합으로 나누어 떨어지는지 확인
        return originalX % sum == 0;
    }
}