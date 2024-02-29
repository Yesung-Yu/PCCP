package Level_1;

import java.util.*;

public class SmallestNum_Remove {
	 public static void main(String[] args) {
	        Sl solution = new Sl();

	        // 예시 테스트
	        int[] arr1 = {4, 3, 2, 1};
	        System.out.println(Arrays.toString(solution.solution(arr1))); // 예상 결과: [4, 3, 2]

	        int[] arr2 = {10};
	        System.out.println(Arrays.toString(solution.solution(arr2))); // 예상 결과: [-1]
	    }
	}

	class Sl {
	    public int[] solution(int[] arr) {
	        // 배열의 길이가 1인 경우 예외 처리
	        if (arr.length == 1) {
	            return new int[]{-1};
	        }

	        // 배열 복사 후 정렬
	        int[] sortedArr = Arrays.copyOf(arr, arr.length);
	        Arrays.sort(sortedArr);

	        // 가장 작은 수의 인덱스 찾기
	        int minIndex = 0;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == sortedArr[0]) {
	                minIndex = i;
	                break;
	            }
	        }

	        // 가장 작은 수를 제외한 배열 생성
	        int[] answer = new int[arr.length - 1];
	        for (int i = 0, j = 0; i < arr.length; i++) {
	            if (i != minIndex) {
	                answer[j++] = arr[i];
	            }
	        }

	        return answer;
	    }
	}
