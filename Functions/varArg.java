import java.util.*;
public class varArg {
    public static void main(String[] args) {
        // Variable aragumentS !!
        fun(2,3,4,5,6,7,8,7);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
