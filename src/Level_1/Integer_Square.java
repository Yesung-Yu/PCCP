package Level_1;

import java.util.Scanner;

public class Integer_Square {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Solution solution = new Solution();

	        // 사용자로부터 양의 정수 n 입력 받기
	        System.out.print("양의 정수 n을 입력하세요: ");
	        long n = scanner.nextLong();

	        // 결과 출력
	        System.out.println("결과: " + solution.solution(n));

	        scanner.close();
	    }
	}

	class Solution {
	    public long solution(long n) {
	        // n이 양의 정수 x의 제곱인지 확인하기 위해 제곱근을 구함
	        long sqrt = (long) Math.sqrt(n);

	        // n이 양의 정수 x의 제곱인지 판단
	        if (sqrt * sqrt == n) {
	            // 양의 정수 x의 제곱이라면 x+1의 제곱을 반환
	            return (sqrt + 1) * (sqrt + 1);
	        } else {
	            // 양의 정수 x의 제곱이 아니라면 -1을 반환
	            return -1;
	        }
	    }
	}
