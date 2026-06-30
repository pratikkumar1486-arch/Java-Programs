
public class swap {
    public static void main(String[] args) {
        int a = 20 ;
        int b = 30;
        swap(a,b);
        
    }
    static void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.print("a : "+ a +" b : "+b);
    }
}
