import java.util.*;

public class sum {
    public static void main(String[] args) {
        
        int ans = add();
        System.out.println("the sum is : "+ ans);
    }
    // static void sum(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a num 1 : ");
    //     int num1 = sc.nextInt();
    //      System.out.print("Enter a num 2 : ");
    //     int num2 = sc.nextInt();
    //     int sum = num1 + num2 ;
    //     System.out.print("the sum is : "+ sum);
    // }
    static int add(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num 1 : ");
        int num1 = sc.nextInt();
         System.out.print("Enter a num 2 : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2 ;
       return sum;
    }
    }
