package Level_1;

public class Internal {
	public static void main(String[] args) {
        Sl solution = new Sl();

        // 예시 테스트
        int[] a1 = {1, 2, 3, 4};
        int[] b1 = {-3, -1, 0, 2};
        System.out.println(solution.solution(a1, b1)); // 예상 결과: 3

        int[] a2 = {-1, 0, 1};
        int[] b2 = {1, 0, -1};
        System.out.println(solution.solution(a2, b2)); // 예상 결과: -2
    }
}

class Sl {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        // 배열 a와 b의 내적 계산
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }
}