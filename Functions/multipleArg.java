import java.util.*;
public class multipleArg {
    public static void main(String[] args) {
        multiple(2,3,"Pratik","Kunal","Rahul");
    }
    static void multiple(int a , int b, String ...v){
        System.out.println("a = "+a + " b = "+b);
        System.out.println(Arrays.toString(v));
    }
}
