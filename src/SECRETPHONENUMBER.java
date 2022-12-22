import java.util.Scanner;

public class SECRETPHONENUMBER {
    public static String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        String []phone = phone_number.split("");
        for(int i = 0; i<len;i++){
            if(len-i>4){
                answer += "*";
            }
            else{
                answer += phone[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phone_number = scanner.nextLine();

        System.out.println(solution(phone_number));
    }
}
