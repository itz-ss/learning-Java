import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // to print the char of a input string
//        char ch = sc.next().trim().charAt(0);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
