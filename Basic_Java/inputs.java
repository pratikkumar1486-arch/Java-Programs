import java.util.*;
public class inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for integers(primitive)
         System.out.print("Enter input : ");
         int roll = sc.nextInt();
         System.out.println("your roll is : "+roll);
        //for strings
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("your name is : "+name);
        // for float
        float marks = sc.nextFloat();
        System.out.println(marks);
    }
}
