import java.util.*;


public class Question_1{
    public static int addition(int a,int b){
        return a+b;
    }
    public static int subtraction(int a,int b){
        return a-b;
    }
    public static void main(String[] args){
        Scanner IN = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = IN.nextInt();
        System.out.println("Enter number 2: ");
        int b = IN.nextInt();
        int add = addition(a,b);
        System.out.println("Addition of two number is : " + add);
        int sub = subtraction(a,b);
        System.out.println("Subtraction of two number is : "+ sub);
    }
}