import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // take input of two number and put the sum
//        Scanner in = new Scanner(System.in);
//        System.out.print("input number one");
//        int num1 = in.nextInt();
//        System.out.print("input number two");
//        int num2 = in.nextInt();
//        System.out.print("The Sum =" + (num1+num2)); //same answer will concatenate if we remove inner brackets i.e. instead of writing like +(a+b) we write like + a+b

//        sum();

//        float ans = sum2();  //type conversion, answer will be in decimal
//        System.out.println(ans);

//        int ans = sum3(20,60);
//        System.out.println(ans);

//        Scanner in = new Scanner(System.in);
//        System.out.println("please enter your name for greeting");
//        String name = in.next();
//        String personalized = myGreet(name);
//        System.out.println(personalized);

//        swap(10,30);

          int a = 10;
          int b = 20;
          swap(a, b);
        System.out.println(a+ " = a , b = " +b);
          //both of the upper cases can swap now
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b= temp;
        System.out.println(a+ " = a , b = " +b);
    }


    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    //we'll write same code in method with no return type
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("input number one");
        int num1 = in.nextInt();
        System.out.print("input number two");
        int num2 = in.nextInt();
        System.out.print("The Sum =" + (num1 + num2)); //same answer will concatenate if we remove inner brackets i.e. instead of writting like +(a+b) we write like + a+b
    }

    //we'll write same code in method with return type
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("input number one");
        int num1 = in.nextInt();
        System.out.print("input number two");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    //pass value when calling function in main
    static  int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
}