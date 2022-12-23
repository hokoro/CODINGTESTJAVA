import java.util.ArrayList;
import java.util.Arrays;

public class DIVISORCOUNT {
    public static int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        while (left <right+1){
            count = 1;
            for(int i = 1; i<left; i++){
                if(left % i == 0){
                    count++;
                }
            }
            System.out.println("count: " + count);

            if(count % 2 ==0){
                System.out.println("짝수입니다: " + left);
                answer += left;
            }
            else{
                System.out.println("홀수입니다: " + (left * -1));
                answer -= left;
            }
            left++;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(13,17));
    }
}
