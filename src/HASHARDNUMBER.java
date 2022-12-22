import java.util.Scanner;

public class HASHARDNUMBER {
    public static boolean solution(int x) {
        int len = (int) (Math.log10(x)+1);
        int num = x;
        int sum = 0;
        for(int i = 0; i<len; i++){
            sum += x / (int)Math.pow(10,len-i-1);
            x = x % (int)Math.pow(10,len-i-1);
        }

        if(num % sum !=0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(solution(x));
    }
}
