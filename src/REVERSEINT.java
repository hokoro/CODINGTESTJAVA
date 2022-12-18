import java.util.Scanner;

public class REVERSEINT {
    public static int[] solution(long n) {
        int len = (int)(Math.log10(n)+1);
        int[] answer = new int[len];
        for(int i = 0; i<len; i++){
            answer[len - (i+1)] = (int) (n / Math.pow(10 , len - (i+1)));
            n = (long) (n % Math.pow(10 , len - (i+1)));
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long n = scanner.nextLong();
        int [] answer = {};

        answer = solution(n);

        for(int num : answer){
            System.out.print(num);
        }
    }
}
