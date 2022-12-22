import java.util.Scanner;

public class SEOULKIM {
    public static String solution(String[] seoul) {
        String answer = "";
        for(int i =0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + String.valueOf(i) + "에 있다";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] seoul = str.split("");

        System.out.println(solution(seoul));
    }
}
