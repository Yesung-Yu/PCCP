package Level_1;

public class Find_Kim {
	 public static void main(String[] args) {
	        Solution solution = new Solution();

	        // 예시 테스트
	        String[] seoul1 = {"Jane", "Kim"};
	        System.out.println(solution.solution(seoul1)); // 예상 결과: 김서방은 1에 있다
	    }
	}

	class Solution {
	    public String solution(String[] seoul) {
	        int index = -1;

	        // "Kim"이 있는 위치 찾기
	        for (int i = 0; i < seoul.length; i++) {
	            if (seoul[i].equals("Kim")) {
	                index = i;
	                break;
	            }
	        }

	        return "김서방은 " + index + "에 있다";
	    }
	}