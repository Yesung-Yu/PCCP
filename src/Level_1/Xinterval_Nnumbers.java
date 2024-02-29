package Level_1;

public class Xinterval_Nnumbers {
	public static void main(String[] args) {
        // 테스트를 위한 코드
        int x = 2;
        int n = 5;
        long[] result = solution(x, n);

        // 결과 출력
        for (long num : result) {
            System.out.print(num + " ");
        }
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n]; // 결과를 저장할 배열 선언

        long num = x; // 시작 숫자를 저장할 변수 초기화
        for (int i = 0; i < n; i++) {
            answer[i] = num; // 현재 숫자를 배열에 저장
            num += x; // x씩 증가
        }

        return answer;
    }
}