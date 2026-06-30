import java.util.*;

public class fruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter any fruit : ");
         String fruit = sc.next();
         switch (fruit){
             case "Mango" :
                 System.out.println("King of fruits.");
                 break;
             case " Apple" :
                 System.out.println("A red sweet fruit.");
                 break;
             case "Grapes" :
                 System.out.println("A green small fruit.");
                 break;
             case "watermellon" :
                 System.out.println("A gaint watery fruit.");
                 break;
                 default : 
                 System.out.println("Enter a valid fruit.");
         }
        // ANOTHER METHOD OF SWITCH CASE!!
        System.out.println("Enter a day : ");
        int day = sc.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day!!");
        }
    }
}