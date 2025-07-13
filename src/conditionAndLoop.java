import java.util.Scanner;

public class conditionAndLoop {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("print salary:");
        float salary = s.nextInt();
        if ( salary > 10000 ){
            salary = salary +2000;
        }
        else {
            salary = salary + 1000;
        }
        System.out.println(salary);
    }
}
