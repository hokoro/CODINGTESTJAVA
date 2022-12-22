import java.util.Scanner;

public class IntegerRoot {
    public static long solution(long n) {
        long answer = 0;
        double num = Math.sqrt(n);
        if(num-(int)num == 0){
            answer = (long) Math.pow(num+1,2);
            return answer;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        System.out.println(solution(n));
    }
}
