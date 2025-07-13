import java.util.Scanner;

public class loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // find greatest of 3 numbers
//        int d = (a>b && a>c)? a: ((b>c)? b:c);
        int d = Math.max(c,Math.max(a,b));
        System.out.println("greatest number is: " + d);
    }
}
