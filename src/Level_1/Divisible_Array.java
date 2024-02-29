package Level_1;

import java.util.*;

public class Divisible_Array {
	public static void main(String[] args) {
        Solution solution = new Solution();

        // 예시 테스트
        int[] arr1 = {5, 9, 7, 10};
        int divisor1 = 5;
        printArray(solution.solution(arr1, divisor1)); // 예상 결과: [5, 10]

        int[] arr2 = {2, 36, 1, 3};
        int divisor2 = 1;
        printArray(solution.solution(arr2, divisor2)); // 예상 결과: [1, 2, 3, 36]

        int[] arr3 = {3, 2, 6};
        int divisor3 = 10;
        printArray(solution.solution(arr3, divisor3)); // 예상 결과: [-1]
    }

    // 배열 출력을 위한 메서드
    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> resultList = new ArrayList<>();

        // divisor로 나누어 떨어지는 값을 찾아 resultList에 추가
        for (int num : arr) {
            if (num % divisor == 0) {
                resultList.add(num);
            }
        }

        // resultList가 비어있다면 -1을 담은 배열을 반환
        if (resultList.isEmpty()) {
            return new int[]{-1};
        }

        // resultList를 오름차순으로 정렬
        Collections.sort(resultList);

        // 결과 배열에 resultList의 값을 복사
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }

        return answer;
    }
}