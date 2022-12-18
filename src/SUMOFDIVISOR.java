import java.util.Scanner;

public class SUMOFDIVISOR {
    public static int solution(int n){
        int answer = 0;

        for(int i = 1;i<=n;i++){
            if (n % i ==0){
                answer += i;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(solution(n));
    }
}
