import java.util.Scanner;

public class DIVIDE1 {
    public static int solution(int n) {
        int answer = 0;
        for(int i = 2; i<n;i++){
            if(n % i ==1){
                answer = i;
                break;
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
