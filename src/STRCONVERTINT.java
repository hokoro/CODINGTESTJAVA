import java.util.Scanner;

public class STRCONVERTINT {
    public static int solution(String s) {
        int answer = 0;
        String mark;
        String[] str = s.split("");
        mark = str[0];

        if(mark.equals("-")){
            answer = Integer.parseInt(s) * -1;
        }

        answer = Integer.parseInt(s);

        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(solution(s));
    }
}
