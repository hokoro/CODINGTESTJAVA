import java.util.Scanner;

public class TWOINTSUM {
    public static long solution(int a, int b) {
        long answer = 0;
        int temp = 0;
        if (a > b){
            temp = a;
            a = b;
            b = temp;
        }

        for(long i = a;i<b+1;i++){
            answer +=i;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt() , b = scanner.nextInt();
        System.out.println(solution(a,b));
    }
}
