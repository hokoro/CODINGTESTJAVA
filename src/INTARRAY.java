import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class INTARRAY {
    public static ArrayList<Integer> solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i = 0; i<arr.length;i++){
            if(arr[i] % divisor ==0){
                answer.add(arr[i]);
            }else{
                continue;
            }
        }
        if(answer.size() == 0){
            answer.add(-1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int divisor = scanner.nextInt();
        int [] arr = new int[count];
        ArrayList<Integer> answer;
        for(int i =0; i<count; i++){
            arr[i] = scanner.nextInt();
        }
        answer = solution(arr , divisor);
        for(int i =0; i<answer.size(); i++){
            System.out.print(answer.get(i) + " ");
        }

    }
}
