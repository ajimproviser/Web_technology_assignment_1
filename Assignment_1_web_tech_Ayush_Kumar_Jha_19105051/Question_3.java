import java.util.*;

public class Question_3 {
    public static void main(String[] args) {
        Scanner IN = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = IN.nextInt();
        System.out.println("Enter number 2: ");
        int b = IN.nextInt();

        int quotient = a/b;
        int remainder = a%b;

        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);

    }
}
