import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class REVERSEINTGER {
    public static long solution(long n) {
        long answer = 0;
        String num ="";
        String[] nums = String.valueOf(n).split("");
        Arrays.sort(nums, Collections.reverseOrder());

        for(int i = 0; i<nums.length;i++){
            num += nums[i];
        }
        answer = Long.valueOf(num);
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        System.out.println(solution(n));
    }
}
