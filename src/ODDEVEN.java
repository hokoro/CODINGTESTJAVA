import java.util.Scanner;

public class ODDEVEN {
    public static String solution(int num){
        if(num%2 ==0){
            return "Even";
        }
        return "Odd";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(solution(num));
     }
}
