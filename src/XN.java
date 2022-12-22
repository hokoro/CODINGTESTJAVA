import java.util.Arrays;
import java.util.Scanner;

public class XN {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i = 0; i<n;i++){
            answer[i] = x+((long) i *x);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();

        long[] arr = solution(x,n);

        System.out.println(Arrays.toString(arr));


    }
}
