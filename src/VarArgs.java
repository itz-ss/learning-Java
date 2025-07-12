import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,3,44,55,66,77,88);// this is called variable length argument. we can give any length argument in parameter

        multiple(1,30,"RAHUL","YASH", "YOM", "ROHAN");// the sequence of writing parameters
        // should match exactly as it is defined in function declaration otherwise it'll show error

        int ans = sum(1,2,3,4,5,6,7,8,9,9,9,99,99,99,999);
        System.out.println("total is = " +ans);

    }

    static void fun(int...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String...s){
        System.out.printf("Values: a = %d, b = %d, Strings: %s%n", a, b, Arrays.toString(s));
    }

    static int sum(int...s){
        int total = 0;
        for(int num : s){
            total += num;
        }
        return total;
    }
}
