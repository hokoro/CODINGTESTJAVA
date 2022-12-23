public class MIDDLECHAR {
    public static String solution(String s) {
        String answer = "";
        String [] token = s.split("");
        int index = 0;
        if(s.length() % 2== 0){
            index = s.length()/2 -1;
            answer =  token[index] + token[index +1];
        }
        else {
            index = s.length() / 2;
            answer = token[index];
        }

        return answer;
    }
    public static void main(String[] args) {

    }
}
