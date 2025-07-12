public class Overloading {

    public static void main(String[] args) {
        //until the type or number of arguments are different for each function overloading is possible.

        fun(2); // this is 1st function calling
        fun("rahul"); // this is 2nd function calling
        fun(1,6); // this is 3rd function calling

    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }
    static void fun(int a,int b){
        System.out.print(a +" "+ b);
    }

}
