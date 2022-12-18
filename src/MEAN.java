import java.util.Scanner;

public class MEAN {
    public static double solution(int[] arr){
        double answer = 0;

        for(int n : arr){
            answer += n;
        }

        return answer / arr.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int []arr = new int[count];

        for(int i = 0; i < count; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println(solution(arr));
    }
}
