import java.util.*;

public class Question_4 {
    public static void Swap_using_temp(int a,int b){
        int t = a;
        a = b;
        b = t;
        System.out.println("The number 1 is: " + a);
        System.out.println("The number 2 is: " + b);
    }
    public static void Swap_without_using_temp(int a,int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("The number 1 is: " + a);
        System.out.println("The number 2 is: " + b);
    }
    public static void main(String[] args) {
        Scanner IN = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = IN.nextInt();
        System.out.println("Enter number 2: ");
        int b = IN.nextInt();

        System.out.println("Enter 0 to swap using temporary var and 1 without temporary var: ");
        

        int c = IN.nextInt();
        if(c==0){
            Swap_using_temp(a, b);
        }else{
            Swap_without_using_temp(a, b);
        }
        
    }
}
