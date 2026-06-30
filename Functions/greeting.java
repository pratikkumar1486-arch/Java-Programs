import java.util.*;

public class greeting {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }
    static String greet(){
        Scanner sc = new Scanner(System.in);
        String greeting = sc.nextLine();
        return greeting;
    }
}
