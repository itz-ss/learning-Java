import java.util.Scanner;

public class switch_case{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
//better way to write switch case
        switch (empID) {
            case 1 -> System.out.println("kush");
            case 2 -> System.out.println("ConditionsAndLoop");
            case 3 -> {
                System.out.println("employee no. 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "management" -> System.out.println("Management department");
                    default -> System.out.println("no department");
                }
            }
            default -> System.out.println("no employee");
        }
    }
}
