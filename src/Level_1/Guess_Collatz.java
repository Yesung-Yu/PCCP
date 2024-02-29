package Level_1;

import java.util.Scanner;

public class Guess_Collatz {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 정수 입력 받기
        System.out.print("정수를 입력하세요: ");
        long num = scanner.nextLong();

        Solution solution = new Solution();
        // 결과 출력
        System.out.println("작업을 몇 번 반복해야 하는지: " + solution.solution(num));

        scanner.close();
    }
}

class Solution {
    public int solution(long num) {
        int count = 0; // 작업 횟수를 저장할 변수

        // 주어진 수가 1이 될 때까지 반복
        while (num != 1) {
            // 주어진 수가 짝수인지 홀수인지 확인하여 작업 수행
            if (num % 2 == 0) {
                // 짝수인 경우
                num /= 2;
            } else {
                // 홀수인 경우
                num = num * 3 + 1;
            }

            count++; // 작업 횟수 증가

            // 작업을 500번 반복할 때까지 1이 되지 않는다면 -1 반환
            if (count == 500) {
                return -1;
            }
        }

        return count; // 작업 횟수 반환
    }
}