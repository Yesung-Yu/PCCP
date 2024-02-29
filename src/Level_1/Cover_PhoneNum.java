package Level_1;

public class Cover_PhoneNum {
	public static void main(String[] args) {
        Solution solution = new Solution();

        // 예시 테스트
        String phoneNumber1 = "01033334444";
        System.out.println(solution.solution(phoneNumber1)); // 예상 결과: *******4444

        String phoneNumber2 = "027778888";
        System.out.println(solution.solution(phoneNumber2)); // 예상 결과: *****8888
    }
}

class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();

        // 전화번호의 길이에서 뒤에서 4자리를 제외한 만큼 '*'을 추가
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer.append("*");
        }

        // 전화번호의 뒷 4자리를 추가
        answer.append(phone_number.substring(phone_number.length() - 4));

        return answer.toString();
    }
}