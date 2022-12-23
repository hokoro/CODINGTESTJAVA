import java.util.Arrays;

public class REVERSESTR {
    public static String solution(String s) {
        String answer = "";
        String[] token = s.split("");
        Arrays.sort(token);
        for(int i = s.length()-1 ; i>=0; i--){
            answer += token[i];
        }
        return answer;
    }
    public static void main(String[] args) {

    }
}
