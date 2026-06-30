package examples;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enet the numbers : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int max = a;
    if(b>max){
        b=max;
    }
    if(c>max){
        max=c;
    }
     System.out.println(max);
    }    
}
