import java.util.Scanner;

public class Sum_of_Divisors {
    public int sumDivisor(int num) {
        int answer = 0;
        for(int i =1 ; i<=num/2;i++){
        	if(num%i==0){
        		answer+=i;
        	}
        }
        return answer+num;
    }

    //  출력 코드
    public static void main(String[] args) {
    	Sum_of_Divisors c = new Sum_of_Divisors();
        System.out.println(c.sumDivisor(12));
    }
}