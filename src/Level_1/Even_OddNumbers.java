import java.util.Scanner;

public class Even_OddNumbers {
    public String solution(int num) {
        String answer = num % 2 == 0 ? "Even" : "Odd";
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("정수를 입력하세요: ");
        int num = sc.nextInt();
        
        Even_OddNumbers s = new Even_OddNumbers();
        System.out.println(num + "\t" + s.solution(num));
        
        sc.close();
    }
}