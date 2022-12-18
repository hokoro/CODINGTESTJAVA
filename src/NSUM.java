import java.util.Scanner;

public class NSUM {
    public static  int solution(int n){
        int answer = 0;
        int len = (int)(Math.log10(n)+1); // 자연수의 자릿수를 알아내는 방법

        for(int i = 0; i < len; i++){
            answer += n / Math.pow(10 , len - (i+1));
            n = (int) (n % Math.pow(10 , len - (i+1)));
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(solution(n));


    }
}
