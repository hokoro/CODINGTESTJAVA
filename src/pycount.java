import java.util.Scanner;

public class pycount {
    public static boolean solution(String s) {
        boolean answer = true;
        String []s_array = s.split("");
        int p = 0 , y = 0;

        for(int i = 0; i<s.length();i++){
            if(s_array[i].equals("p")||s_array[i].equals("P")){
                p++;
            }
            else if(s_array[i].equals("y")||s_array[i].equals("Y")){
                y++;
            }
            else{
                continue;
            }
        }

        if (p != y) {
            answer = false;
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(solution(s));
    }
}
