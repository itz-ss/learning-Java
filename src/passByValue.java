import java.util.Arrays;

public class passByValue {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.printf("print  of swap function%n a = %d ,b = %d%n" ,a,b);

        int[] arr = {1,2,3,4,5,6,7,78};
        arrchange(arr);
        System.out.println("print of main function : "+ Arrays.toString(arr));
    }

    static void arrchange(int[] arr) {
        arr[0] = 100;
        System.out.println("print of arrchange funtion: "+Arrays.toString(arr));
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b= temp;
        System.out.printf("print  of swap function%n a = %d ,b = %d%n" ,a,b );
    }
}
