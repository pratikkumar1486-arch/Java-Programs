import java.util.*;
public class nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int EmpID = sc.nextInt();
        
        switch(EmpID){
            case 1 -> System.out.println("mechanical Department");
            case 2 -> System.out.println("chemical department");
            case 3 -> System.out.println("IT department");
            case 4 -> {
                System.out.println("EmpID 4 : ");
                String department = sc.next();
                switch(department){
                    case "IT" -> System.out.println("IT Department");
                    case "CSE" -> System.out.println("CSE Department");
                    default -> System.out.println("Invalid Department");
                }
            }
        }
    }
}
