package Level_1;

import java.util.Scanner;

public class Py_count {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 문자열 입력 받기
        System.out.print("문자열 s를 입력하세요: ");
        String s = scanner.nextLine();

        // 'p'와 'y'의 개수 비교 후 결과 출력
        boolean result = solution(s);
        System.out.println(result);

        scanner.close();
    }

    public static boolean solution(String s) {
        // 문자열 s에서 'p'와 'y'의 개수를 세기 위한 변수 초기화
        int countP = 0;
        int countY = 0;

        // 대소문자 구분 없이 문자열을 순회하면서 'p'와 'y'의 개수를 센다
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'p' || ch == 'P') {
                countP++;
            } else if (ch == 'y' || ch == 'Y') {
                countY++;
            }
        }

        // 'p'와 'y'의 개수 비교 후 결과 반환
        return countP == countY;
    }
}

