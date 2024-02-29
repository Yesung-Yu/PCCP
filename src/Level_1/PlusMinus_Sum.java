package Level_1;

import java.util.Scanner;

public class PlusMinus_Sum {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 배열 입력 받기
        System.out.print("정수의 개수를 입력하세요: ");
        int n = scanner.nextInt();

        int[] absolutes = new int[n];
        boolean[] signs = new boolean[n];

        System.out.println("정수를 입력하세요:");
        for (int i = 0; i < n; i++) {
            absolutes[i] = scanner.nextInt();
        }

        System.out.println("각 정수의 부호를 입력하세요 (양수면 true, 음수면 false):");
        for (int i = 0; i < n; i++) {
            signs[i] = scanner.nextBoolean();
        }

        Solution solution = new Solution();
        // 결과 출력
        System.out.println("실제 정수들의 합: " + solution.solution(absolutes, signs));

        scanner.close();
    }
}

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        // 배열의 길이만큼 반복하면서 각 정수의 부호에 따라 합을 구함
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                // 부호가 양수인 경우 해당 정수를 더함
                sum += absolutes[i];
            } else {
                // 부호가 음수인 경우 해당 정수의 반대값을 더함
                sum -= absolutes[i];
            }
        }

        return sum;
    }
}