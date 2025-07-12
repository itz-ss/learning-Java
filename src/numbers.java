import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("give a number to check if it's a prime number or not");
        System.out.println("upto which number would you like to check if it,s armstrong or not?");
        int n = in.nextInt();
        // find if nuber is prime?
//        System.out.println( isPrime(n) );
        for(int i = 1; i <= n; i++){

             if( checkArmstrong(i) ){
                 System.out.println( i);
             }
        }

    }
// prime number
    static boolean isPrime(int n) {
    if(n<=1){
        return false;
    }
    int c=2;
    while(c*c <= n){
        if(n % c == 0){
            return false;
        }
        c++;
    }
    return c * c > n;
    }
// print armstrong or not
    static boolean checkArmstrong(int n){
        int origin = n;
        int sum = 0;

        while(n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem * rem * rem;
        }
        return origin == sum;
    }

}
