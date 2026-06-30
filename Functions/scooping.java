import java.util.*;
public class scooping {
    public static void main(String[] args) {
        //scooping means changing value inside the box in a function
        //and can be used outside the box 
        //But cannot be re-intialized in the box
        //and the new intialized inside the box cannot be used outside the box
        int a =34;
        int b =45;
        {                            //BOX
            a = 45;
            b = 60;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
