import java.util.*;
public class  ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary : ");
        float salary = sc.nextFloat();
        if(salary>10000){
        salary = salary+2000;
        }
        else{
           salary = salary+1000;
        }
        System.out.println(salary);
    }
}
