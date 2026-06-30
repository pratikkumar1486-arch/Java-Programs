import java.util.*;

public class personalisedGreet {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter your name : ");
        String name = sc.nextLine();
        String personalised = mygreet(name);
        System.out.println(personalised);
    }
    static String mygreet(String name){
        String message = "Hello " + name;
        return message;
    }
}
