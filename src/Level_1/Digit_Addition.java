package Level_1;

import java.util.Scanner;

public class Digit_Addition {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // 자연수 N 입력 받기
	        System.out.print("자연수 N을 입력하세요: ");
	        int N = scanner.nextInt();

	        // 결과 출력
	        int sum = calculateDigitSum(N);
	        System.out.println("N의 각 자릿수의 합: " + sum);

	        scanner.close();
	    }

	    // 각 자릿수의 합 계산하는 메서드
	    public static int calculateDigitSum(int n) {
	        int sum = 0;

	        // 각 자릿수의 합 계산
	        while (n > 0) {
	            sum += n % 10; // 현재 자릿수를 더함
	            n /= 10; // 다음 자릿수로 이동
	        }

	        return sum;
	    }
	}
